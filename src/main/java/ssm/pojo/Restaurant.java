package ssm.pojo;

public class Restaurant {
    private Integer restaurantId;

    private String restaurantName;

    private Integer tableLeftCount;

    private String restaurantDescription;

    public Restaurant(Integer restaurantId, String restaurantName, Integer tableLeftCount, String restaurantDescription) {
        this.restaurantId = restaurantId;
        this.restaurantName = restaurantName;
        this.tableLeftCount = tableLeftCount;
        this.restaurantDescription = restaurantDescription;
    }

    public Restaurant() {
        super();
    }

    public Integer getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(Integer restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName == null ? null : restaurantName.trim();
    }

    public Integer getTableLeftCount() {
        return tableLeftCount;
    }

    public void setTableLeftCount(Integer tableLeftCount) {
        this.tableLeftCount = tableLeftCount;
    }

    public String getRestaurantDescription() {
        return restaurantDescription;
    }

    public void setRestaurantDescription(String restaurantDescription) {
        this.restaurantDescription = restaurantDescription == null ? null : restaurantDescription.trim();
    }
}