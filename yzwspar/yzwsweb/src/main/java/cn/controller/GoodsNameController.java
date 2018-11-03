package cn.controller;

import cn.service.GoodsNameService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "test/")
public class GoodsNameController {
    @Autowired
    private GoodsNameService gns;

    public GoodsNameService getGns() {
        return gns;
    }

    public void setGns(GoodsNameService gns) {
        this.gns = gns;
    }
    @ResponseBody
    @RequestMapping(value = "goods")
    public String showGood(){

        return gns.getAll();
    }
}
