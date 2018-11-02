package cn.dao;


import cn.pojo.AddressForm;

import java.util.List;

public interface AddressFormDao {


     /**
     * 根据唯一标识和默认来判断
     *查找
     * @return
     */
   AddressForm seladd(AddressForm ad);

    /**
     * 查找所有的地址
     * @param ad
     * @return
     */
   List<AddressForm> selall(AddressForm ad);

    /**
     * 查找地址个数
     * @param ad
     * @return
     */
   int selsite(AddressForm ad);
    /**
     * 添加地址
     * @param addrs
     * @return
     */
    int address(AddressForm addrs);

    /**
     * 根据用户ID和地址id删除
     * @param addrs
     * @return
     */
    int delsite(AddressForm addrs);
}
