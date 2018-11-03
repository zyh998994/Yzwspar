package cn.controller;

import cn.pojo.StoreForm;
import cn.service.StoreFormService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

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

    public List<StoreForm> fyShow(Integer index,Integer PageSize){
        Integer pageSize=4; //每页显示条数
        PageHelper.startPage(index, PageSize);

        /*ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        context.getBean("StoreformMapper");*/

        return null;
    }
}
