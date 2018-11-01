package cn.service.impl;

import cn.dao.ShopcartDao;
import cn.pojo.GoodsForm;
import cn.pojo.Shopcart;
import cn.service.ShopcartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("SCSI")
public class ShopcartServiceImpl implements ShopcartService {
    @Autowired
    private ShopcartDao shop;

    public ShopcartDao getShop() {
        return shop;
    }

    public void setShop(ShopcartDao shop) {
        this.shop = shop;
    }

    @Override
    public GoodsForm seleinfo(GoodsForm gf) {

        return shop.seleinfo(gf);
    }

    @Override
    public int inseinfo(Shopcart sp) {

        return 0;
    }
}
