package com.srp.sprpcdemo.service;

/**
 * @ Author: Su RuiPeng
 * @ Date: 2018/10/29
 */
public class HelloImpl implements Hello {
    @Override
    public String say(String hello) {
        return "server: "+hello;
    }

    @Override
    public int sum(int a, int b) {
        return a+b;
    }

    @Override
    public int max(Integer a, Integer b) {
        return a <= b ? b : a;
    }
}
