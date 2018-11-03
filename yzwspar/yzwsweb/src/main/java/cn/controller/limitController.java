package cn.controller;

import cn.service.LimitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class limitController {

    @Autowired
    private LimitService lis;

    public LimitService getLis() {
        return lis;
    }

    public void setLis(LimitService lis) {
        this.lis = lis;
    }

    /**
     * 分页
     * @return
     */
    @ResponseBody
    @RequestMapping("/all")
    public String fenye(){

        return lis.getPageByIndex(1,5);
    }


}
