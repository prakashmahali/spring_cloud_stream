package com.javatechie.spring.cloud.stream.api;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface GreetingsStreams {

    String INPUT = "greetings-in";
    String INPUT1 = "greetings-out";

    @Input(INPUT)
    SubscribableChannel inboundGreetings();

    @Input(INPUT1)
    SubscribableChannel inboundGreetings_1();

}
