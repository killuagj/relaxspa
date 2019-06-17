package ssm.service;

import ssm.pojo.Spa;

import java.util.List;

public interface SpaService {
    public int insert(Spa spa);
    public int deleteByPrimaryKey(Integer spaId);
    public int updateByPrimaryKey(Spa spa);
    public List<Spa> selectAll();

    public List<Spa> selectBySpaName(String spaName);
}
