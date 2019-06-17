package ssm.service.impl;

import org.springframework.stereotype.Service;
import ssm.dao.OrderMapper;
import ssm.pojo.Order;
import ssm.pojo.OrderExample;
import ssm.service.OrderService;

import javax.annotation.Resource;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderMapper orderMapper;

    @Override
    public int insert(Order order) {
        return orderMapper.insert(order);
    }

    @Override
    public int deleteByPrimaryKey(Integer orderId) {
        return orderMapper.deleteByPrimaryKey(orderId);
    }

    @Override
    public int updateByPrimaryKey(Order order) {
        return orderMapper.updateByPrimaryKey(order);
    }

    @Override
    public List<Order> selectAll() {
        return orderMapper.selectAll();
    }

    @Override
    public List<Order> selectByOrderNumber(String orderNumber) {
        OrderExample example=new OrderExample();
        OrderExample.Criteria criteria = example.createCriteria();
        criteria.andOrderNumberEqualTo(orderNumber);
        return orderMapper.selectByExample(example);
    }
}
