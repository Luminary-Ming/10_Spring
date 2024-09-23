package com.demo.service.impl;

import com.demo.mapper.TransferMapper;
import com.demo.service.TransferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TransferServiceImpl  implements TransferService {
    @Autowired
    private TransferMapper transferMapper;
    /**
     * 转账
     */
    @Override
    // 开启事务
    @Transactional
    public void transfer() {
        // 永恩转给亚索 1000
        transferMapper.less("永恩",1000);
        // 故意给个异常，由于开启了事务，要么全部成功，要么全部失败
//        int x = 1/0;
        transferMapper.add("亚索",1000);
    }
}
