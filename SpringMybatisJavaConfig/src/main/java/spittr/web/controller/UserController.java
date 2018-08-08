package spittr.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import spittr.web.entity.UserInfo;
import spittr.web.service.UserService;

import java.util.List;

/**
 * Created by Wuxiang on 2017/4/7.
 */
@Controller
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);
    
    @Autowired
    UserService userService;

    @RequestMapping("/findAll")
    @ResponseBody
    public String findAll() {
        List<UserInfo> userInfos = userService.findAll();
        for (int i = 0; i < userInfos.size(); i++) {
            logger.info(userInfos.get(i).toString());
        }
        return "find all users";
    }

    @RequestMapping("/find/{id}")
    @ResponseBody
    public String findById(@PathVariable Integer id) {
        UserInfo userInfo = userService.findById(id);
        logger.info(userInfo.toString());
        return "find user by id=" + id;
    }

    @RequestMapping("/insert")
    @ResponseBody
    public String insert(@RequestParam String name,
                         @RequestParam Integer age) throws Exception {
        userService.insertUser(name, age);
        return "insert user success!";
    }

    @RequestMapping("/update")
    @ResponseBody
    public String update(@ModelAttribute UserInfo userInfo) throws Exception {
        userService.updateUser(userInfo);
        logger.info(userInfo.toString());
        return "update user success!";
    }

    @RequestMapping("/delete/{id}")
    @ResponseBody
    public String delete(@PathVariable Integer id) throws Exception {
        userService.deleteById(id);
        return "delete user , id=" + id;
    }
}
