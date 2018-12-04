package com.srp.client;

import com.srp.protocol.Response;

import java.lang.reflect.Method;

/**
 * @ Author: Su RuiPeng
 * @ Date: 2018/10/20
 */
public interface Client {
    Response sendMessage(Class<?> clazz, Method method, Object[] args);
    <T> T proxyInterface(Class<T> serviceInterface);
    void close();
}
