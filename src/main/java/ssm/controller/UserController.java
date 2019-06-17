package ssm.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import net.sf.json.JSONArray;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import ssm.pojo.User;
import ssm.service.impl.UserServiceImpl;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("user")
public class UserController {

    @Resource
    private UserServiceImpl userServiceImpl;

    @RequestMapping("insertUser")
    @ResponseBody
    public String insertUser(User user){
        int i=userServiceImpl.insert(user);
        //若成功插入一条数据
        if(i==1){
            return "insert success";
        }
        return "insert fail";
    }

    @RequestMapping("deleteByPrimaryKey")
    @ResponseBody
    public String deleteByPrimaryKey(Integer userId){
        //判断避免空指针
        if(userId!=null){
            int i=userServiceImpl.deleteByPrimaryKey(userId);
            if(i>0){
                return "delete success";
            }
        }
        return "delete fail";
    }

    @RequestMapping("updateByPrimaryKey")
    @ResponseBody
    public String updateByPrimaryKey(User user){
        int i=userServiceImpl.updateByPrimaryKey(user);
        if(i>0){
            return "update success";
        }
        return "update fail";
    }

//    @RequestMapping(value = "selectAll",produces = {"text/html;charset=utf-8"})
    @RequestMapping("selectAll")
    @ResponseBody
    public String selectAll(){
        List<User> list=userServiceImpl.selectAll();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getUserName());
        }
        JSONArray jsonArray = JSONArray.fromObject(list);
        return jsonArray.toString();
    }

    @RequestMapping("/selectAllByPage")
    @ResponseBody
    public String selectAllByPage(@RequestParam(required = false, defaultValue = "1") Integer startPage,
                             @RequestParam(required = false, defaultValue = "5") Integer PageSize) {
        PageHelper.startPage(startPage, PageSize);
        List<User> list = new ArrayList<>();
        list = userServiceImpl.selectAll();
        PageInfo<User> pi = new PageInfo<>(list);
        JSONArray jsonArray = JSONArray.fromObject(list);
        return jsonArray.toString();
    }

    //积分1000及以上的是管理员
    @RequestMapping("login")
    @ResponseBody
    public String login(String userName,String userPassword){
        //判断避免空指针
        if(userName!=null && userPassword!=null){
            List<User> list=userServiceImpl.selectByUserNameAndPassword(userName,userPassword);
            if(list.size()>0){
                JSONArray jsonArray = JSONArray.fromObject(list);
                return jsonArray.toString();

            }
        }
        return "login fail";
    }

    //查询用户信息
    @RequestMapping("userMessage")
    @ResponseBody
    public String selectByPrimaryKey(Integer userId){
        User user=userServiceImpl.selectByPrimaryKey(userId);
        JSONArray jsonArray = JSONArray.fromObject(user);
        return jsonArray.toString();
    }





}
