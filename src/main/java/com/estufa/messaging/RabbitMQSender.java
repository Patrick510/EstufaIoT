package com.estufa.messaging;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQSender {

  @Autowired
  private RabbitTemplate rabbitTemplate;

  @Value("${spring.rabbitmq.name}")
  private String queueName;

  public void sendMessage(String message) {
    rabbitTemplate.convertAndSend(queueName, message);
  }
}
