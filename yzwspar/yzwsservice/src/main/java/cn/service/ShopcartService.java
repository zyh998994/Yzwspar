package cn.service;

import cn.pojo.GoodsForm;
import cn.pojo.Shopcart;

public interface ShopcartService {
    /**
     * 获取添加到购物车商品的信息
     * @param gf
     * @return
     */
    GoodsForm seleinfo(GoodsForm gf);

    /**
     * 添加商品到购物车
     * @param sp
     * @return
     */
    int inseinfo(Shopcart sp);
}
