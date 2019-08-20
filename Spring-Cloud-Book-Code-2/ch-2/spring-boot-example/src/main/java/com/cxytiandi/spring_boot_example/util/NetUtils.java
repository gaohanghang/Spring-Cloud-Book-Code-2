package com.cxytiandi.spring_boot_example.util;


import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * 检查端口是否可用
 *
 * @author yinjihuan
 * @create 2017-11-21 15:48
 **/
public class NetUtils {

    /***
     *  检查本地端口可用性
     *  true:already in using  false:not using
     * @param port
     */
    public static boolean isLoclePortUsing(int port){
        boolean flag = true;
        try {
            flag = isPortUsing("127.0.0.1", port);
        } catch (Exception e) {
        }
        return flag;
    }

    /***
     *  检查远程端口可用性
     *  true:already in using  false:not using
     * @param host
     * @param port
     * @throws UnknownHostException
     */
    public static boolean isPortUsing(String host,int port) {
        boolean flag = false;
        try {
            InetAddress theAddress = InetAddress.getByName(host);
            Socket socket = new Socket(theAddress,port);
            socket.close();
            flag = true;
        } catch (Exception e) {

        }
        return flag;
    }

}
