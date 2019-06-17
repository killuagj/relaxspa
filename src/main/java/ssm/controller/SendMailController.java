package ssm.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import ssm.pojo.Order;
import ssm.pojo.User;
import ssm.service.impl.UserServiceImpl;

import javax.annotation.Resource;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;
import java.io.IOException;
import java.util.Properties;

@Controller
@RequestMapping("mail")
public class SendMailController {
    @Autowired
    private JavaMailSender javaMailSender;//在spring中配置的邮件发送的bean
    @Resource
    private UserServiceImpl userServiceImpl;

    @RequestMapping("send")
    @ResponseBody
    public String sendMail(Order order){
        int userId=Integer.parseInt(order.getOrderNumber());
        User user=userServiceImpl.selectByPrimaryKey(userId);

        String receive=user.getUserEmail();
        String userName=user.getUserName();
        String serviceType=order.getOrderType();
        String serviceName=order.getOrderService();
        Integer guestCount=order.getGuestCount();
        String date=order.getOrderDate();
        String time=order.getOrderTime();
        String location=order.getOrderLocation();

        MimeMessage mMessage=javaMailSender.createMimeMessage();//创建邮件对象
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
                    "<p>请您于"+date+"当天"+time+"抵达位于"+location+"的门店，我们将竭诚为您服务。</p><br/>" +
                    "<p>恭候您的光临</p><br/>" +
                    "<a href='http://localhost:8080'>打开RELAXSPA主页</a><br/>" +
                    "<img src='cid:info'>",true);//邮件的文本内容，true表示文本以html格式打开
            File file=new File("D:/www/bg.jpg");//在邮件中添加一张图片
            FileSystemResource resource=new FileSystemResource(file);
            mMessageHelper.addInline("info", resource);//这里指定一个id,在上面引用
            mMessageHelper.addAttachment("bg.jpg", resource);//在邮件中添加一个附件
            javaMailSender.send(mMessage);//发送邮件
        } catch (MessagingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "发送成功";
    }
}
