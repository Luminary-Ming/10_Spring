package com.demo;

import com.demo.service.TransferService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(locations = "classpath:spring-mybatis.xml")
public class TestTransferService {
    @Autowired
    private TransferService transferService;
    @Test
    public void testTransfer(){
        transferService.transfer();
    }
}
