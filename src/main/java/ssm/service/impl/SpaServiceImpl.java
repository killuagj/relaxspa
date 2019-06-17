package ssm.service.impl;

import org.springframework.stereotype.Service;
import ssm.dao.SpaMapper;
import ssm.pojo.Spa;
import ssm.pojo.SpaExample;
import ssm.service.SpaService;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SpaServiceImpl implements SpaService {

    @Resource
    private SpaMapper spaMapper;

    @Override
    public int insert(Spa spa) {
        return spaMapper.insert(spa);
    }

    @Override
    public int deleteByPrimaryKey(Integer spaId) {
        return spaMapper.deleteByPrimaryKey(spaId);
    }

    @Override
    public int updateByPrimaryKey(Spa spa) {
        return spaMapper.updateByPrimaryKey(spa);
    }

    @Override
    public List<Spa> selectAll() {
        return spaMapper.selectAll();
    }

    @Override
    public List<Spa> selectBySpaName(String spaName) {
        return spaMapper.selectBySpaName(spaName);
    }
}
