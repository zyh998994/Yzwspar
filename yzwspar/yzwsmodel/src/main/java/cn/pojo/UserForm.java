package cn.pojo;

import java.util.Date;

/**
 * 用户信息表
 */
public class UserForm {
    private Integer uid; //id
    private String openid; //微信登录的唯一标识
    private String country; //用户所在国家
    private Date greatedate;    //用户创建时间
    private Integer sex;    //用户性别
    private String headimg; //用户头像
    private String nickname;    //用户昵称
    private String mobileno;    //用户手机号

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Date getGreatedate() {
        return greatedate;
    }

    public void setGreatedate(Date greatedate) {
        this.greatedate = greatedate;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getHeadimg() {
        return headimg;
    }

    public void setHeadimg(String headimg) {
        this.headimg = headimg;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getMobileno() {
        return mobileno;
    }

    public void setMobileno(String mobileno) {
        this.mobileno = mobileno;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }
}
