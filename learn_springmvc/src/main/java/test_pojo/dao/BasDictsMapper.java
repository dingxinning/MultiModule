package test_pojo.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import test_pojo.model.BasDicts;
import test_pojo.model.BasDictsExample;

public interface BasDictsMapper {
    int countByExample(BasDictsExample example);

    int deleteByExample(BasDictsExample example);

    int deleteByPrimaryKey(String dictid);

    int insert(BasDicts record);

    int insertSelective(BasDicts record);

    List<BasDicts> selectByExample(BasDictsExample example);

    BasDicts selectByPrimaryKey(String dictid);

    int updateByExampleSelective(@Param("record") BasDicts record, @Param("example") BasDictsExample example);

    int updateByExample(@Param("record") BasDicts record, @Param("example") BasDictsExample example);

    int updateByPrimaryKeySelective(BasDicts record);

    int updateByPrimaryKey(BasDicts record);
}