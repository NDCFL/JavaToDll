package com.cfl.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLCon {


    private static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver"; //驱动
    private static String url = "jdbc:sqlserver://192.168.86.130\\SQL2000:1433;databasename=HSData";
    private static String username = "sa";
    private static String password = "lz123456";
    private static Connection conn = null;
    //静态语句块
    static {
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("连接成功！");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //连接数据库
    public static Connection openDB() {
        try {
            //如果连接已经关闭
            if (conn.isClosed()) {
                conn = DriverManager.getConnection(url, username, password);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
    public static void main(String...arg){

    }
}
