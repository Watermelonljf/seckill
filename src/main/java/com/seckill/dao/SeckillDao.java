package com.seckill.dao;

import com.seckill.entity.Seckill;

import java.util.Date;
import java.util.List;

/**
 * Created by ljianf on 2017/8/31.
 */
public interface SeckillDao {

    /**
     * ¼õ¿â´æ
     * @param seckillId
     * @param killTime
     * @return
     */
    int reduceNumber(long seckillId, Date killTime);


    Seckill queryById(long seckillId);

    List<Seckill> queryAll(int offset, int limit);
}


























