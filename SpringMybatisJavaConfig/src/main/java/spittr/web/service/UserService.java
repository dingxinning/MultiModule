package spittr.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spittr.web.entity.UserInfo;
import spittr.web.mapper.UserMapper;

import java.util.List;

/**
 * Created by Wuxiang on 2017/4/7.
 */
@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public List<UserInfo> findAll() {
        return userMapper.findAll();
    }

    public UserInfo findById(Integer id) {
        return userMapper.findById(id);
    }

    public void insertUser(String name,Integer age) throws Exception {
        UserInfo userInfo = new UserInfo();
        userInfo.setId(userMapper.findMaxId()+1);
        userInfo.setName(name);
        userInfo.setAge(age);
        System.out.println(userInfo.toString());
        if (userMapper.insertUser(userInfo) != 1) {
            throw new Exception("增加失败");
        }
    }

    public void updateUser(UserInfo userInfo) throws Exception {
        if (userMapper.updateUser(userInfo) != 1) {
            throw new Exception("更新失败");
        }
    }

    public void deleteById(Integer id) throws Exception {
        if (userMapper.deleteById(id) != 1) {
            throw new Exception("删除失败");
        }
    }
}
