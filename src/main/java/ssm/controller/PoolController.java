package ssm.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import net.sf.json.JSONArray;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import ssm.pojo.Pool;
import ssm.pojo.Spa;
import ssm.service.impl.PoolServiceImpl;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("pool")
public class PoolController {

    @Resource
    private PoolServiceImpl poolServiceImpl;


    @RequestMapping("insertPool")
    @ResponseBody
    public String insertPool(Pool pool){
        int i=poolServiceImpl.insert(pool);
        if(i>0){
            return "insert success";
        }
        return "insert fail";
    }

    @RequestMapping("deleteByPrimaryKey")
    @ResponseBody
    public String deleteByPrimaryKey(Integer poolId){
        //判断避免空指针
        if(poolId!=null){
            int i=poolServiceImpl.deleteByPrimaryKey(poolId);
            if(i>0){
                return "delete success";
            }
        }
        return "delete fail";
    }

    @RequestMapping("updateByPrimaryKey")
    @ResponseBody
    public String updateByPrimaryKey(Pool pool){
        int i=poolServiceImpl.updateByPrimaryKey(pool);
        if(i>0){
            return "update success";
        }
        return "update fail";
    }

    @RequestMapping("selectAll")
    @ResponseBody
    public String selectAll(){
        List<Pool> list=poolServiceImpl.selectAll();
        JSONArray jsonArray = JSONArray.fromObject(list);
        return jsonArray.toString();
    }

    @RequestMapping("/selectAllByPage")
    @ResponseBody
    public String selectAllByPage(@RequestParam(required = false, defaultValue = "1") Integer startPage,
                                  @RequestParam(required = false, defaultValue = "5") Integer PageSize) {
        PageHelper.startPage(startPage, PageSize);
        List<Pool> list = new ArrayList<>();
        list = poolServiceImpl.selectAll();
        PageInfo<Pool> pi = new PageInfo<>(list);
        JSONArray jsonArray = JSONArray.fromObject(list);
        return jsonArray.toString();
    }

    //获取所有温泉名称
    @RequestMapping("selectAllPoolName")
    @ResponseBody
    public String selectAllPoolName() {
        List<Pool> list = poolServiceImpl.selectAll();
        List<String> poolNameList=new ArrayList<String>();
        for (int i = 0; i < list.size(); i++) {
            String poolName=list.get(i).getPoolName();
            poolNameList.add(poolName);
        }
        JSONArray jsonArray = JSONArray.fromObject(poolNameList);
        return jsonArray.toString();
    }

    @RequestMapping("selectByPoolName")
    @ResponseBody
    public String selectBySpaName(String poolName){
        List<Pool> list=poolServiceImpl.selectByPoolName(poolName);
        JSONArray jsonArray = JSONArray.fromObject(list);
        return jsonArray.toString();
    }

}
