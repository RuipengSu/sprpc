package com.srp.serializer;

/**
 * @ Author: Su RuiPeng
 * @ Date: 2018/10/18
 */
public interface Serializer {
    byte[] serialize(Object obj);
    <T> T deserialize(byte[] bytes);
}
