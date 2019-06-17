package ssm.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import net.sf.json.JSONArray;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import ssm.pojo.Feedback;
import ssm.service.impl.FeedbackServiceImpl;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("feedback")
public class FeedbackController {
    @Resource
    private FeedbackServiceImpl feedbackServiceImpl;

    @RequestMapping("insertFeedback")
    @ResponseBody
    public String insertFeedback(Feedback feedback){
        Date date=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        String feedbackDate=sdf.format(date);
        feedback.setFeedbackTime(feedbackDate);
        int i=feedbackServiceImpl.insert(feedback);
        if(i>0){
            return "insert success";
        }
        return "insert fail";
    }

    @RequestMapping("deleteByPrimaryKey")
    @ResponseBody
    public String deleteByPrimaryKey(Integer feedbackId){
        //判断避免空指针
        if(feedbackId!=null){
            int i=feedbackServiceImpl.deleteByPrimaryKey(feedbackId);
            if(i>0){
                return "delete success";
            }
        }
        return "delete fail";
    }

    @RequestMapping("updateByPrimaryKey")
    @ResponseBody
    public String updateByPrimaryKey(Feedback feedback){
        int i=feedbackServiceImpl.updateByPrimaryKey(feedback);
        if(i>0){
            return "update success";
        }
        return "update fail";
    }

    @RequestMapping("selectAll")
    @ResponseBody
    public String selectAll(){
        List<Feedback> list=feedbackServiceImpl.selectAll();
        JSONArray jsonArray = JSONArray.fromObject(list);
        return jsonArray.toString();
    }
    @RequestMapping("/selectAllByPage")
    @ResponseBody
    public String selectAllByPage(@RequestParam(required = false, defaultValue = "1") Integer startPage,
                                  @RequestParam(required = false, defaultValue = "5") Integer PageSize) {
        PageHelper.startPage(startPage, PageSize);
        List<Feedback> list = new ArrayList<>();
        list = feedbackServiceImpl.selectAll();
        PageInfo<Feedback> pi = new PageInfo<>(list);
        JSONArray jsonArray = JSONArray.fromObject(list);
        return jsonArray.toString();
    }
}
