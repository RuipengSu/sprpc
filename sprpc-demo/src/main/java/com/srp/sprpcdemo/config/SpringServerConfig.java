package com.srp.sprpcdemo.config;

import com.srp.factory.ServerFactoryBean;
import com.srp.sprpcdemo.service.Hello;
import com.srp.sprpcdemo.service.HelloImpl;
import com.srp.util.NetUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * @ Author: Su RuiPeng
 * @ Date: 2018/10/29
 */
@SpringBootApplication
public class SpringServerConfig {
    @Bean
    public Hello hello() {
        return new HelloImpl();
    }

    @Bean
    public ServerFactoryBean serverFactoryBean() {
        final ServerFactoryBean serverFactoryBean = new ServerFactoryBean();
        serverFactoryBean.setPort(9090);
        serverFactoryBean.setServiceInterface(Hello.class);
        serverFactoryBean.setServiceName("hello");
        serverFactoryBean.setServiceImpl(hello());
        serverFactoryBean.setZkConn("127.0.0.1:2181");

        new Thread(() -> {
            try {
                serverFactoryBean.start();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }, "RpcServer").start();
        return serverFactoryBean;
    }

    public static void main(String[] args) {
        System.out.println(NetUtils.getLocalIp());
        SpringApplication.run(SpringServerConfig.class, "--server.port=8082");
    }
}
