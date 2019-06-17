package ssm.pojo;

public class Spa {
    private Integer spaId;

    private String spaName;

    private String spaType;

    private Double spaDuration;

    private Double spaPrice;

    private Integer spaLeftCount;

    private String spaDescription;

    public Spa(Integer spaId, String spaName, String spaType, Double spaDuration, Double spaPrice, Integer spaLeftCount, String spaDescription) {
        this.spaId = spaId;
        this.spaName = spaName;
        this.spaType = spaType;
        this.spaDuration = spaDuration;
        this.spaPrice = spaPrice;
        this.spaLeftCount = spaLeftCount;
        this.spaDescription = spaDescription;
    }

    public Spa() {
        super();
    }

    public Integer getSpaId() {
        return spaId;
    }

    public void setSpaId(Integer spaId) {
        this.spaId = spaId;
    }

    public String getSpaName() {
        return spaName;
    }

    public void setSpaName(String spaName) {
        this.spaName = spaName == null ? null : spaName.trim();
    }

    public String getSpaType() {
        return spaType;
    }

    public void setSpaType(String spaType) {
        this.spaType = spaType == null ? null : spaType.trim();
    }

    public Double getSpaDuration() {
        return spaDuration;
    }

    public void setSpaDuration(Double spaDuration) {
        this.spaDuration = spaDuration;
    }

    public Double getSpaPrice() {
        return spaPrice;
    }

    public void setSpaPrice(Double spaPrice) {
        this.spaPrice = spaPrice;
    }

    public Integer getSpaLeftCount() {
        return spaLeftCount;
    }

    public void setSpaLeftCount(Integer spaLeftCount) {
        this.spaLeftCount = spaLeftCount;
    }

    public String getSpaDescription() {
        return spaDescription;
    }

    public void setSpaDescription(String spaDescription) {
        this.spaDescription = spaDescription == null ? null : spaDescription.trim();
    }
}