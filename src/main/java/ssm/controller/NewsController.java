package ssm.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import net.sf.json.JSONArray;
import org.apache.commons.io.FilenameUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import ssm.pojo.Gallery;
import ssm.pojo.News;
import ssm.service.impl.NewsServiceImpl;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("news")
public class NewsController {

    @Resource
    private NewsServiceImpl newsServiceImpl;

    @RequestMapping("/insertNews")
    @ResponseBody
    public String insertNews(News news,
                                @RequestParam(value = "file") MultipartFile pictureFile) throws Exception {

        // UUID重命名
        String name = UUID.randomUUID().toString().replaceAll("-", "");
        // 扩展名
        String ext = FilenameUtils.getExtension(pictureFile
                .getOriginalFilename());
        // 图片存入nginx静态资源地址
        pictureFile.transferTo(new File("D:/www/"+ name + "." + ext));
        // 路径入库
        news.setNewsImageLocation("http://localhost:8089/" + name + "." + ext);
        int i=newsServiceImpl.insert(news);
        if(i>0){
            return "insert success";
        }
        return "insert fail";
    }

    @RequestMapping("deleteByPrimaryKey")
    @ResponseBody
    public String deleteByPrimaryKey(Integer newsId){
        //判断避免空指针
        if(newsId!=null){
            int i=newsServiceImpl.deleteByPrimaryKey(newsId);
            if(i>0){
                return "delete success";
            }
        }
        return "delete fail";
    }

    @RequestMapping("updateByPrimaryKey")
    @ResponseBody
    public String updateByPrimaryKey(News news){
        int i=newsServiceImpl.updateByPrimaryKey(news);
        if(i>0){
            return "update success";
        }
        return "update fail";
    }

    @RequestMapping("selectAll")
    @ResponseBody
    public String selectAll(){
        List<News> list=newsServiceImpl.selectAll();
        JSONArray jsonArray = JSONArray.fromObject(list);
        return jsonArray.toString();
    }

    @RequestMapping("/selectAllByPage")
    @ResponseBody
    public String selectAllByPage(@RequestParam(required = false, defaultValue = "1") Integer startPage,
                                  @RequestParam(required = false, defaultValue = "5") Integer PageSize) {
        PageHelper.startPage(startPage, PageSize);
        List<News> list = new ArrayList<>();
        list = newsServiceImpl.selectAll();
        PageInfo<News> pi = new PageInfo<>(list);
        JSONArray jsonArray = JSONArray.fromObject(list);
        return jsonArray.toString();
    }
}
