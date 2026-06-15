package dfrz.domain;

/**
 * @Description 订单明细
 * @Author zhouyan
 * @Date 2026/3/8 17:21
 */
public class Orders {
    private int id;
    private int userid;
    private String createTime;
    private String linkName;
    private String linkTel;
    private String linkAddress;
    private  int status;
    private  int shopId;


    public Orders() {
    }

    public Orders(int id, int userid, String createTime, String linkName, String linkTel, String linkAddress, int status, int shopId) {
        this.id = id;
        this.userid = userid;
        this.createTime = createTime;
        this.linkName = linkName;
        this.linkTel = linkTel;
        this.linkAddress = linkAddress;
        this.status = status;
        this.shopId = shopId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getLinkName() {
        return linkName;
    }

    public void setLinkName(String linkName) {
        this.linkName = linkName;
    }

    public String getLinkTel() {
        return linkTel;
    }

    public void setLinkTel(String linkTel) {
        this.linkTel = linkTel;
    }

    public String getLinkAddress() {
        return linkAddress;
    }

    public void setLinkAddress(String linkAddress) {
        this.linkAddress = linkAddress;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getShopId() {
        return shopId;
    }

    public void setShopId(int shopId) {
        this.shopId = shopId;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", userid=" + userid +
                ", createTime='" + createTime + '\'' +
                ", linkName='" + linkName + '\'' +
                ", linkTel='" + linkTel + '\'' +
                ", linkAddress='" + linkAddress + '\'' +
                ", status=" + status +
                ", shopId=" + shopId +
                '}';
    }
}
