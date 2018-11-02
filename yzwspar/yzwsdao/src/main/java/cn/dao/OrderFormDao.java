package cn.dao;

import cn.pojo.OrderForm;

import java.util.List;

public interface OrderFormDao {

    /**
     *
     * @return
     */
    int insorder();
    /**
     *  订单展示
     * @return
     */


    List<OrderForm> selall();

    /**
     * 修改订单
     * @param ord
     * @return
     */
    OrderForm updorder(OrderForm ord);

}
