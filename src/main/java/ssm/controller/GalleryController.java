package ssm.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import net.sf.json.JSONArray;
import org.apache.commons.io.FilenameUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import ssm.pojo.Gallery;
import ssm.service.impl.GalleryServiceImpl;

import javax.annotation.Resource;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("gallery")
public class GalleryController {

    @Resource
    private GalleryServiceImpl galleryServiceImpl;

    @RequestMapping("/insertGallery")
    @ResponseBody
    public String insertGallery(Gallery gallery,
                         @RequestParam(value = "file") MultipartFile pictureFile) throws Exception {

        // UUID重命名
        String name = UUID.randomUUID().toString().replaceAll("-", "");
        // 扩展名
        String ext = FilenameUtils.getExtension(pictureFile
                .getOriginalFilename());
        // 图片存入nginx静态资源地址
        pictureFile.transferTo(new File("D:/www/"+ name + "." + ext));
        // 路径入库
        gallery.setImagePath("http://localhost:8089/" + name + "." + ext);
        int i=galleryServiceImpl.insert(gallery);
        if(i>0){
            System.out.println(i);
            System.out.println("insert success");
            return "insert success";
        }
        return "insert fail";
    }

    @RequestMapping("deleteByPrimaryKey")
    @ResponseBody
    public String deleteByPrimaryKey(Integer imageId){
        //判断避免空指针
        if(imageId!=null){
            int i=galleryServiceImpl.deleteByPrimaryKey(imageId);
            if(i>0){
                System.out.println(imageId);
                return "delete success";
            }
        }
        return "delete fail";
    }

    @RequestMapping("updateByPrimaryKey")
    @ResponseBody
    public String updateByPrimaryKey(Gallery gallery){
        int i=galleryServiceImpl.updateByPrimaryKey(gallery);
        if(i>0){
            return "update success";
        }
        return "update fail";
    }

    @RequestMapping("selectAll")
    @ResponseBody
    public String selectAll(){
        List<Gallery> list=galleryServiceImpl.selectAll();
        JSONArray jsonArray = JSONArray.fromObject(list);
        return jsonArray.toString();
    }


    @RequestMapping("/selectAllByPage")
    @ResponseBody
    public String selectAllByPage(@RequestParam(required = false, defaultValue = "1") Integer startPage,
                                  @RequestParam(required = false, defaultValue = "5") Integer PageSize) {
        PageHelper.startPage(startPage, PageSize);
        List<Gallery> list = new ArrayList<>();
        list = galleryServiceImpl.selectAll();
        PageInfo<Gallery> pi = new PageInfo<>(list);
        JSONArray jsonArray = JSONArray.fromObject(list);
        return jsonArray.toString();
    }

    @RequestMapping("selectByImageType")
    @ResponseBody
    public String selectByImageType(String imageType){
        List<Gallery> list=galleryServiceImpl.selectByImageType(imageType);
        JSONArray jsonArray = JSONArray.fromObject(list);
        return jsonArray.toString();
    }
}
