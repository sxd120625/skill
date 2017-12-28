package com.org.dao;

import com.org.entity.Successkilled;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2016/8/25.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class SuccessKilledDaoTest {
    @Resource
    private SuccessKilledDao successKilledDao;
    @Test
    public void insertSuccessKilled() throws Exception {
        /**
         * 第一次输出：insertCount=1
         * 第二次输出：insertCount=0
         */
        long id=1001L;
        long phone=18362988857L;
        int insertCount=successKilledDao.insertSuccessKilled(id,phone);
        System.out.println("insertCount="+insertCount);

    }

    @Test
    public void queryByIdWithSeckill() throws Exception {
        long id=1001L;
        long phone=18362988857L;
        Successkilled successkilled=successKilledDao.queryByIdWithSeckill(id,phone);
        System.out.println(successkilled);
        System.out.println(successkilled.getSeckill());
    }

}