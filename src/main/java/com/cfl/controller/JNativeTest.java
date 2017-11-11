package com.cfl.controller;

import org.xvolks.jnative.JNative;
import org.xvolks.jnative.Type;
import org.xvolks.jnative.exceptions.NativeException;

public class JNativeTest {

    public static void main(String...arg){
        JNative.setLoggingEnabled(true);
        try {
            JNative getUrl = new JNative("D://HSoft4_2.dll", "_ReadAllTotalCountAndMoney@12");
            getUrl.setRetVal(Type.INT);//int IConnectType ,int Port ,String ITcpAddress ,long InBaud );
            getUrl.setParameter(0, 0);
            getUrl.setParameter(1, 0);
            getUrl.setParameter(2, 0);
            getUrl.invoke();
            System.out.println(getUrl.getRetVal());
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NativeException e) {
            e.printStackTrace();
        }
    }
}
