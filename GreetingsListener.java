package com.javatechie.spring.cloud.stream.api;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class GreetingsListener {
    @StreamListener(GreetingsStreams.INPUT)
    public void consume(@Payload Greetings greetings)
    {
        System.out.println("Consume messg "+greetings);

    }

    @StreamListener(GreetingsStreams.INPUT1)
    public void consume1(@Payload Greetings greetings)
    {
        System.out.println("Consume messg "+greetings);
    }
}

