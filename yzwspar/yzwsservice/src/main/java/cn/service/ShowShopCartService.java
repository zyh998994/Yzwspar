package cn.service;

import cn.pojo.Shopcart;

import java.util.List;

public interface ShowShopCartService {
    /**
     * 展示购物车全部商品
     * @return
     */
    List<Shopcart> shoplist(Shopcart sc);

    /**
     * 删除
     * @param sc
     * @return
     */
    String deleshopinfo(Shopcart sc);



}
