package cn.controller;

import cn.service.UserFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
/*@RequestMapping("/login")*/
@RequestMapping("/login")
public class UserFormController {

    @Autowired
    private UserFormService userformservice;

    public UserFormService getUserformservice() {
        return userformservice;
    }

    public void setUserformservice(UserFormService userformservice) {
        this.userformservice = userformservice;
    }

   /* public ResponseEntity<LoginDataResult>(String code){

    }*/
}
