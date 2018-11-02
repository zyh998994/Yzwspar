package cn.service;

import cn.pojo.GoodsForm;

public interface ShopcartService {
    /**
     * 获取添加到购物车商品的信息
     * @param gf
     * @return
     */
    GoodsForm seleinfo(GoodsForm gf);

    /**
     * 添加商品到购物车
     * @param goodf 商品信息
     * @param num   同一商品的订单数量
     * @return
     */

    String inseinfo(GoodsForm goodf, int num);
}
