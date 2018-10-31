package cn.pojo;

public class TypeForm {
        private Integer tid;    //id
        private String tname; //商品种类
        private Integer gnid;//商品类型

        public Integer getTid() {
            return tid;
        }

        public void setTid(Integer tid) {
            this.tid = tid;
        }

        public String getTname() {
            return tname;
        }

        public void setTname(String tname) {
            this.tname = tname;
        }

        public Integer getGnid() {
            return gnid;
        }

        public void setGnid(Integer gnid) {
            this.gnid = gnid;
        }
}
