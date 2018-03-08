package com.postgresql;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Created by Wuxiang on 2018/3/8
 *
 * 第一步
 * Java连接到 PostgreSQL 数据库
 */
public class PostgreSQLJDBC {
    public static void main(String[] args) {
        Connection c = null;
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/testdb", "postgres", "960629");
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }
        System.out.println("成功连接 PostgreSQL数据库 testdb！！！");
    }
}