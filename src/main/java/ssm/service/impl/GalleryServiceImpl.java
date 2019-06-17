package ssm.service.impl;

import org.springframework.stereotype.Service;
import ssm.dao.GalleryMapper;
import ssm.pojo.Gallery;
import ssm.service.GalleryService;

import javax.annotation.Resource;
import java.util.List;

@Service
public class GalleryServiceImpl implements GalleryService {

    @Resource
    private GalleryMapper galleryMapper;

    @Override
    public int insert(Gallery gallery) {
        return galleryMapper.insert(gallery);
    }

    @Override
    public int deleteByPrimaryKey(Integer imageId) {
        return galleryMapper.deleteByPrimaryKey(imageId);
    }

    @Override
    public int updateByPrimaryKey(Gallery gallery) {
        return galleryMapper.updateByPrimaryKey(gallery);
    }

    @Override
    public List<Gallery> selectAll() {
        return galleryMapper.selectAll();
    }

    @Override
    public List<Gallery> selectByImageType(String imageType) {
        return galleryMapper.selectByImageType(imageType);
    }
}
