package com.pg.soa.service.user.controller;

import com.pg.soa.service.user.events.channel.TestChannel;
import com.pg.soa.service.user.events.source.SimpleSourceBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableBinding(TestChannel.class)
public class TestController {

    @Autowired
    private SimpleSourceBean simpleSourceBean;
    @RequestMapping("test")
    public String textSendMsg(){

        simpleSourceBean.publishMsg("hello world!");
        return "ok";
    }

}
