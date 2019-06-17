package ssm.service.impl;

import org.springframework.stereotype.Service;
import ssm.dao.UserMapper;
import ssm.pojo.User;
import ssm.pojo.UserExample;
import ssm.service.UserService;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;


    @Override
    public int insert(User user) {
        return userMapper.insert(user);
    }

    @Override
    public int deleteByPrimaryKey(Integer userId) {
        return userMapper.deleteByPrimaryKey(userId);
    }

    @Override
    public int updateByPrimaryKey(User user) {
        return userMapper.updateByPrimaryKey(user);
    }

    @Override
    public List<User> selectAll() {
        return userMapper.selectAll();
    }

    @Override
    public List<User> selectByUserNameAndPassword(String userName,String userPassword) {
        UserExample example=new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andUserNameEqualTo(userName);
        criteria.andUserPasswordEqualTo(userPassword);
        return userMapper.selectByExample(example);
    }

    @Override
    public User selectByPrimaryKey(Integer userId) {
        User user=userMapper.selectByPrimaryKey(userId);
        System.out.println("Service");
        System.out.println(user.getUserName()+user.getUserPassword());
        return user;
    }
}
