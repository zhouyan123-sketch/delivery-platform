package dfrz.DTO;

/**
 * @Description 订单对应的菜品
 * @Author zhouyan
 * @Date 2026/3/12 19:25
 */
public class DishDTO {
    private String name;
    private int buyNum;

    public DishDTO() {
    }

    public DishDTO(String name, int buyNum) {
        this.name = name;
        this.buyNum = buyNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBuyNum() {
        return buyNum;
    }

    public void setBuyNum(int buyNum) {
        this.buyNum = buyNum;
    }

    @Override
    public String toString() {
        return "DishDTO{" +
                "name='" + name + '\'' +
                ", buyNum=" + buyNum +
                '}';
    }
}
