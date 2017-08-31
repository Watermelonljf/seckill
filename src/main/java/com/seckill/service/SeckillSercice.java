package com.seckill.service;

import com.seckill.dto.Exposer;
import com.seckill.entity.Seckill;

import java.util.List;

/**
 * �������������,����,
 * Created by ljianf on 2017/8/31.
 */
public interface SeckillSercice {

    /**
     * ��ѯ����Seckill
     * @return
     */
    List<Seckill> getSeckillList();

    Seckill getById(long seckillId);

    /**
     * ��ʼʱ����Ҫ��¶����ɱ��ַ
     * @param seckillId
     */
    Exposer exportSeckillUrl(long seckillId);


    void executeSeckill(long SeckillId, long userPhone, String md5);
}
