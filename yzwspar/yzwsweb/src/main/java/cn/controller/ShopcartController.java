package cn.controller;

import cn.pojo.GoodsForm;
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
    public String getinfo(GoodsForm gf){
        GoodsForm good = new GoodsForm();
        good.setSpecs1("黑白");//型号1
        good.setSpecs2(8);//型号2
        int num = 20;//数量
        shopcart.seleinfo(good);
        return shopcart.inseinfo(good,num);
    }

}
