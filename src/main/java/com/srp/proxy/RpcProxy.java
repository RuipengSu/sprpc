package com.srp.proxy;

import com.srp.client.Client;

/**
 * @ Author: Su RuiPeng
 * @ Date: 2018/10/19
 */
public interface RpcProxy {
    <T> T proxyInterface(Client client, final Class<T> serviceInterface);
}
