package cn.dao;

import cn.pojo.GoodsForm;
import cn.pojo.Shopcart;

import java.util.List;

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

    /**
     * 修改前查询
     * @return
     */
    Shopcart seleShop(Shopcart sc);

    /**
     * 修改订单数量
     * @param sc
     * @return
     */
    int updateorderinfo(Shopcart sc);

    /**
     * 展示购物车的商品
     * @param sc
     * @return
     */
    List<Shopcart> selescilist(Shopcart sc);

    /**
     * 删除数据库中的内容
     * @param sc
     * @return
     */
    int deleshopcart(Shopcart sc);


}
