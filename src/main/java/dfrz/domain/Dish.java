package dfrz.domain;

public class Dish {
    private int id;
    private int shopId;
    private int status;
    private String description;
    private String name;
    private double price;

    public Dish(int id, int shopId, int status, String description, String name, double price) {
        this.id = id;
        this.shopId = shopId;
        this.status = status;
        this.description = description;
        this.name = name;
        this.price = price;
    }

    public Dish() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getShopId() {
        return shopId;
    }

    public void setShopId(int shopId) {
        this.shopId = shopId;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "id=" + id +
                ", shopId=" + shopId +
                ", status=" + status +
                ", description='" + description + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
