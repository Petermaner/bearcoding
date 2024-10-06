package com.github.bearcoding.forum.test.dao;

import com.github.bearcoding.forum.test.BasicTest;
import com.github.bearcoding.forum.service.user.service.UserService;
import com.github.bearcoding.forum.api.model.vo.user.dto.UserStatisticInfoDTO;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author YiHui
 * @date 2022/7/20
 */
@Slf4j
public class UserDaoTest extends BasicTest {

    @Autowired
    private UserService userService;

    @Test
    public void testUserHome() throws Exception {
        UserStatisticInfoDTO userHomeDTO = userService.queryUserInfoWithStatistic(1L);
        log.info("query userPageDTO: {}", userHomeDTO);
    }
}
