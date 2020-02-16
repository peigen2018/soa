package com.pg.soa.service.user.events.source;


import com.pg.soa.service.user.events.channel.TestChannel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

@Component
public class SimpleSourceBean {
    private TestChannel channel;

    @Autowired
    public SimpleSourceBean(TestChannel source) {
        this.channel = source;
    }

    public void publishMsg(String message) {
        channel.output().send(MessageBuilder.withPayload(message).build());
    }

}
