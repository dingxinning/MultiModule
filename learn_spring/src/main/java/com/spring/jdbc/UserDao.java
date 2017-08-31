package com.spring.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Wuxiang on 2017/4/5.
 */
@Repository
public class UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public User getById(Integer id) {
        RowMapper<User> rowMapper=new BeanPropertyRowMapper<>(User.class);
        String sql = "select id,name,age,password from user where id=?";
        return jdbcTemplate.queryForObject(sql, rowMapper,id);
    }

    public List<User> getAll() {
        RowMapper<User> rowMapper=new BeanPropertyRowMapper<>(User.class);
        String sql = "select id,name,age,password from user";
        return jdbcTemplate.query(sql, rowMapper);
    }

    public int getCount() {
        String sql = "select count(1) from user";
        return jdbcTemplate.queryForObject(sql, Integer.class);
    }

    public int insert(User user) throws Exception {
        if (getById(user.getId()) != null) {
            throw new Exception("主键已存在！！！");
        }
        String sql = "insert into user (id,name,age,password) values (?,?,?,?)";
        return jdbcTemplate.update(sql,
                new Object[] {user.getId(),user.getName(),user.getAge(),user.getPassword()});
    }

    public int update(User user) throws Exception {
        if (getById(user.getId())== null) {
            throw new Exception("不存在对应的用户！！！");
        }
        String sql = "update user set name=?,age=?,password=? where id=?";
        return jdbcTemplate.update(sql,
                new Object[] {user.getName(),user.getAge(),user.getPassword(),user.getId()});
    }

    public int delete(Integer id) throws Exception {
        if (getById(id)== null) {
            throw new Exception("不存在对应的用户！！！");
        }
        String sql = "delete from user where id=?";
        return jdbcTemplate.update(sql, id);
    }
}
