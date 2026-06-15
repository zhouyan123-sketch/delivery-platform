package dfrz.domain;

/**
 * @Description
 * @Author zhouyan
 * @Date 2026/3/8 17:23
 */
public class OrderItem {
    private int id;
    private int orderId;
    private int dishId;
    private int buyNum;
    private double price;
    private int shopId;
    public OrderItem() {
    }

    public OrderItem(int id, int orderId, int dishId, int buyNum, double price, int shopId) {
        this.id = id;
        this.orderId = orderId;
        this.dishId = dishId;
        this.buyNum = buyNum;
        this.price = price;
        this.shopId = shopId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getDishId() {
        return dishId;
    }

    public void setDishId(int dishId) {
        this.dishId = dishId;
    }

    public int getBuyNum() {
        return buyNum;
    }

    public void setBuyNum(int buyNum) {
        this.buyNum = buyNum;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getShopId() {
        return shopId;
    }

    public void setShopId(int shopId) {
        this.shopId = shopId;
    }
}
