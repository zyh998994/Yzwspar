package cn.dao;

import cn.pojo.StoreForm;

import java.util.List;

public interface StoreFormDao {
    /**
     * 查询店铺
     * @return
     */
    List<StoreForm> getAll();

    /**
     * 分页
     * @return
     */
    List<StoreForm> getPageByIndex();
}
