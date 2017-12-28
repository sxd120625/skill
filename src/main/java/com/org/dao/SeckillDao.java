package com.org.dao;

import com.org.entity.Seckill;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.ognl.ObjectArrayPool;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/8/24.
 */
public interface SeckillDao {
	
    /**
     *减库存
     * @param seckillId
     * @param killTime
     * @return如果影响行数>1,表示更新的记录行数
     */
    int reduceNumber(@Param("seckillId") long seckillId,@Param("killTime") Date killTime);

    /**
     *根据id查询秒杀对象
     * @param seckillId
     * @return
     */
    Seckill queryById(long seckillId);

    /**
     *根据偏移量查询秒杀商品列表
     * @param offset
     * @param limit
     * @return
     */
    List<Seckill> queryAll(@Param("offset") int offset,@Param("limit") int limit);

    /**
     * 使用存储过程执行秒杀
     * @param paramMap
     */
    void killByProcedure(HashMap<String,Object> paramMap);
}