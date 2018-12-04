package com.srp.client;

import com.srp.protocol.Response;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * @ Author: Su RuiPeng
 * @ Date: 2018/10/19
 */
public class ResponseMapHelper {
    public static ConcurrentMap<Long, BlockingQueue<Response>> responseMap = new ConcurrentHashMap<>();
}
