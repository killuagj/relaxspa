package ssm.dao;

import org.apache.ibatis.annotations.Param;
import ssm.pojo.Spa;
import ssm.pojo.SpaExample;

import java.util.List;

public interface SpaMapper {
    int countByExample(SpaExample example);

    int deleteByExample(SpaExample example);

    int deleteByPrimaryKey(Integer spaId);

    int insert(Spa record);

    int insertSelective(Spa record);

    List<Spa> selectByExampleWithBLOBs(SpaExample example);

    List<Spa> selectByExample(SpaExample example);

    List<Spa> selectBySpaName(String spaName);

    List<Spa> selectAll();

    Spa selectByPrimaryKey(Integer spaId);

    int updateByExampleSelective(@Param("record") Spa record, @Param("example") SpaExample example);

    int updateByExampleWithBLOBs(@Param("record") Spa record, @Param("example") SpaExample example);

    int updateByExample(@Param("record") Spa record, @Param("example") SpaExample example);

    int updateByPrimaryKeySelective(Spa record);

    int updateByPrimaryKeyWithBLOBs(Spa record);

    int updateByPrimaryKey(Spa record);
}