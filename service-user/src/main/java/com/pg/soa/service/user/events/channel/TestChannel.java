package com.pg.soa.service.user.events.channel;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.SubscribableChannel;

public interface TestChannel {
    String OUTPUT = "test-output-channel";

    @Output(TestChannel.OUTPUT)
    SubscribableChannel output();
}
