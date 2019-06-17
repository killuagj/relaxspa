package ssm.service;

import ssm.pojo.Feedback;

import java.util.List;

public interface FeedbackService {
    public int insert(Feedback feedback);
    public int deleteByPrimaryKey(Integer feedbackId);
    public int updateByPrimaryKey(Feedback feedback);
    public List<Feedback> selectAll();
}
