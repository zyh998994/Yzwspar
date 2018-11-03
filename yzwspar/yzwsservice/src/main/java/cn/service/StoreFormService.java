package cn.service;

import cn.pojo.StoreForm;

import java.util.List;

public interface StoreFormService {

    /**
     * 店铺展示
     * @return
     */
    String getAdd();

    /**
     * 分页
     * @param index 页数
     * @param PageSize 每页显示条目数
     * @return
     */
    List<StoreForm> getPage(Integer index, Integer PageSize);
}
