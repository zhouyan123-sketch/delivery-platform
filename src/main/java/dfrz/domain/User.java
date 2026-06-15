package dfrz.domain;

/**
 * @Description
 * @Author zhouyan
 * @Date 2026/3/9 18:14
 */
public class User {
    private  int id;
    private  String loginName;
    private  String loginPassword;
    private  String realName;
    private  String createTime;
    private  int status;
    private  double vipMoney;

    public User() {
    }

    public User(int id, String loginName, String loginPassword, String realName, String createTime, int status, double vipMoney) {
        this.id = id;
        this.loginName = loginName;
        this.loginPassword = loginPassword;
        this.realName = realName;
        this.createTime = createTime;
        this.status = status;
        this.vipMoney = vipMoney;
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

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public double getVipMoney() {
        return vipMoney;
    }

    public void setVipMoney(double vipMoney) {
        this.vipMoney = vipMoney;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", loginName='" + loginName + '\'' +
                ", loginPassword='" + loginPassword + '\'' +
                ", realName='" + realName + '\'' +
                ", createTime='" + createTime + '\'' +
                ", status=" + status +
                ", vipMoney=" + vipMoney +
                '}';
    }
}
