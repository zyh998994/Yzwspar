package cn.dao;

import cn.pojo.GoodsForm;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsFormDao {

 /**
  * 根據商品名模糊查詢商品信息
  * @return
  */
   List<GoodsForm> selfuzzy(@Param("gname")String gname);
 }
