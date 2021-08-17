package com.stevenwan.studyDemo.rabbitmqSpringmvc.controller;

import com.stevenwan.studyDemo.rabbitmqSpringmvc.service.RabbitmqService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author:steven-wan
 * @times:2021-08-16
 * @desc:
 **/
@Controller
@RequestMapping("rabbitmq")
public class RabbitmqController {

    @Autowired
    private RabbitmqService rabbitmqService;

    @RequestMapping("basic")
    @ResponseBody
    public Boolean basicSendAndReceive(String message) {
        return rabbitmqService.basicSendAndReceive(message);
    }
}
