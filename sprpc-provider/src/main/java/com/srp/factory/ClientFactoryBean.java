package com.srp.factory;

import com.srp.bootstrap.ClientBuilder;
import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.FactoryBean;

/**
 * @ Author: Su RuiPeng
 * @ Date: 2018/10/29
 */
@Data
public class ClientFactoryBean<T> implements FactoryBean<T> {
    private static final Logger LOGGER = LoggerFactory.getLogger(ClientFactoryBean.class);

    private Class<T> serviceInterface;
    private String serviceName;
    private String zkConn;

    @Override
    public T getObject() throws Exception {
        return ClientBuilder
                .<T>builder()
                .zkConn(zkConn)
                .serviceName(serviceName)
                .serviceInterface(serviceInterface)
                .build();
    }

    @Override
    public Class<?> getObjectType() {
        return serviceInterface;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
