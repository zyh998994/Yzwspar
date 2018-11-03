package cn.service.impl;

import cn.dao.GoodsNameDao;
import cn.pojo.GoodsName;
import cn.service.GoodsNameService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("gni")
public class GoodsNameServiceImpl implements GoodsNameService {
    @Autowired
    private GoodsNameDao gnd;

    public GoodsNameDao getGnd() {
        return gnd;
    }

    public void setGnd(GoodsNameDao gnd) {
        this.gnd = gnd;
    }

    @Override
    public String getAll() {
        List<GoodsName> show = gnd.getShow();
        return JSON.toJSONString(show);
    }
}
