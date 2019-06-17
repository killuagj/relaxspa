package ssm.pojo;

public class Feedback {
    private Integer feedbackId;

    private String feedbackHeadline;

    private String feedbackContent;

    private String feedbackTime;

    public Feedback(Integer feedbackId, String feedbackHeadline, String feedbackContent, String feedbackTime) {
        this.feedbackId = feedbackId;
        this.feedbackHeadline = feedbackHeadline;
        this.feedbackContent = feedbackContent;
        this.feedbackTime = feedbackTime;
    }

    public Feedback() {
        super();
    }

    public Integer getFeedbackId() {
        return feedbackId;
    }

    public void setFeedbackId(Integer feedbackId) {
        this.feedbackId = feedbackId;
    }

    public String getFeedbackHeadline() {
        return feedbackHeadline;
    }

    public void setFeedbackHeadline(String feedbackHeadline) {
        this.feedbackHeadline = feedbackHeadline == null ? null : feedbackHeadline.trim();
    }

    public String getFeedbackContent() {
        return feedbackContent;
    }

    public void setFeedbackContent(String feedbackContent) {
        this.feedbackContent = feedbackContent == null ? null : feedbackContent.trim();
    }

    public String getFeedbackTime() {
        return feedbackTime;
    }

    public void setFeedbackTime(String feedbackTime) {
        this.feedbackTime = feedbackTime == null ? null : feedbackTime.trim();
    }
}