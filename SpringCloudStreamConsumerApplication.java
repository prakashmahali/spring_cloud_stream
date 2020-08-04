package com.javatechie.spring.cloud.stream.api;

import org.apache.kafka.streams.kstream.KStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.handler.annotation.SendTo;

@SpringBootApplication
//@EnableBinding(Sink.class)
@EnableBinding(GreetingsStreams.class)
//@EnableBinding({SpringCloudStreamConsumerApplication.StreamProcessor1.class,SpringCloudStreamConsumerApplication.StreamProcessor2.class})
public class SpringCloudStreamConsumerApplication {

    private Logger logger = LoggerFactory.getLogger(SpringCloudStreamConsumerApplication.class);

    /*
    @StreamListener("input")
    public void consumeMessage(String book) {

        logger.info("Consume payload : " + book);
    }
*/

    public static void main(String[] args) {

        SpringApplication.run(SpringCloudStreamConsumerApplication.class, args);
    }
/*
    @StreamListener(StreamProcessor1.INPUT)
    public KStream<String, String> process1(KStream<String, String> input) {

        System.out.println("Stream listening");

        return input
                .peek(((key, value) -> System.out.println("key = " + key +", value = " + value)));
    }

    @StreamListener(StreamProcessor2.INPUT)
    public KStream<String, String> process2(KStream<String, String> input) {

        System.out.println("Stream listening binding two");

        return input
                .peek(((key, value) -> System.out.println("key = " + key +", value = " + value)));
    }

    interface StreamProcessor1 {

        String INPUT = "input_1";


        @Input(INPUT)
        KStream<String, String> input();


    }

    interface StreamProcessor2 {

        String INPUT = "input_2";


        @Input(INPUT)
        KStream<String, String> input();


    }
*/

}
