package ssm.dao;

import org.apache.ibatis.annotations.Param;
import ssm.pojo.Restaurant;
import ssm.pojo.RestaurantExample;

import java.util.List;

public interface RestaurantMapper {
    int countByExample(RestaurantExample example);

    int deleteByExample(RestaurantExample example);

    int deleteByPrimaryKey(Integer restaurantId);

    int insert(Restaurant record);

    int insertSelective(Restaurant record);

    List<Restaurant> selectByExampleWithBLOBs(RestaurantExample example);

    List<Restaurant> selectByExample(RestaurantExample example);

    List<Restaurant> selectByRestaurantName(String restaurantName);

    List<Restaurant> selectAll();

    Restaurant selectByPrimaryKey(Integer restaurantId);

    int updateByExampleSelective(@Param("record") Restaurant record, @Param("example") RestaurantExample example);

    int updateByExampleWithBLOBs(@Param("record") Restaurant record, @Param("example") RestaurantExample example);

    int updateByExample(@Param("record") Restaurant record, @Param("example") RestaurantExample example);

    int updateByPrimaryKeySelective(Restaurant record);

    int updateByPrimaryKeyWithBLOBs(Restaurant record);

    int updateByPrimaryKey(Restaurant record);
}