package cn.pojo;

import java.util.Date;

public class OrderForm {
    /**
     *订单表
     */
    private Integer oid;    //订单ID
    private String onum;    //订单数量
    private Integer uid;    //微信用户ID
    private Integer seid;   //商家ID
    private Date odatetime; //订单产生时间
    private Integer aid;    //地址ID

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public String getOnum() {
        return onum;
    }

    public void setOnum(String onum) {
        this.onum = onum;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getSeid() {
        return seid;
    }

    public void setSeid(Integer seid) {
        this.seid = seid;
    }

    public Date getOdatetime() {
        return odatetime;
    }

    public void setOdatetime(Date odatetime) {
        this.odatetime = odatetime;
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }
}
