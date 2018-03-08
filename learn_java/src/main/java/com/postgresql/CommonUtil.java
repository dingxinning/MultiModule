package com.postgresql;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Wuxiang on 2018/3/8
 */
public class CommonUtil {
    public static void printResult(ResultSet rs) throws SQLException {
        while ( rs.next() ) {
            int id = rs.getInt("id");
            String  name = rs.getString("name");
            int age  = rs.getInt("age");
            String  address = rs.getString("address");
            float salary = rs.getFloat("salary");
            System.out.println( "ID = " + id );
            System.out.println( "NAME = " + name );
            System.out.println( "AGE = " + age );
            System.out.println( "ADDRESS = " + address );
            System.out.println( "SALARY = " + salary );
            System.out.println();
        }
    }
}
