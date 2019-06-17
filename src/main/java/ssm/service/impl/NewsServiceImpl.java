package ssm.service.impl;

import org.springframework.stereotype.Service;
import ssm.dao.NewsMapper;
import ssm.pojo.News;
import ssm.service.NewsService;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

@Service
public class NewsServiceImpl implements NewsService {

    @Resource
    private NewsMapper newsMapper;

    @Override
    public int insert(News news) {
        return newsMapper.insert(news);
    }

    @Override
    public int deleteByPrimaryKey(Integer newsId) {
        return newsMapper.deleteByPrimaryKey(newsId);
    }

    @Override
    public int updateByPrimaryKey(News news) {
        return newsMapper.updateByPrimaryKey(news);
    }

    @Override
    public List<News> selectAll() {
        List<News> list=newsMapper.selectAll();
        List<News> newsList=new ArrayList<News>();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date now=new Date();
        for (News n:list) {
            try {
                Date date=sdf.parse(n.getNewsDate());
                if(date.getTime()>now.getTime()){
                    newsList.add(n);
                }
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        return newsList;
    }
}
