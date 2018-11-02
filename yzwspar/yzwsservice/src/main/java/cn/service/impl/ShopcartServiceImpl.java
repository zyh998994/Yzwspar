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

    /**
     * 获取要添加到购物车的商品的信息
     * @param gf
     * @return
     */
    @Override
    public GoodsForm seleinfo(GoodsForm gf) {

        return shop.seleinfo(gf);
    }

    /**
     * 添加到购物车
     * @param goodf 商品信息
     * @param num   同一商品的订单数量
     * @return
     */
    @Override
    public String inseinfo(GoodsForm goodf, int num) {
       try {
            Shopcart sc = new Shopcart();
            sc.setShopid(0);
            sc.setUuid(1);
            if(shop.seleinfo(goodf).getGstate() == 1){
                sc.setGoodid(shop.seleinfo(goodf).getGid());
            }else {
                return "该商品已经下架";
            }
            if(num < 1){
                return "添加到购物车商品数量小于1";//添加到购物车商品数量小于1
            }else if(num >= shop.seleinfo(goodf).getExt1()){
                return "添加到购物车商品数量大于库存";//添加到购物车商品数量大于库存
            }else {
                sc.setShopnum(num);
            }
            /*sc.setShopnum(getnum(goodf,num));*/

            int judge = shop.inserjudge(sc);
            if(judge > 0){
                return "添加成功，请到购物车查看";
            }else {
                return "添加失败";
            }
       }catch (Exception e){
            return "数据异常，空指针或者没有数据";
       }
    }

    /**
     * 验证商品的状态
     * @param goodf
     * @return
     */
  /*  public int getState(GoodsForm goodf){
        try {
            if(shop.seleinfo(goodf).getGstate() == 1){
               return shop.seleinfo(goodf).getGid();
            }else {
                return -1;
            }
        }catch (Exception e){
            return -5;
        }
    }*/

    /**
     * 验证添加到购物车商品的数量的合理性
     * @param goodf
     * @param num
     */
/*    public int getnum(GoodsForm goodf, int num){
        try{
            if(num < 1){
                return -2;//添加到购物车商品数量小于1
            }else if(num >= shop.seleinfo(goodf).getExt1()){
                return -3;//添加到购物车商品数量大于库存
            }else {
                return num;
            }
        }catch (Exception e){
            return -4;//数据异常
        }
    }*/


}
