package com.pg.soa.service.auth.events.channel;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface TestChannel {
    String INPUT = "test-input-channel";

    @Input(TestChannel.INPUT)
    SubscribableChannel input();
}
