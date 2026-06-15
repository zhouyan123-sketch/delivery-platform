package dfrz.domain;

/**
 * @Description
 * @Author zhouyan
 * @Date 2026/3/13 19:32
 */
public class OrderComment {
    private int id;
    private int userId;
    private int orderId;
    private String content;
    private String createTime;

    public OrderComment() {
    }

    public OrderComment(int id, int userId, int orderId, String content, String createTime) {
        this.id = id;
        this.userId = userId;
        this.orderId = orderId;
        this.content = content;
        this.createTime = createTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}
