package cn.controller;

import cn.service.ShopGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class shopGoodsController {
    @Autowired
    private ShopGoodsService sgs;

    public ShopGoodsService getSgs() {
        return sgs;
    }

    public void setSgs(ShopGoodsService sgs) {
        this.sgs = sgs;
    }
    @RequestMapping("shopshow")
    @ResponseBody
    public String shopShow(@RequestParam("shortid") Integer shortid){
        return sgs.showAll(shortid);
    }
}
