package ssm.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import net.sf.json.JSONArray;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import ssm.pojo.Spa;
import ssm.service.impl.SpaServiceImpl;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("spa")
public class SpaController {

    @Resource
    private SpaServiceImpl spaServiceImpl;

    @RequestMapping("insertSpa")
    @ResponseBody
    public String insertSpa(Spa spa){
        int i=spaServiceImpl.insert(spa);
        if(i==1){
            return "insert success";
        }
        return "insert fail";
    }

    @RequestMapping("deleteByPrimaryKey")
    @ResponseBody
    public String deleteByPrimaryKey(Integer spaId){
        //判断避免空指针
        if(spaId!=null){
            int i=spaServiceImpl.deleteByPrimaryKey(spaId);
            if(i>0){
                return "delete success";
            }
        }
        return "delete fail";
    }

    @RequestMapping("updateByPrimaryKey")
    @ResponseBody
    public String updateByPrimaryKey(Spa spa){
        int i=spaServiceImpl.updateByPrimaryKey(spa);
        if(i>0){
            return "update success";
        }
        return "update fail";
    }

    @RequestMapping("selectAll")
    @ResponseBody
    public String selectAll(){
        List<Spa> list=spaServiceImpl.selectAll();
        JSONArray jsonArray = JSONArray.fromObject(list);
        return jsonArray.toString();
    }

    @RequestMapping("/selectAllByPage")
    @ResponseBody
    public String selectAllByPage(@RequestParam(required = false, defaultValue = "1") Integer startPage,
                             @RequestParam(required = false, defaultValue = "5") Integer PageSize) {
        PageHelper.startPage(startPage, PageSize);
        List<Spa> list = new ArrayList<>();
        list = spaServiceImpl.selectAll();
        PageInfo<Spa> pi = new PageInfo<>(list);
        JSONArray jsonArray = JSONArray.fromObject(list);
        return jsonArray.toString();
    }

    //获取所有spa名称
    @RequestMapping("selectAllSpaName")
    @ResponseBody
    public String selectAllSpaName() {
        List<Spa> list = spaServiceImpl.selectAll();
        List<String> spaNameList=new ArrayList<String>();
        for (int i = 0; i< list.size(); i++){
            String spaName=list.get(i).getSpaName();
            spaNameList.add(spaName);
        }
        JSONArray jsonArray = JSONArray.fromObject(spaNameList);
        return jsonArray.toString();
    }
    @RequestMapping("selectBySpaName")
    @ResponseBody
    public String selectBySpaName(String spaName){
        List<Spa> list=spaServiceImpl.selectBySpaName(spaName);
        JSONArray jsonArray = JSONArray.fromObject(list);
        return jsonArray.toString();
    }
}
