package cn.pojo;

import javax.xml.crypto.Data;

public class GoodsForm {
    private Integer gid;
    private String gname;
    private float gprice;
    private String ginfo;
    private String gimage;
    private String ginfoimage;
    private Data gdate;
    private Integer sid;
    private Integer gstate;
    private Integer tid;

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public float getGprice() {
        return gprice;
    }

    public void setGprice(float gprice) {
        this.gprice = gprice;
    }

    public String getGinfo() {
        return ginfo;
    }

    public void setGinfo(String ginfo) {
        this.ginfo = ginfo;
    }

    public String getGimage() {
        return gimage;
    }

    public void setGimage(String gimage) {
        this.gimage = gimage;
    }

    public String getGinfoimage() {
        return ginfoimage;
    }

    public void setGinfoimage(String ginfoimage) {
        this.ginfoimage = ginfoimage;
    }

    public Data getGdate() {
        return gdate;
    }

    public void setGdate(Data gdate) {
        this.gdate = gdate;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getGstate() {
        return gstate;
    }

    public void setGstate(Integer gstate) {
        this.gstate = gstate;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }
}
