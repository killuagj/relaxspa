package ssm.service.impl;

import org.springframework.stereotype.Service;
import ssm.dao.FeedbackMapper;
import ssm.pojo.Feedback;
import ssm.service.FeedbackService;

import javax.annotation.Resource;
import java.util.List;

@Service
public class FeedbackServiceImpl implements FeedbackService {

    @Resource
    private FeedbackMapper feedbackMapper;

    @Override
    public int insert(Feedback feedback) {
        return feedbackMapper.insert(feedback);
    }

    @Override
    public int deleteByPrimaryKey(Integer feedbackId) {
        return feedbackMapper.deleteByPrimaryKey(feedbackId);
    }

    @Override
    public int updateByPrimaryKey(Feedback feedback) {
        return feedbackMapper.updateByPrimaryKey(feedback);
    }

    @Override
    public List<Feedback> selectAll() {
        return feedbackMapper.selectAll();
    }
}
