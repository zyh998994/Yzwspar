package cn.pojo;

public class SellerForm {
    /**
     * 商家信息表
     */
    private Integer seid;   //商家信息ID
    private String sename;  //商家名
    private String sepwd;   //商家密码
    private String sephone; //商家电话
    private String seaddress;   //商家地址

    public Integer getSeid() {
        return seid;
    }

    public void setSeid(Integer seid) {
        this.seid = seid;
    }

    public String getSename() {
        return sename;
    }

    public void setSename(String sename) {
        this.sename = sename;
    }

    public String getSepwd() {
        return sepwd;
    }

    public void setSepwd(String sepwd) {
        this.sepwd = sepwd;
    }

    public String getSephone() {
        return sephone;
    }

    public void setSephone(String sephone) {
        this.sephone = sephone;
    }

    public String getSeaddress() {
        return seaddress;
    }

    public void setSeaddress(String seaddress) {
        this.seaddress = seaddress;
    }
}
