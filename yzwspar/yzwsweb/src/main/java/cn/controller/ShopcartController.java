package cn.controller;

import cn.pojo.GoodsForm;
import cn.pojo.Shopcart;
import cn.service.ShopcartService;
import com.wordnik.swagger.annotations.ApiImplicitParam;
import com.wordnik.swagger.annotations.ApiImplicitParams;
import com.wordnik.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.UnsupportedEncodingException;

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
    @ApiOperation(value = "新增商品到购物车/或者将所添加到购物车的商品数量叠加到购物车里", httpMethod = "POST",
            notes = "新增/修改数量",response = String.class)
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query" , required = false, name = "specs1", dataType = "String",
                    value = "规格一"),
            @ApiImplicitParam(paramType = "query" , required = false, name = "specs2", dataType = "int",
                    value = "规格一"),
            @ApiImplicitParam(paramType = "query" , required = false, name = "num", dataType = "int",
                    value = "数量"),
            @ApiImplicitParam(paramType = "query" , required = false, name = "uuid", dataType = "int",
                    value = "用户id"),
    })
    public Object getinfo(@RequestParam("specs1") String specs1,@RequestParam("specs2") int specs2,
                          @RequestParam("num") int num,@RequestParam("uuid") int uuid) throws UnsupportedEncodingException {

        specs1 = new String(specs1.getBytes("iso-8859-1"),"utf-8");
        GoodsForm gf = new GoodsForm();
        Shopcart sc = new Shopcart();
        gf.setSpecs1(specs1);//型号1
        gf.setSpecs2(specs2);//型号2
        sc.setUuid(uuid);
        shopcart.seleinfo(gf);
        return shopcart.judge(sc,gf,num);
    }
    /**
     * 修改数量
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "updanum")
    @ApiOperation(value = "修改购物车内商品的数量",httpMethod = "PUT", notes = "修改数量", response = String.class)
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query",required = false,name="uuid",dataType = "int",value = "用户id"),
            @ApiImplicitParam(paramType = "query",required = false,name="goodid",dataType = "int",value = "商品id"),
            @ApiImplicitParam(paramType = "query",required = false,name="goodid",dataType = "String",value = "y(增加一个)/n（减去一个）")
    })
    public String updashopnum(@RequestParam("uuid") int uuid, @RequestParam("goodid") int goodid, @RequestParam("choose") String choose){
        Shopcart sc = new Shopcart();
        sc.setUuid(uuid);
        sc.setGoodid(goodid);
        return shopcart.updaShopnum(sc,choose);
    }


}
