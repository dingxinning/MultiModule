package com.reflection_new.second;

import com.reflection_new.first_class.SUser;

import java.lang.reflect.Constructor;

/**
 * Created by Wuxiang on 2017/8/25.
 * 构造方法的顺序 不一定
 */
public class GetClassInstanceDemo03 {
    public static void main(String[] args){
        Class<?> c = null;
        try{
            c = Class.forName("com.reflection_new.first_class.SUser");//实例化class
            //获取class所在类的所有构造方法
            Constructor<?> con[] = null;
            con = c.getConstructors();//获取SUser类中的所有构造方法
            for(int i=0;i<con.length;i++){
                System.out.println(con[i]);
                //SUser类中定义了三个构造方法，输出结果依次为：
            /*
            public com.wjl.reflect.SUser(java.lang.String)
            public com.wjl.reflect.SUser(java.lang.String,java.lang.String)
            public com.wjl.reflect.SUser()
            */
            }
            SUser user = null;
            SUser user2 = null;
            SUser user3 = null;
            user = (SUser)con[1].newInstance("admin");//带一个参数
            user2 = (SUser)con[0].newInstance("admin","123456");//带两个参数
            user3 = (SUser)con[2].newInstance();//没有参数
            //以上三个构造方法分别实例化SUser时不能弄错，即con的下标与各个构造方法的顺序得一致，否则报错：
//          java.lang.IllegalArgumentException: wrong number of arguments

            System.out.println(user);
            System.out.println(user2);
            System.out.println(user3);
        /*结果：
        用户名：admin,密码：null
        用户名：admin,密码：123456
        用户名：null,密码：null
        */
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
