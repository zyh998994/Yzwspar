package cn.dao;

import cn.pojo.GoodsForm;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsFormDao {

 /**
  * 根據商品名模糊查詢商品信息并分页显示
  * @return
  */
   List<GoodsForm> selfuzzy(@Param("gname")String gname);

    /**
     * 根据商品类型查询商品信息并分页显示
     * @param tid
     * @return
     */
    List<GoodsForm> selinfo(Integer tid);


    /**
     * 根据商品ID查询商品详细信息并分页显示
     * @param gid
     * @return
     */
    List<GoodsForm> selgoodsinfo(Integer gid);
}
