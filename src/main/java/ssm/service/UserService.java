package ssm.service;

import ssm.pojo.User;

import java.util.List;

public interface UserService {
    public int insert(User user);
    public int deleteByPrimaryKey(Integer userId);
    public int updateByPrimaryKey(User user);
    public List<User> selectAll();

    public List<User> selectByUserNameAndPassword(String userName, String userPassword);
    public User selectByPrimaryKey(Integer userId);
}
