package cn.controller;

import cn.service.StoreFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping(value = "test/")
@Controller
public class StoreFormController {
    @Autowired
    private StoreFormService sfs;

    public StoreFormService getSfs() {
        return sfs;
    }

    public void setSfs(StoreFormService sfs) {
        this.sfs = sfs;
    }

    @ResponseBody
    @RequestMapping(value = "showall")
    public String showAll(){
        return sfs.getAdd();
    }


}
