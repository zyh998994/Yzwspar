package cn.controller;

import cn.pojo.Shopcart;
import cn.service.ShowShopCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("text/")
public class ShowshopcartController {
    @Autowired
    private ShowShopCartService showscs;

    public ShowShopCartService getShowscs() {
        return showscs;
    }
    public void setShowscs(ShowShopCartService showscs) {
        this.showscs = showscs;
    }

    @RequestMapping(value = "getshowinfo")
    @ResponseBody
    public List<Shopcart> shoplist(Shopcart sc){
        sc.setUuid(8);
        return showscs.shoplist(sc);
    }
    @ResponseBody
    @RequestMapping(value = "deleshop")
    public String delejudge(Shopcart sc){
        sc.setUuid(1);
        sc.setGoodid(-1);
        return showscs.deleshopinfo(sc);
    }
}
