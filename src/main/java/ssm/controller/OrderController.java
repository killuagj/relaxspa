package ssm.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import ssm.pojo.Order;
import ssm.pojo.User;
import ssm.service.impl.OrderServiceImpl;
import ssm.service.impl.UserServiceImpl;

import javax.annotation.Resource;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

@Controller
@RequestMapping("order")
public class OrderController {

    @Autowired
    private JavaMailSender javaMailSender;//在spring中配置的邮件发送的bean

    @Resource
    private OrderServiceImpl orderServiceImpl;
    @Resource
    private UserServiceImpl userServiceImpl;

    @RequestMapping("insertOrder")
    @ResponseBody
    public String insertOrder(Order order){
//        SendMailController sendMailController=new SendMailController();

        //发送邮件
        int userId=Integer.parseInt(order.getOrderNumber());
        User user=userServiceImpl.selectByPrimaryKey(userId);
        System.out.println(user.getUserName());

        String receive=user.getUserEmail();
        String userName=user.getUserName();
        String serviceType=order.getOrderType();
        String serviceName=order.getOrderService();
        Integer guestCount=order.getGuestCount();
        String date=order.getOrderDate();
        String time=order.getOrderTime();
        String location=order.getOrderLocation();

        //创建邮件对象
        MimeMessage mMessage=javaMailSender.createMimeMessage();
        MimeMessageHelper mMessageHelper;
        Properties prop = new Properties();
        String from;
        try {
            //从配置文件中拿到发件人邮箱地址
            prop.load(this.getClass().getResourceAsStream("/mail.properties"));
            from = prop.get("mail.smtp.username")+"";
            mMessageHelper=new MimeMessageHelper(mMessage,true);
            mMessageHelper.setFrom(from);//发件人邮箱
            mMessageHelper.setTo(receive);//收件人邮箱
            mMessageHelper.setSubject("欢迎预定RELAXSPA的服务");//邮件的主题
            mMessageHelper.setText("<p>尊敬的用户"+userName+"您好，欢迎使用RELAXSPA网上预约订购"+serviceType+"服务</p><br/>" +
                    "<p>您预约的服务名称为"+serviceName+"，共"+guestCount+"位顾客一同前往</p><br/>" +
                    "<p>请您于"+date+"当天"+time+"抵达"+location+"门店，我们将竭诚为您服务。</p><br/>" +
                    "<p>恭候您的光临</p><br/>" +
                    "<a href='http://localhost:8080'>打开RELAXSPA主页</a><br/>" +
                    "<img src='cid:info'>",true);//邮件的文本内容，true表示文本以html格式打开
            File file=new File("D:/www/bg.jpg");//在邮件中添加一张图片
            FileSystemResource resource=new FileSystemResource(file);
            mMessageHelper.addInline("info", resource);//引用id
            mMessageHelper.addAttachment("bg.jpg", resource);//在邮件中添加一个附件
            javaMailSender.send(mMessage);//发送邮件
        } catch (MessagingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        int i=orderServiceImpl.insert(order);
//        if(i>0&&result=="发送成功"){
            if(i>0) {
                return "insert success";
            }
//        }
        return "insert fail";
    }

    @RequestMapping("deleteByPrimaryKey")
    @ResponseBody
    public String deleteByPrimaryKey(Integer orderId){
        //判断避免空指针
        if(orderId!=null){
            int i=orderServiceImpl.deleteByPrimaryKey(orderId);
            if(i>0){
                return "delete success";
            }
        }
        return "delete fail";
    }

    @RequestMapping("updateByPrimaryKey")
    @ResponseBody
    public String updateByPrimaryKey(Order order){
        int i=orderServiceImpl.updateByPrimaryKey(order);
        if(i>0){
            return "update success";
        }
        return "update fail";
    }

    @RequestMapping("selectAll")
    @ResponseBody
    public String selectAll(){
        List<Order> list=orderServiceImpl.selectAll();
        JSONArray jsonArray = JSONArray.fromObject(list);
        return jsonArray.toString();
    }
    @RequestMapping("/selectAllByPage")
    @ResponseBody
    public String selectAllByPage(@RequestParam(required = false, defaultValue = "1") Integer startPage,
                                  @RequestParam(required = false, defaultValue = "5") Integer PageSize) {
        PageHelper.startPage(startPage, PageSize);
        List<Order> list = new ArrayList<>();
        list = orderServiceImpl.selectAll();
        PageInfo<Order> pi = new PageInfo<>(list);
        JSONArray jsonArray = JSONArray.fromObject(list);
        return jsonArray.toString();
    }

    //查询我的订单
    @RequestMapping("selectByOrderNumber")
    @ResponseBody
    public String selectByOrderNumber(Integer userId){
        System.out.println(userId);
        if(userId!=null){
            String orderNumber=userId.toString();
            List<Order> list=orderServiceImpl.selectByOrderNumber(orderNumber);
            JSONArray jsonArray = JSONArray.fromObject(list);
            return jsonArray.toString();
        }
        return "select fail";


    }

}
