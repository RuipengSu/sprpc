package com.srp.sprpcdemo.config;

import com.srp.factory.ClientFactoryBean;
import com.srp.sprpcdemo.service.Hello;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ Author: Su RuiPeng
 * @ Date: 2018/10/29
 */
@Configuration
@RestController
@SpringBootApplication
@RequestMapping("/test")
public class SpringClientConfig {
    @Bean
    public Hello clientFactoryBean() throws Exception {
        ClientFactoryBean<Hello> clientFactoryBean = new ClientFactoryBean<>();
        clientFactoryBean.setZkConn("127.0.0.1:2181");
        clientFactoryBean.setServiceName("hello");
        clientFactoryBean.setServiceInterface(Hello.class);
        return clientFactoryBean.getObject();
    }
    @Resource
    private Hello hello;

    @RequestMapping("/hello")
    public String hello(String say) {
        return hello.say(say);
    }
    public static void main(String[] args) {
        SpringApplication.run(SpringClientConfig.class, "--server.port=8081");
    }
}
