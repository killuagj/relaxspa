package ssm.pojo;


public class News {
    private Integer newsId;

    private String newsName;

    private String newsDate;

    private String newsPlace;

    private String newsImageLocation;

    private String newsDescription;

    public News(Integer newsId, String newsName, String newsDate, String newsPlace, String newsImageLocation, String newsDescription) {
        this.newsId = newsId;
        this.newsName = newsName;
        this.newsDate = newsDate;
        this.newsPlace = newsPlace;
        this.newsImageLocation = newsImageLocation;
        this.newsDescription = newsDescription;
    }

    public News() {
        super();
    }

    public Integer getNewsId() {
        return newsId;
    }

    public void setNewsId(Integer newsId) {
        this.newsId = newsId;
    }

    public String getNewsName() {
        return newsName;
    }

    public void setNewsName(String newsName) {
        this.newsName = newsName == null ? null : newsName.trim();
    }

    public String getNewsDate() {
        return newsDate;
    }

    public void setNewsDate(String newsDate) {
        this.newsDate = newsDate;
    }

    public String getNewsPlace() {
        return newsPlace;
    }

    public void setNewsPlace(String newsPlace) {
        this.newsPlace = newsPlace == null ? null : newsPlace.trim();
    }

    public String getNewsImageLocation() {
        return newsImageLocation;
    }

    public void setNewsImageLocation(String newsImageLocation) {
        this.newsImageLocation = newsImageLocation == null ? null : newsImageLocation.trim();
    }

    public String getNewsDescription() {
        return newsDescription;
    }

    public void setNewsDescription(String newsDescription) {
        this.newsDescription = newsDescription == null ? null : newsDescription.trim();
    }
}