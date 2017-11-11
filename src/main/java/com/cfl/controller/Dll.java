package com.cfl.controller;

public class Dll {
    static
    {
        //System.loadLibrary("Connector");//载入需要调用的dll  Connector.dll
        System.load("d://HSoft4_2.dll");//载入dll  Connector.dll
    }
    //用native关键字修饰将被其它语言实现的方法
    //dll文件中对应的函数声明
    public native static int _ReadAllTotalCountAndMoney(int IConnectType ,int Port  ,long InBaud );
    public static void main(String[] args){
        //本地方法的调用
        int rs=_ReadAllTotalCountAndMoney(1,1,1);
        System.out.println("用户登录状态："+rs);
    }
}
