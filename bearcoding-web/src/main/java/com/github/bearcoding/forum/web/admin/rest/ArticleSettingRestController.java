package com.github.bearcoding.forum.web.admin.rest;

import com.github.bearcoding.forum.api.model.context.ReqInfoContext;
import com.github.bearcoding.forum.api.model.enums.OperateArticleEnum;
import com.github.bearcoding.forum.api.model.vo.PageVo;
import com.github.bearcoding.forum.api.model.vo.ResVo;
import com.github.bearcoding.forum.api.model.vo.article.ArticlePostReq;
import com.github.bearcoding.forum.api.model.vo.article.SearchArticleReq;
import com.github.bearcoding.forum.api.model.vo.article.dto.ArticleAdminDTO;
import com.github.bearcoding.forum.api.model.vo.article.dto.ArticleDTO;
import com.github.bearcoding.forum.api.model.vo.article.dto.SimpleArticleDTO;
import com.github.bearcoding.forum.api.model.vo.constants.StatusEnum;
import com.github.bearcoding.forum.core.permission.Permission;
import com.github.bearcoding.forum.core.permission.UserRole;
import com.github.bearcoding.forum.core.util.NumUtil;
import com.github.bearcoding.forum.service.article.service.ArticleReadService;
import com.github.bearcoding.forum.service.article.service.ArticleSettingService;
import com.github.bearcoding.forum.service.article.service.ArticleWriteService;
import com.github.bearcoding.forum.web.front.search.vo.SearchArticleVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 文章后台
 *
 *
 *
 */
@RestController
@Permission(role = UserRole.LOGIN)
@Api(value = "文章设置管理控制器", tags = "文章管理")
@RequestMapping(path = {"/api/admin/article/", "/admin/article/"})
public class ArticleSettingRestController {

    @Autowired
    private ArticleSettingService articleSettingService;

    @Autowired
    private ArticleReadService articleReadService;

    @Autowired
    private ArticleWriteService articleWriteService;

    @Permission(role = UserRole.ADMIN)
    @PostMapping(path = "save")
    public ResVo<String> save(@RequestBody ArticlePostReq req) {
        if (NumUtil.nullOrZero(req.getArticleId())) {
            // 新增文章
            this.articleWriteService.saveArticle(req, ReqInfoContext.getReqInfo().getUserId());
        } else {
            this.articleWriteService.saveArticle(req, null);
        }
        return ResVo.ok();
    }

    @Permission(role = UserRole.ADMIN)
    @PostMapping(path = "update")
    public ResVo<String> update(@RequestBody ArticlePostReq req) {
        articleSettingService.updateArticle(req);
        return ResVo.ok();
    }

    @Permission(role = UserRole.ADMIN)
    @GetMapping(path = "operate")
    public ResVo<String> operate(@RequestParam(name = "articleId") Long articleId, @RequestParam(name = "operateType") Integer operateType) {
        OperateArticleEnum operate = OperateArticleEnum.fromCode(operateType);
        if (operate == OperateArticleEnum.EMPTY) {
            return ResVo.fail(StatusEnum.ILLEGAL_ARGUMENTS_MIXED, operateType + "非法");
        }
        articleSettingService.operateArticle(articleId, operate);
        return ResVo.ok();
    }


    @Permission(role = UserRole.ADMIN)
    @GetMapping(path = "delete")
    public ResVo<String> delete(@RequestParam(name = "articleId") Long articleId) {
        articleSettingService.deleteArticle(articleId);
        return ResVo.ok();
    }

    // 根据文章id获取文章详情
    @ApiOperation("根据文章id获取文章详情")
    @GetMapping(path = "detail")
    public ResVo<ArticleDTO> detail(@RequestParam(name = "articleId", required = false) Long articleId) {
        ArticleDTO articleDTO = new ArticleDTO();
        if (articleId != null) {
            // 查询文章详情
            articleDTO = articleReadService.queryDetailArticleInfo(articleId);
        }

        return ResVo.ok(articleDTO);
    }

    @ApiOperation("获取文章列表")
    @PostMapping(path = "list")
    public ResVo<PageVo<ArticleAdminDTO>> list(@RequestBody SearchArticleReq req) {
        PageVo<ArticleAdminDTO> articleDTOPageVo = articleSettingService.getArticleList(req);
        return ResVo.ok(articleDTOPageVo);
    }

    @ApiOperation("文章搜索")
    @GetMapping(path = "query")
    public ResVo<SearchArticleVo> queryArticleList(@RequestParam(name = "key", required = false) String key) {
        List<SimpleArticleDTO> list = articleReadService.querySimpleArticleBySearchKey(key);
        SearchArticleVo vo = new SearchArticleVo();
        vo.setKey(key);
        vo.setItems(list);
        return ResVo.ok(vo);
    }

}
