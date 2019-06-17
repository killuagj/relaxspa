package ssm.service;

import ssm.pojo.Restaurant;

import java.util.List;

public interface RestaurantService {
    public int insert(Restaurant restaurant);
    public int deleteByPrimaryKey(Integer restaurantId);
    public int updateByPrimaryKey(Restaurant restaurant);
    public List<Restaurant> selectAll();

    public List<Restaurant> selectByRestaurantName(String restaurantName);
}
