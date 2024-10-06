package com.github.bearcoding.forum.web.admin.rest;

import com.github.bearcoding.forum.api.model.enums.user.UserAIStatEnum;
import com.github.bearcoding.forum.api.model.vo.PageVo;
import com.github.bearcoding.forum.api.model.vo.ResVo;
import com.github.bearcoding.forum.api.model.vo.user.SearchZsxqUserReq;
import com.github.bearcoding.forum.api.model.vo.user.ZsxqUserBatchOperateReq;
import com.github.bearcoding.forum.api.model.vo.user.ZsxqUserPostReq;
import com.github.bearcoding.forum.api.model.vo.user.dto.ZsxqUserInfoDTO;
import com.github.bearcoding.forum.core.permission.Permission;
import com.github.bearcoding.forum.core.permission.UserRole;
import com.github.bearcoding.forum.service.user.service.ZsxqWhiteListService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 作者白名单服务
 *
 *
 *
 */
@RestController
@Api(value = "星球用户白名单管理控制器", tags = "星球白名单")
@Permission(role = UserRole.ADMIN)
@RequestMapping(path = {"api/admin/zsxq/whitelist"})
public class ZsxqWhiteListController {
    @Autowired
    private ZsxqWhiteListService zsxqWhiteListService;

    @ApiOperation("获取知识星球白名单用户列表")
    @PostMapping(path = "")
    public ResVo<PageVo<ZsxqUserInfoDTO>> list(@RequestBody SearchZsxqUserReq req) {
        PageVo<ZsxqUserInfoDTO> articleDTOPageVo = zsxqWhiteListService.getList(req);
        return ResVo.ok(articleDTOPageVo);
    }

    // 改变用户状态，审核通过
    @ApiOperation("改变用户状态")
    @GetMapping(path = "operate")
    public ResVo<String> operate(@RequestParam(name = "id") Long id,
                                  @RequestParam(name = "status") Integer status) {
        UserAIStatEnum operate = UserAIStatEnum.fromCode(status);
        zsxqWhiteListService.operate(id, operate);
        return ResVo.ok();
    }

    @Permission(role = UserRole.ADMIN)
    @GetMapping(path = "reset")
    public ResVo<String> reset(@RequestParam(name = "authorId") Integer authorId) {
        zsxqWhiteListService.reset(authorId);
        return ResVo.ok();
    }

    // 批量审核通过
    @ApiOperation("批量审核通过")
    @PostMapping(path = "batchOperate")
    public ResVo<String> batchOperate(@RequestBody ZsxqUserBatchOperateReq req) {
        UserAIStatEnum operate = UserAIStatEnum.fromCode(req.getStatus());
        zsxqWhiteListService.batchOperate(req.getIds(), operate);
        return ResVo.ok();
    }

    @PostMapping(path = "save")
    public ResVo<String> save(@RequestBody ZsxqUserPostReq req) {
        zsxqWhiteListService.update(req);
        return ResVo.ok();
    }
}
