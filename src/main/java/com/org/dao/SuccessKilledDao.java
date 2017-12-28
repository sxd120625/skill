package com.org.dao;

import com.org.entity.Successkilled;
import org.apache.ibatis.annotations.Param;

/**
 * Created by Administrator on 2016/8/24.
 */
public interface SuccessKilledDao {
    /**
     * 插入购买明细，可过滤重复
     * @param seckillId
     * @param userPhone
     * @return
     * 插入的行数
     */
    int insertSuccessKilled(@Param("seckillId") long seckillId, @Param("userPhone") long userPhone);

    /**
     * 查询SuccessKilled 并携带秒杀产品对象实体
     * @param seckillId
     * @return
     */
    Successkilled queryByIdWithSeckill(@Param("seckillId") long seckillId,@Param("userPhone") long userPhone);
}
