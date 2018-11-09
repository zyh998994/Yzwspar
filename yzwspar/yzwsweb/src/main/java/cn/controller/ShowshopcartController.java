package cn.controller;

import cn.pojo.Shopcart;
import cn.service.ShowShopCartService;
import com.wordnik.swagger.annotations.ApiImplicitParam;
import com.wordnik.swagger.annotations.ApiImplicitParams;
import com.wordnik.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    /**
     * 显示购物车内接口
     * @param uuid 用户id
     * @return
     */

    @RequestMapping(value = "getshowinfo")
    @ResponseBody
    @ApiOperation(value = "显示购物车内商品",httpMethod = "GET", notes = "查询", response = String.class)
    @ApiImplicitParam(paramType = "query",required = false,name="uuid",dataType = "int",value = "用户id")
    public List<Shopcart> shoplist(@RequestParam("uuid") int uuid){
        Shopcart sc= new Shopcart();
        sc.setUuid(uuid);
        return showscs.shoplist(sc);
    }

    /**
     * 按照id删除购物车商品
     * @param uuid 用户ID
     * @param goodid 商品id
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "deleshop")
    @ApiOperation(value = "按照id删除购物车商品",httpMethod = "DELETE", notes = "删除", response = String.class)
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query",required = false,name="uuid",dataType = "int",value = "用户id"),
            @ApiImplicitParam(paramType = "query",required = false,name="goodid",dataType = "int",value = "商品id")
    })
    public String delejudge(@RequestParam ("uuid") int uuid, @RequestParam("goodid") int goodid){
        Shopcart sc= new Shopcart();
        sc.setUuid(uuid);
        sc.setGoodid(goodid);
        return showscs.deleshopinfo(sc);
    }
}
