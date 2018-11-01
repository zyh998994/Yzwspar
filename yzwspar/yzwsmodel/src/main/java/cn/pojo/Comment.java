package cn.pojo;

import javax.xml.crypto.Data;

/**
 *评论表
 */
public class Comment {
    private Integer cid;    //评论ID
    private Integer uuid;   //用户ID
    private String ccontent;    //评论内容
    private String cimage;  //评论图片
    private Integer cidentity;   //评论状态(1存在 0删除)
    private Data cdate; //

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

    public Integer getCidentity() {
        return cidentity;
    }

    public void setCidentity(Integer cidentity) {
        this.cidentity = cidentity;
    }

    public Data getCdate() {
        return cdate;
    }

    public void setCdate(Data cdate) {
        this.cdate = cdate;
    }
}
