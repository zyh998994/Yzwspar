package cn.controller;

import cn.service.GoodsFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/goodsinfo")
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

    /**
     * 模糊查询，根据商品名查询出商品并分页显示
     * @param
     * @param
     * @return
     */
   @RequestMapping(value = "/fuzzyshow")
   @ResponseBody
   public String selfuzzy(){
       return gsfs.getPageByIndexFuzzy(1,5);
   }
   /*public String getsel(String gname, Model model){
       System.out.println(gname + "1111111111111");
       List<GoodsForm> goodList = gsfs.selfuzzy(gname);
       model.addAttribute("goodList",goodList);
       System.out.println(goodList);
       *//*for (GoodsForm goods:goodList){
           System.out.println(goods.getGname() + goods.getGprice() + goods.getGinfo() + goods.getGimage() + goods.getGinfoimage());
       }*//*
       return JSON.toJSONString(goodList);
   }*/


    /**
     * ，根据商品类型展示出商品信息并分页显示
     * @param
     * @return
     */
    @RequestMapping("/goodsshow")
    @ResponseBody
    public String selinfo(){
        return gsfs.getPageByIndexInfo(1,5);
    }
   /* public String selinfo(Integer tid, Model model){
       List<GoodsForm> goodshow = gsfs.selinfo(tid);
       model.addAttribute("goodshow",goodshow);
       System.out.println(goodshow);
       return JSON.toJSONString(goodshow);
   }*/

    /**
     * 根据商品ID查询商品所有信息并分页显示
     * @return
     */
   @RequestMapping("goodsinfoshow")
   @ResponseBody
   public String selgoodsinfo(){
       return gsfs.getPageByIndexInfo(1,3);
   }
}
