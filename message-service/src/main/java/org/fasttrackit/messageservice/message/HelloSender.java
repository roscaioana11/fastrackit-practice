package org.fasttrackit.messageservice.message;

import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.util.Date;

@Component
public class HelloSender {

    private final RabbitTemplate template;
    private final FanoutExchange fanout;
    private final Queue queue;

    public HelloSender(RabbitTemplate template, FanoutExchange fanout, Queue queue1) {
        this.template = template;
        this.fanout = fanout;
        this.queue = queue1;
    }

    @Scheduled(fixedDelay = 1000, initialDelay = 500)
    public void sendMessageEverySecond() {
        String message = "Hello world " + Date.from(Instant.now());
        this.template.convertAndSend(fanout.getName(), "", message);
//        System.out.println(" [x] Sent '" + message + "'");
    }
}
