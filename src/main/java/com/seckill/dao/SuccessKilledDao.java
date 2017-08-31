package com.seckill.dao;

import com.seckill.entity.SuccessSeckill;

/**
 * Created by ljianf on 2017/8/31.
 */
public interface SuccessKilledDao {

    /**
     * ���빺����ϸ
     * @param seckillId
     * @param userPhone
     * @return
     */
    int insertSuccessKilled(long seckillId, long userPhone);


    /**
     * ����ID��ѯ����Я����ɱ��Ʒ
     * @param seckillId
     * @return
     */
    SuccessSeckill queryByIdWithSeckill(long seckillId);
}
