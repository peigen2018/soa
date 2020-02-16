package com.pg.soa.service.auth.events.listener;

import com.pg.soa.service.auth.events.channel.TestChannel;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

@Component
@EnableBinding(TestChannel.class)
public class Listener {
    @StreamListener(TestChannel.INPUT)
    public void sink(Object message) {

        System.out.println("-----------------------------------");
        System.out.println(String.valueOf(message));
    }
}
