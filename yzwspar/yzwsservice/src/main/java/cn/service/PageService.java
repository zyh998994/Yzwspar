package cn.service;

import cn.pojo.StoreForm;

import java.util.List;

public interface PageService {



    List<StoreForm> getPage(Integer index,Integer PageSize);
}
