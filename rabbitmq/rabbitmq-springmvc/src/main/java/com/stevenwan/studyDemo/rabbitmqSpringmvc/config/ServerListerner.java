package com.stevenwan.studyDemo.rabbitmqSpringmvc.config;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @author:steven-wan
 * @times:2021-08-17
 * @desc:
 **/
@Slf4j
public class ServerListerner implements ServletContextListener {

    @Override
    public void contextDestroyed(ServletContextEvent contextEvent) {
    }

    @Override
    public void contextInitialized(ServletContextEvent contextEvent) {
        log.info("=================================");
        log.info("系统[{}]启动完成!!!", contextEvent.getServletContext().getServletContextName());
        log.info("=================================");
    }
}
