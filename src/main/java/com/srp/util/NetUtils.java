package com.srp.util;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @ Author: Su RuiPeng
 * @ Date: 2018/10/18
 */
public class NetUtils {

    /**
     * 此处实现的并不到位，暂时这样处理
     * 用Java获取本机IP地址，需要处理：
     *1. 多块网卡。
     *2. 排除loopback设备、虚拟网卡
     * @ return
     */
    public static String getLocalIp() {

        try {
            return InetAddress.getLocalHost().getHostAddress();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return null;
    }
}
