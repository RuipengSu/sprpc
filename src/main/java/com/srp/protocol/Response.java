package com.srp.protocol;

import lombok.Getter;
import lombok.Setter;

/**
 * @ Author: Su RuiPeng
 * @ Date: 2018/10/18
 */

@Setter
@Getter
public class Response {
    private long requestId;
    private Object response;
    private Throwable throwable;
}
