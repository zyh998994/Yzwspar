package cn.service.impl;

import cn.dao.AddressFormDao;
import cn.pojo.AddressForm;
import cn.service.AddressService1;
import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("address")
public class AddressServiceimpl implements AddressService1 {
    @Resource
    private AddressFormDao arf;

    public AddressFormDao getArf() {
        return arf;
    }

    public void setArf(AddressFormDao arf) {
        this.arf = arf;
    }

    @Override
    public String seladd(AddressForm ad) {
        AddressForm seladd = arf.seladd(ad);
        if(seladd != null) {
            return JSON.toJSONString(seladd);
        }else{
            return "1";
        }
    }

    @Override
    public String address(AddressForm arf) {

         if(arf.getAddress() != null && arf.getPhone() != null
                 && arf.getPostcode()!= null && arf.getUuid() != null){

         }else{
             return "失败";
         }
        return "成功";

    }
}
