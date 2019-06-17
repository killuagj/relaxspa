package ssm.controller;

import net.sf.json.JSONArray;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import ssm.pojo.Pool;
import ssm.pojo.Spa;
import ssm.service.impl.PoolServiceImpl;
import ssm.service.impl.SpaServiceImpl;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("car")
public class CarController {
    @Resource
    private SpaServiceImpl spaServiceImpl;
    @Resource
    private PoolServiceImpl poolServiceImpl;
    //购物车结算
    @RequestMapping("count")
    @ResponseBody
    public String carCount(@Param("orderType")String orderType, @Param("orderService")String orderService, @Param("guestCount")Integer guestCount){
        if(orderType!=null&&orderService!=null){
            if(orderType.equals("SPA")){
                List<Spa> spaList=spaServiceImpl.selectBySpaName(orderService);
                Spa spa=spaList.get(0);
                JSONArray jsonArray = JSONArray.fromObject(spa.getSpaPrice()*guestCount);
                return jsonArray.toString();
            }else if(orderType.equals("温泉")){
                List<Pool> poolList=poolServiceImpl.selectByPoolName(orderService);
                Pool pool=poolList.get(0);
                JSONArray jsonArray = JSONArray.fromObject(pool.getPoolPrice()*guestCount);
                return jsonArray.toString();
            }else if(orderType.equals("餐厅")){
                return "0.00";
            }
            return "0.00";
        }
        return "0.00";
    }
}
