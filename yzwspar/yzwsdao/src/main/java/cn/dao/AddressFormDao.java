package cn.dao;


import cn.pojo.AddressForm;

import java.util.List;

public interface AddressFormDao {


     /**
     * 根据唯一标识来判断
     *查找
     * @return
     */
   AddressForm seladd(AddressForm ad);
    /**
     * 添加地址
     * @param addrs
     * @return
     */
    int address(AddressForm addrs);


}
