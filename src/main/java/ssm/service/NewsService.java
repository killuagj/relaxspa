package ssm.service;

import ssm.pojo.News;

import java.util.List;

public interface NewsService {
    public int insert(News news);
    public int deleteByPrimaryKey(Integer newsId);
    public int updateByPrimaryKey(News news);
    public List<News> selectAll();
}
