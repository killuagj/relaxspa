package ssm.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import net.sf.json.JSONArray;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import ssm.pojo.Restaurant;
import ssm.pojo.Spa;
import ssm.service.impl.RestaurantServiceImpl;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("restaurant")
public class RestaurantController {
    @Resource
    private RestaurantServiceImpl restaurantServiceImpl;


    @RequestMapping("insertRestaurant")
    @ResponseBody
    public String insertRestaurant(Restaurant restaurant){
        int i=restaurantServiceImpl.insert(restaurant);
        if(i==1){
            return "insert success";
        }
        return "insert fail";
    }

    @RequestMapping("deleteByPrimaryKey")
    @ResponseBody
    public String deleteByPrimaryKey(Integer restaurantId){
        //判断避免空指针
        if(restaurantId!=null){
            int i=restaurantServiceImpl.deleteByPrimaryKey(restaurantId);
            if(i>0){
                return "delete success";
            }
        }
        return "delete fail";
    }

    @RequestMapping("updateByPrimaryKey")
    @ResponseBody
    public String updateByPrimaryKey(Restaurant restaurant){
        int i=restaurantServiceImpl.updateByPrimaryKey(restaurant);
        if(i>0){
            return "update success";
        }
        return "update fail";
    }

    @RequestMapping("selectAll")
    @ResponseBody
    public String selectAll(){
        List<Restaurant> list=restaurantServiceImpl.selectAll();
        JSONArray jsonArray = JSONArray.fromObject(list);
        return jsonArray.toString();
    }

    @RequestMapping("/selectAllByPage")
    @ResponseBody
    public String selectAllByPage(@RequestParam(required = false, defaultValue = "1") Integer startPage,
                                  @RequestParam(required = false, defaultValue = "5") Integer PageSize) {
        PageHelper.startPage(startPage, PageSize);
        List<Restaurant> list = new ArrayList<>();
        list = restaurantServiceImpl.selectAll();
        PageInfo<Restaurant> pi = new PageInfo<>(list);
        JSONArray jsonArray = JSONArray.fromObject(list);
        return jsonArray.toString();
    }

    //获取所有restaurant名称
    @RequestMapping("selectAllRestaurantName")
    @ResponseBody
    public String selectAllRestaurantName() {
        List<Restaurant> list = restaurantServiceImpl.selectAll();
        List<String> restaurantNameList=new ArrayList<String>();
        for (int i = 0; i < list.size(); i++) {
            String restaurantName=list.get(i).getRestaurantName();
            restaurantNameList.add(restaurantName);
        }
        JSONArray jsonArray = JSONArray.fromObject(restaurantNameList);
        return jsonArray.toString();
    }

    @RequestMapping("selectBySpaName")
    @ResponseBody
    public String selectBySpaName(String restaurantName){
        List<Restaurant> list=restaurantServiceImpl.selectByRestaurantName(restaurantName);
        JSONArray jsonArray = JSONArray.fromObject(list);
        return jsonArray.toString();
    }

}
