package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

/**
 * Created by Wuxiang on 2017/4/5.
 *
 * 需要依赖 Spring-jdbc,c3p0,mysql-connector！
 */
public class AppJDBC {
    public static void main(String[] args) throws Exception {
        //加载jdbc配置文件
        ApplicationContext ctx =
                new ClassPathXmlApplicationContext("config/MySpringJDBC.xml");

        //第一种 直接获取jdbcTemplate的bean
        System.out.println("---First start---");
        JdbcTemplate jdbcTemplate=(JdbcTemplate) ctx.getBean("jdbcTemplate");
        RowMapper<User> rowMapper=new BeanPropertyRowMapper<>(User.class);
        String sql = "select id,name,age,password from user where id=?";
        User user=jdbcTemplate.queryForObject(sql, rowMapper,2);
        System.out.println(user.toString());
        System.out.println("---First end---");

        //实际开发使用Dao封装
        System.out.println("\n---Second start---");
        UserDao userDao = (UserDao) ctx.getBean("userDao");
        System.out.println(userDao.getById(2));
        System.out.println("---Second end---");


        System.out.println("\n======我是分割线======");
        System.out.println(userDao.getAll());
        System.out.println(userDao.getCount());

        User newUser = new User();
        newUser.setId(1);
        newUser.setName("newCC");
        newUser.setAge(21);
        newUser.setPassword("aaa");
        //System.out.println(userDao.insert(newUser));
//        System.out.println(userDao.update(newUser));
//        System.out.println(userDao.delete(67));
    }
}
