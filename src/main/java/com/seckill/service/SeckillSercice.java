package com.seckill.service;

import com.seckill.dto.Exposer;
import com.seckill.entity.Seckill;

import java.util.List;

/**
 * 方法定义的粒度,参数,
 * Created by ljianf on 2017/8/31.
 */
public interface SeckillSercice {

    /**
     * 查询所有Seckill
     * @return
     */
    List<Seckill> getSeckillList();

    Seckill getById(long seckillId);

    /**
     * 开始时，需要暴露的秒杀地址
     * @param seckillId
     */
    Exposer exportSeckillUrl(long seckillId);


    void executeSeckill(long SeckillId, long userPhone, String md5);
}
