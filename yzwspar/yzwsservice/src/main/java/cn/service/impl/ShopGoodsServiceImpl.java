package cn.service.impl;

import cn.dao.ShopGoodsDao;
import cn.service.ShopGoodsService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("sgs")
public class ShopGoodsServiceImpl implements ShopGoodsService {
    @Autowired
    private ShopGoodsDao sg;

    public ShopGoodsDao getSg() {
        return sg;
    }

    public void setSg(ShopGoodsDao sg) {
        this.sg = sg;
    }


    @Override
    public String showAll(Integer shortid) {
        List<ShopGoodsDao> shopGoodsDaos = sg.shopAll(shortid);
        return JSON.toJSONString(shopGoodsDaos);
    }
}
