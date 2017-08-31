package test_pojo.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import test_pojo.model.BasUser;
import test_pojo.model.BasUserExample;
import test_pojo.model.BasUserKey;

public interface BasUserMapper {
    int countByExample(BasUserExample example);

    int deleteByExample(BasUserExample example);

    int deleteByPrimaryKey(BasUserKey key);

    int insert(BasUser record);

    int insertSelective(BasUser record);

    List<BasUser> selectByExample(BasUserExample example);

    BasUser selectByPrimaryKey(BasUserKey key);

    int updateByExampleSelective(@Param("record") BasUser record, @Param("example") BasUserExample example);

    int updateByExample(@Param("record") BasUser record, @Param("example") BasUserExample example);

    int updateByPrimaryKeySelective(BasUser record);

    int updateByPrimaryKey(BasUser record);
}