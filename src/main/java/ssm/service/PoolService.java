package ssm.service;

import ssm.pojo.Pool;

import java.util.List;

public interface PoolService {
    public int insert(Pool pool);
    public int deleteByPrimaryKey(Integer poolId);
    public int updateByPrimaryKey(Pool pool);
    public List<Pool> selectAll();

    public List<Pool> selectByPoolName(String poolName);

}
