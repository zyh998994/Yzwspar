package cn.dao;

import cn.pojo.GoodsName;

import java.util.List;

public interface GoodsNameDao {
    /**
     * 获取分类名称
     * @return
     */

    List<GoodsName> getShow();

}
