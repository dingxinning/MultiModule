package test_pojo.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import test_pojo.model.ClcDiag;
import test_pojo.model.ClcDiagExample;

public interface ClcDiagMapper {
    int countByExample(ClcDiagExample example);

    int deleteByExample(ClcDiagExample example);

    int deleteByPrimaryKey(String diagid);

    int insert(ClcDiag record);

    int insertSelective(ClcDiag record);

    List<ClcDiag> selectByExample(ClcDiagExample example);

    ClcDiag selectByPrimaryKey(String diagid);

    int updateByExampleSelective(@Param("record") ClcDiag record, @Param("example") ClcDiagExample example);

    int updateByExample(@Param("record") ClcDiag record, @Param("example") ClcDiagExample example);

    int updateByPrimaryKeySelective(ClcDiag record);

    int updateByPrimaryKey(ClcDiag record);
}