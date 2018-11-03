package cn.controller;

import cn.pojo.GoodsForm;
import cn.pojo.Shopcart;
import cn.service.ShopcartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("test/")
@Controller
public class ShopcartController {
    @Autowired
    private ShopcartService shopcart;
    public ShopcartService getShopcart() {
        return shopcart;
    }

    public void setShopcart(ShopcartService shopcart) {
        this.shopcart = shopcart;
    }

    @ResponseBody
    @RequestMapping(value = "getinfo")
    public Object getinfo(GoodsForm gf){
        GoodsForm good = new GoodsForm();
        Shopcart sc = new Shopcart();
        good.setSpecs1("复活节");//型号1
        good.setSpecs2(9);//型号2
        int num = 2;//数量
        sc.setUuid(8);
        shopcart.seleinfo(good);
        return shopcart.judge(sc,good,num);
    }

}
