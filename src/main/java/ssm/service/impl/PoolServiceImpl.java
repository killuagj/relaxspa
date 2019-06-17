package ssm.service.impl;

import org.springframework.stereotype.Service;
import ssm.dao.PoolMapper;
import ssm.pojo.Pool;
import ssm.pojo.PoolExample;
import ssm.service.PoolService;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PoolServiceImpl implements PoolService {

    @Resource
    private PoolMapper poolMapper;

    @Override
    public int insert(Pool pool) {
        return poolMapper.insert(pool);
    }

    @Override
    public int deleteByPrimaryKey(Integer poolId) {
        return poolMapper.deleteByPrimaryKey(poolId);
    }

    @Override
    public int updateByPrimaryKey(Pool pool) {
        return poolMapper.updateByPrimaryKey(pool);
    }

    @Override
    public List<Pool> selectAll() {
        return poolMapper.selectAll();
    }

    @Override
    public List<Pool> selectByPoolName(String poolName) {
        return poolMapper.selectByPoolName(poolName);
    }
}
