package cn.dao;

import cn.pojo.GoodsForm;
import cn.pojo.Shopcart;

public interface ShopcartDao {
    /**
     * 获取商品信息，和商家id
     * @param gf
     * @return
     */
    GoodsForm seleinfo(GoodsForm gf);

    /**
     * 新增商品到购物车
     * @param sc
     * @return
     */
    int inserjudge(Shopcart sc);
}
