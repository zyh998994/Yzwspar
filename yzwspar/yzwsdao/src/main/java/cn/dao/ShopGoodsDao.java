package cn.dao;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShopGoodsDao {

    /**
     * 展示商店所有信息
     * @return
     */
    List<ShopGoodsDao> shopAll(@Param("shortid") Integer shortid);
}
