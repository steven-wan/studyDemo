package com.stevenwan.studyDemo.rabbitmqSpringmvc.service;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author:steven-wan
 * @times:2021-08-16
 * @desc:
 **/
@Service
public class RabbitmqService {

    @Autowired
    private AmqpTemplate amqpTemplate;

    /**
     * 基本的发送和接受
     *
     * @param message
     * @return
     */
    public Boolean basicSendAndReceive(String message) {
        amqpTemplate.convertAndSend(message);
        return Boolean.TRUE;
    }
}
