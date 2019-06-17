package ssm.dao;

import org.apache.ibatis.annotations.Param;
import ssm.pojo.Gallery;
import ssm.pojo.GalleryExample;

import java.util.List;

public interface GalleryMapper {
    int countByExample(GalleryExample example);

    int deleteByExample(GalleryExample example);

    int deleteByPrimaryKey(Integer imageId);

    int insert(Gallery record);

    int insertSelective(Gallery record);

    List<Gallery> selectByExample(GalleryExample example);

    List<Gallery> selectAll();

    List<Gallery> selectByImageType(String imageType);

    Gallery selectByPrimaryKey(Integer imageId);

    int updateByExampleSelective(@Param("record") Gallery record, @Param("example") GalleryExample example);

    int updateByExample(@Param("record") Gallery record, @Param("example") GalleryExample example);

    int updateByPrimaryKeySelective(Gallery record);

    int updateByPrimaryKey(Gallery record);
}