package com.ht.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ImportResource;

/**
 * ClassName: DubboServerApp
 * create by:  xyf
 * description: TODO
 * create time: 2019/12/11 23:22
 */
@SpringBootApplication
@ImportResource(value = {"classpath:mybatis/mybatis-config.xml", "classpath:dubbo/dubbo-server.xml"})
public class DubboServerApp extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(DubboServerApp.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(DubboServerApp.class, args);
    }
}
