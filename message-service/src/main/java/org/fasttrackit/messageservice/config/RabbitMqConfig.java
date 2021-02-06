package org.fasttrackit.messageservice.config;


import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class RabbitMqConfig {

    @Bean
    public Queue queue(){
        return new Queue("hello"); //pe coada asta se vor trimite mesajele
    }

    @Bean
    public Queue queue2() {
        return new Queue("goodbye");
    }

    @Bean
    public FanoutExchange fanout() {
        return new FanoutExchange("fanout");
    }

    @Bean
    public Binding binding1(FanoutExchange fanout,Queue queue1) {
        return BindingBuilder.bind(queue1).to(fanout);
    }

    @Bean
    public Binding binding2(FanoutExchange fanout, Queue queue2) {
        return BindingBuilder.bind(queue2).to(fanout);
    }
}
