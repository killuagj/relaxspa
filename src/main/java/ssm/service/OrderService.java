package ssm.service;

import ssm.pojo.Order;

import java.util.List;

public interface OrderService {
    public int insert(Order order);
    public int deleteByPrimaryKey(Integer orderId);
    public int updateByPrimaryKey(Order order);
    public List<Order> selectAll();

    public List<Order> selectByOrderNumber(String orderNumber);
}
