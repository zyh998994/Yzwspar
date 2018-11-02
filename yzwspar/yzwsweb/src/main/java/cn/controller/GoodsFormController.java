package cn.controller;

import cn.pojo.GoodsForm;
import cn.service.GoodsFormService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
//@RequestMapping("/fuzzy")
public class GoodsFormController {
    @Autowired
    private GoodsFormService gsfs;

    public GoodsFormService getGsfs() {
        return gsfs;
    }

    public void setGsfs(GoodsFormService gsfs) {
        this.gsfs = gsfs;
    }

   /* @ResponseBody
    @RequestMapping(value = "/select",method = RequestMethod.GET)
    public String selfuzzy(String gname){
        System.out.println("aaaa" + gname);
        List<GoodsForm> goodList = gsfs.selfuzzy(gname);
        model.addAttribute("goodList",goodList);
        for (GoodsForm goods:goodList){
            System.out.println(goods.getGname() + goods.getGprice() + goods.getGinfo() + goods.getGimage() + goods.getGinfoimage());
        }
        System.out.println(goodList);
        return JSON.toJSONString(goodList);
        return JSON.toJSONString("success");
        return "{\"login\":\"success\"}";
        return "success";
    }*/

   @RequestMapping("/lala")
   @ResponseBody
   public List<GoodsForm> getsel(String gname,Model model){
       System.out.println(gname + "1111111111111");
       List<GoodsForm> goodList = gsfs.selfuzzy(gname);
       model.addAttribute("goodList",goodList);
       System.out.println(goodList);
      /* for (GoodsForm goods:goodList){
           System.out.println(goods.getGname() + goods.getGprice() + goods.getGinfo() + goods.getGimage() + goods.getGinfoimage());
       }*/
       return goodList;
   }
}
