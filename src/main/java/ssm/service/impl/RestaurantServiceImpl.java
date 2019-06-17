package ssm.service.impl;

import org.springframework.stereotype.Service;
import ssm.dao.RestaurantMapper;
import ssm.pojo.Restaurant;
import ssm.pojo.RestaurantExample;
import ssm.service.RestaurantService;

import javax.annotation.Resource;
import java.util.List;

@Service
public class RestaurantServiceImpl implements RestaurantService {

    @Resource
    private RestaurantMapper restaurantMapper;

    @Override
    public int insert(Restaurant restaurant) {
        return restaurantMapper.insert(restaurant);
    }

    @Override
    public int deleteByPrimaryKey(Integer restaurantId) {
        return restaurantMapper.deleteByPrimaryKey(restaurantId);
    }

    @Override
    public int updateByPrimaryKey(Restaurant restaurant) {
        return restaurantMapper.updateByPrimaryKey(restaurant);
    }

    @Override
    public List<Restaurant> selectAll() {
        return restaurantMapper.selectAll();
    }

    @Override
    public List<Restaurant> selectByRestaurantName(String restaurantName) {
        return restaurantMapper.selectByRestaurantName(restaurantName);
    }
}
