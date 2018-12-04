package com.srp.protocol;

import lombok.Data;

/**
 * @ Author: Su RuiPeng
 * @ Date: 2018/10/18
 */
@Data
public class Request {
    private long requestId;
    private Class<?> clazz;
    private String method;
    private Class<?>[] parameterTypes;
    private Object[] params;
    private long requestTime;
}
