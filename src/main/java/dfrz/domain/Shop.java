package dfrz.domain;

public class Shop {
    private int id;
    private String loginName;
    private String loginPassword;
    private String shopName;
    private String contactName;
    private String address;
    private String concatTel;
    private String openingHours;
    private int status;
    private String createDate;

    public Shop(int id, String loginName, String loginPassword, String shopName, String contactName, String address, String concatTel, String openingHours, int status, String createDate) {
        this.id = id;
        this.loginName = loginName;
        this.loginPassword = loginPassword;
        this.shopName = shopName;
        this.contactName = contactName;
        this.address = address;
        this.concatTel = concatTel;
        this.openingHours = openingHours;
        this.status = status;
        this.createDate = createDate;
    }

    public Shop() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getConcatTel() {
        return concatTel;
    }

    public void setConcatTel(String concatTel) {
        this.concatTel = concatTel;
    }

    public String getOpeningHours() {
        return openingHours;
    }

    public void setOpeningHours(String openingHours) {
        this.openingHours = openingHours;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "id=" + id +
                ", loginName='" + loginName + '\'' +
                ", loginPassword='" + loginPassword + '\'' +
                ", shopName='" + shopName + '\'' +
                ", contactName='" + contactName + '\'' +
                ", address='" + address + '\'' +
                ", concatTel='" + concatTel + '\'' +
                ", openingHours='" + openingHours + '\'' +
                ", status=" + status +
                ", createDate='" + createDate + '\'' +
                '}';
    }
}
