package cn.service;

import cn.pojo.GoodsForm;
import cn.pojo.OrderForm;

import java.util.List;

public interface OrdeFomService {

    /**
     *增加订单
     * @return
     */
    String  insorder(GoodsForm gsf);
    /**
     * 获取添加到购物车商品的信息
     * @param gf
     * @return
     */
    GoodsForm seleinfo(GoodsForm gf);

    /**
     *  订单展示
     * @return
     */
    List<OrderForm> selall();
    /**
     * 展示
     * @return
     */
   String selall1();

    /**
     *状态展示
     * @param stat
     * @return
     */
    List<OrderForm> selobi(OrderForm stat);
    /**
     *状态展示
     * @return
     */
    String selobi1(OrderForm stat);
}
