package cn.service.impl;

import cn.dao.ShopcartDao;
import cn.pojo.Shopcart;
import cn.service.ShowShopCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("SSCSI")
public class ShowShopCartServiceImpl implements ShowShopCartService {
    @Autowired
    private ShopcartDao scd;
    public ShopcartDao getScd() {
        return scd;
    }
    public void setScd(ShopcartDao scd) {
        this.scd = scd;
    }


    @Override
    public List<Shopcart> shoplist(Shopcart sc) {

        return scd.selescilist(sc);
    }

    @Override
    public String deleshopinfo(Shopcart sc) {
         try {

             if(scd.deleshopcart(sc) > 0){
                 return "删除成功";
             }else {
                 return "删除失败";
             }
         }catch (Exception e){
             return "参数错误";
         }
    }


}
