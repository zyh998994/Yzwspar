package cn.dao;

import cn.pojo.TypeForm;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TypeFormDao {
   /* *//**
     * 商品展示
     * @return
     *//*
    List<TypeForm> TypeShow();*/

    /**
     * 根据类型id查询
     *
     * @return
     */
    List<TypeForm> TypeAll(@Param("gnid") Integer gnid);

    List<TypeForm> getAllType(TypeForm typeForm);

}
