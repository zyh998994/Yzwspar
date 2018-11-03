package cn.controller;

import cn.service.TypeFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping(value = "test/")
@Controller
public class TypeFormControler {
    @Autowired
    private TypeFormService tfs;

    public TypeFormService getTfs() {
        return tfs;
    }

    public void setTfs(TypeFormService tfs) {
        this.tfs = tfs;
    }
    @RequestMapping(value = "typeall/{gnid}")
    @ResponseBody
    public String TypeAll(@PathVariable("gnid") Integer gnid){
        return tfs.ShowType(gnid);
    }
}
