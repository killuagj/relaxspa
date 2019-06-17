package ssm.dao;

import org.apache.ibatis.annotations.Param;
import ssm.pojo.Pool;
import ssm.pojo.PoolExample;

import java.util.List;

public interface PoolMapper {
    int countByExample(PoolExample example);

    int deleteByExample(PoolExample example);

    int deleteByPrimaryKey(Integer poolId);

    int insert(Pool record);

    int insertSelective(Pool record);

    List<Pool> selectByExampleWithBLOBs(PoolExample example);

    List<Pool> selectByExample(PoolExample example);

    List<Pool> selectByPoolName(String poolName);

    List<Pool> selectAll();

    Pool selectByPrimaryKey(Integer poolId);

    int updateByExampleSelective(@Param("record") Pool record, @Param("example") PoolExample example);

    int updateByExampleWithBLOBs(@Param("record") Pool record, @Param("example") PoolExample example);

    int updateByExample(@Param("record") Pool record, @Param("example") PoolExample example);

    int updateByPrimaryKeySelective(Pool record);

    int updateByPrimaryKeyWithBLOBs(Pool record);

    int updateByPrimaryKey(Pool record);
}