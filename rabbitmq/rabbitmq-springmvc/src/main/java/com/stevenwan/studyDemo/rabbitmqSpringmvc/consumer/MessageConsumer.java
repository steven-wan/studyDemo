package com.stevenwan.studyDemo.rabbitmqSpringmvc.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author:steven-wan
 * @times:2021-08-09
 * @desc:
 **/
@Component
@Slf4j
public class MessageConsumer {

    /**
     * 接受到信息：正常的发送和消费，不报异常
     * @param message
     */
    public void onMessage(String message) {
        log.info("接受到信息：{}", message);
    }
}
