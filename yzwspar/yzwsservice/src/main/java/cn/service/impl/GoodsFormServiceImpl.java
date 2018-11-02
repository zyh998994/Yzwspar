package cn.service.impl;

import cn.dao.GoodsFormDao;
import cn.pojo.GoodsForm;
import cn.service.GoodsFormService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.beans.Transient;
import java.util.List;

@Service("GoodsFormService")
public class GoodsFormServiceImpl implements GoodsFormService {
    @Autowired
    private GoodsFormDao gsfd;

    public GoodsFormDao getGsfd() {
        return gsfd;
    }

    public void setGsfd(GoodsFormDao gsfd) {
        this.gsfd = gsfd;
    }

    @Transactional
    @Override
    public List<GoodsForm> selfuzzy(String gname) {
        return gsfd.selfuzzy(gname);
    }
}
