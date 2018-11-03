package cn.service.impl;

import cn.dao.StoreFormDao;
import cn.pojo.StoreForm;
import cn.service.StoreFormService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("sfs")
public class StoreFormServiceImpl implements StoreFormService {
    @Autowired
    private StoreFormDao sfd;

    public StoreFormDao getSfd() {
        return sfd;
    }

    public void setSfd(StoreFormDao sfd) {
        this.sfd = sfd;
    }

    @Override
    public String getAdd() {
        List<StoreForm> all = sfd.getAll();
        return JSON.toJSONString(all);
    }

    @Override
    public List<StoreForm> getPage(Integer index, Integer PageSize) {
        return null;
    }
}
