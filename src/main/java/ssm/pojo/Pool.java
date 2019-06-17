package ssm.pojo;

public class Pool {
    private Integer poolId;

    private String poolName;

    private Double poolDuration;

    private Double poolPrice;

    private Integer poolLeftCount;

    private String poolDescription;

    public Pool(Integer poolId, String poolName, Double poolDuration, Double poolPrice, Integer poolLeftCount, String poolDescription) {
        this.poolId = poolId;
        this.poolName = poolName;
        this.poolDuration = poolDuration;
        this.poolPrice = poolPrice;
        this.poolLeftCount = poolLeftCount;
        this.poolDescription = poolDescription;
    }

    public Pool() {
        super();
    }

    public Integer getPoolId() {
        return poolId;
    }

    public void setPoolId(Integer poolId) {
        this.poolId = poolId;
    }

    public String getPoolName() {
        return poolName;
    }

    public void setPoolName(String poolName) {
        this.poolName = poolName == null ? null : poolName.trim();
    }

    public Double getPoolDuration() {
        return poolDuration;
    }

    public void setPoolDuration(Double poolDuration) {
        this.poolDuration = poolDuration;
    }

    public Double getPoolPrice() {
        return poolPrice;
    }

    public void setPoolPrice(Double poolPrice) {
        this.poolPrice = poolPrice;
    }

    public Integer getPoolLeftCount() {
        return poolLeftCount;
    }

    public void setPoolLeftCount(Integer poolLeftCount) {
        this.poolLeftCount = poolLeftCount;
    }

    public String getPoolDescription() {
        return poolDescription;
    }

    public void setPoolDescription(String poolDescription) {
        this.poolDescription = poolDescription == null ? null : poolDescription.trim();
    }
}