package cn.pojo;

import javax.xml.crypto.Data;

public class Comment {
    private Integer cid;
    private Integer uuid;
    private String ccontent;
    private String cimage;
    private String cidentity;
    private Data cdate;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getUuid() {
        return uuid;
    }

    public void setUuid(Integer uuid) {
        this.uuid = uuid;
    }

    public String getCcontent() {
        return ccontent;
    }

    public void setCcontent(String ccontent) {
        this.ccontent = ccontent;
    }

    public String getCimage() {
        return cimage;
    }

    public void setCimage(String cimage) {
        this.cimage = cimage;
    }

    public String getCidentity() {
        return cidentity;
    }

    public void setCidentity(String cidentity) {
        this.cidentity = cidentity;
    }

    public Data getCdate() {
        return cdate;
    }

    public void setCdate(Data cdate) {
        this.cdate = cdate;
    }
}
