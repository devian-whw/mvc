package com.scut.bj.wwh.test;

import com.scut.bj.wwh.web.MvcWebApplication;
import com.scut.bj.wwh.web.dao.UserDOMapper;
import com.scut.bj.wwh.web.domain.UserDO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author wangwenhao06@meituan.com
 * @create 2020-06-30 下午8:23
 **/
@RunWith(SpringRunner.class)
@SpringBootTest(classes = MvcWebApplication.class)
public class DaoUnitTest {

    @Autowired
    private UserDOMapper userDOMapper;


    @Test
    public void testInsert() {
        UserDO userDO = new UserDO();
        userDO.setAge(26);
        userDO.setPassword("test12345");
        userDO.setUsername("test1");
        int res = userDOMapper.insertSelective(userDO);
        System.out.println(res);
    }

}
