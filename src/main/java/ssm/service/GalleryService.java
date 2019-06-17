package ssm.service;

import ssm.pojo.Gallery;

import java.util.List;

public interface GalleryService {
    public int insert(Gallery gallery);
    public int deleteByPrimaryKey(Integer imageId);
    public int updateByPrimaryKey(Gallery gallery);
    public List<Gallery> selectAll();

    public List<Gallery> selectByImageType(String imageType);
}
