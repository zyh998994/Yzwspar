package cn.service;

import cn.pojo.GoodsForm;

import java.util.List;

public interface GoodsFormService {
    /**
     *根据商品名模糊查询商品信息
     * @param gname
     * @return
     */
    List<GoodsForm> selfuzzy(String gname);
}
