package ssm.pojo;

public class Order {
    private Integer orderId;

    private String orderNumber;

    private String orderType;

    private String orderService;

    private Integer guestCount;

    private String orderPrice;

    private String orderDate;

    private String orderTime;

    private String orderLocation;

    public Order(Integer orderId, String orderNumber, String orderType, String orderService, Integer guestCount, String orderPrice, String orderDate, String orderTime, String orderLocation) {
        this.orderId = orderId;
        this.orderNumber = orderNumber;
        this.orderType = orderType;
        this.orderService = orderService;
        this.guestCount = guestCount;
        this.orderPrice = orderPrice;
        this.orderDate = orderDate;
        this.orderTime = orderTime;
        this.orderLocation = orderLocation;
    }

    public Order() {
        super();
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber == null ? null : orderNumber.trim();
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType == null ? null : orderType.trim();
    }

    public String getOrderService() {
        return orderService;
    }

    public void setOrderService(String orderService) {
        this.orderService = orderService == null ? null : orderService.trim();
    }

    public Integer getGuestCount() {
        return guestCount;
    }

    public void setGuestCount(Integer guestCount) {
        this.guestCount = guestCount;
    }

    public String getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(String orderPrice) {
        this.orderPrice = orderPrice;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime == null ? null : orderTime.trim();
    }

    public String getOrderLocation() {
        return orderLocation;
    }

    public void setOrderLocation(String orderLocation) {
        this.orderLocation = orderLocation == null ? null : orderLocation.trim();
    }
}