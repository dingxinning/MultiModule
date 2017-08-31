package spittr.web.mapper;

import org.apache.ibatis.annotations.Param;
import spittr.web.entity.UserInfo;

import java.util.List;

/**
 * Created by Wuxiang on 2017/4/7.
 */
public interface UserMapper {

    List<UserInfo> findAll();

    UserInfo findById(@Param("id") Integer id);

    int findMaxId();

    int insertUser(UserInfo userInfo);

    int updateUser(UserInfo userInfo);

    int deleteById(@Param("id") Integer id);
}
