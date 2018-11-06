package cn.dao;

import cn.pojo.GoodsForm;
import cn.pojo.OrderForm;
import cn.pojo.Shopcart;

import java.util.List;

public interface OrderFormDao {

    /**
     *  根据购物车的订单
     *  添加到订单表
     * @return
     */
    List<Shopcart> selorder(Shopcart shopid);


    /**
     *增加订单
     * @return
     */
    int insorder(GoodsForm gsf);
    /**
     *  订单展示
     * @return
        */


    List<OrderForm> selall();

    /**
     * 根据订单id展示全部商品
     * @return
     */

    GoodsForm selall1( GoodsForm gi);

    /**
     * 跟据状态显示
     * @return
     */
     List<OrderForm> selobii(OrderForm state);

    /**
     * 修改订单
     * @param ord
     * @return
     */
    OrderForm updorder(OrderForm ord);

}
