package cn.service.impl;

import cn.dao.UserFormDao;
import cn.pojo.UserForm;
import cn.service.UserFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("UserFormService")
public class UserFormServiceImpl implements UserFormService {

    @Autowired
    private UserFormDao userformdao;

    public UserFormDao getUserformdao() {
        return userformdao;
    }

    public void setUserformdao(UserFormDao userformdao) {
        this.userformdao = userformdao;
    }


    @Transactional
    @Override
    public UserForm login(String openid) {
        return userformdao.login(openid);
    }

    @Transactional
    @Override
    public int addUser(UserForm user) {
        return userformdao.addUser(user);
    }
}
