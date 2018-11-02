package cn.controller;

import cn.pojo.AddressForm;
import cn.service.AddressService1;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@RequestMapping("site/")
@Controller
public class AddressController {
    @Resource
    private AddressService1 add;

    public AddressService1 getAdd() {
        return add;
    }

    public void setAdd(AddressService1 add) {
        this.add = add;
    }

    /**
     * 显示默认地址
     * @param ad
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "getall")
    public String selsite(AddressForm ad){
        ad.setUuid(1);
        return add.seladd(ad);
    }
    /**
     * 添加地址
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "add")
    public String site(@RequestBody AddressForm arf){

        return add.address(arf);
    }

    /**
     * 展示地址
     * @return
     */
    @ResponseBody
    @RequestMapping(value="show1")
    public String showsite( AddressForm arf){
        arf.setUuid(1);
        return add.selall(arf);
    }

}
