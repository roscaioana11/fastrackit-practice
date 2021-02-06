package org.fasttrackit.messageservice.message;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "hello")
public class HelloReceiver {

    @RabbitHandler
    public void receive(String rawMessage) {
        System.out.println("[>] Received from `hello` : " + rawMessage);
    }
}
