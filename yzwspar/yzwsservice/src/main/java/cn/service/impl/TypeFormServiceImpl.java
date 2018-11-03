package cn.service.impl;

import cn.dao.TypeFormDao;
import cn.pojo.TypeForm;
import cn.service.TypeFormService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service(value = "tfs")
public class TypeFormServiceImpl implements TypeFormService {
    @Autowired
    private TypeFormDao tfd;

    public TypeFormDao getTfd() {
        return tfd;
    }

    public void setTfd(TypeFormDao tfd) {
        this.tfd = tfd;
    }


    @Transactional
    @Override
    public String ShowType(Integer gnid) {

        List<TypeForm> lt = tfd.TypeAll(gnid);
        return JSON.toJSONString(lt);
    }


}
