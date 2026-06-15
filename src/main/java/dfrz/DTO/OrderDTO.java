package dfrz.DTO;

/**
 * @Description 封装待签收的订单信息
 * @Author zhouyan
 * @Date 2026/3/13 17:11
 */
public class OrderDTO {
    private int id;
    private  String createTime;
    private  String shopName;
    private  Double price;

    public OrderDTO() {
    }

    public OrderDTO(int id, String createTime, String shopName, Double price) {
        this.id = id;
        this.createTime = createTime;
        this.shopName = shopName;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "OrderDTO{" +
                "id=" + id +
                ", createTime='" + createTime + '\'' +
                ", shopName='" + shopName + '\'' +
                ", price=" + price +
                '}';
    }
}
