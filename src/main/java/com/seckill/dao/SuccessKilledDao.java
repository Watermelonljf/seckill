package com.seckill.dao;

import com.seckill.entity.SuccessSeckill;

/**
 * Created by ljianf on 2017/8/31.
 */
public interface SuccessKilledDao {

    /**
     * 插入购买明细
     * @param seckillId
     * @param userPhone
     * @return
     */
    int insertSuccessKilled(long seckillId, long userPhone);


    /**
     * 根据ID查询对象携带秒杀产品
     * @param seckillId
     * @return
     */
    SuccessSeckill queryByIdWithSeckill(long seckillId);
}
