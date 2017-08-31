package test_pojo.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import test_pojo.model.ClcReg;
import test_pojo.model.ClcRegExample;

public interface ClcRegMapper {
    int countByExample(ClcRegExample example);

    int deleteByExample(ClcRegExample example);

    int deleteByPrimaryKey(String regid);

    int insert(ClcReg record);

    int insertSelective(ClcReg record);

    List<ClcReg> selectByExample(ClcRegExample example);

    ClcReg selectByPrimaryKey(String regid);

    int updateByExampleSelective(@Param("record") ClcReg record, @Param("example") ClcRegExample example);

    int updateByExample(@Param("record") ClcReg record, @Param("example") ClcRegExample example);

    int updateByPrimaryKeySelective(ClcReg record);

    int updateByPrimaryKey(ClcReg record);
}