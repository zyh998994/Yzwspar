package cn.controller;

import cn.pojo.UserForm;
import cn.service.UserFormService;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Controller
/*@RequestMapping("/login")*/
@RequestMapping("/login")
public class UserFormController {

    @Autowired
    private UserFormService userformservice;

    public UserFormService getUserformservice() {
        return userformservice;
    }

    public void setUserformservice(UserFormService userformservice) {
        this.userformservice = userformservice;
    }

    /**
     * 通过code获取oppenid和sessionKey
     * @param code
     * @return
     */


    public static JSONObject getSessionKeyOrOpenId(String code){
        //微信端登录code
        String wxCode = code;
        String requestUrl = "https://api.weixin.qq.com/sns/jscode2session";
        Map<String,String> requestUrlParam = new HashMap<String,String>();
        requestUrlParam.put( "appid","wx3834556439b39332" );//小程序appId
        requestUrlParam.put( "secret","f09a01415c0447e30e3eff3edfeb0fc5" );
        requestUrlParam.put( "js_code",wxCode );//小程序端返回的code
        requestUrlParam.put( "grant_type","authorization_code" );//默认参数

        //发送post请求读取调用微信接口获取openid用户唯一标识
        //JSONObject jsonObject = JSON.parseObject(UrlUtil.sendPost(requestUrl,requestUrlParam ));
        //return jsonObject;
        return null;
    }
    /**
     * 将用户信息插入到数据库
     * @return
     */
    private String insertUser(String userRes,String openid/*,RawData data*/) {
        //判断用户数据库是否存在,不存在，入库。
        UserForm user = userformservice.login(openid);
        //uuid生成唯一key
        String skey = UUID.randomUUID().toString();
        if (user == null) {
            //入库
            user = new UserForm();
            user.setUid(0);
            user.setOpenid(openid);
            user.setCountry(userRes);
            user.setGreatedate(new Date());
            user.setSex(userRes.equals("1") ? 1 : 2);
            user.setHeadimg(userRes);
            user.setNickname(userRes);
            user.setMobileno(userRes);
            /*user.setCountry(data.getCountry());
            user.setCreatedate(new Date());
            user.setDf(1);
            user.setGender(data.getGender().equals("1") ? 1 : 2);//1为男，2为女
            user.setHeadimg(data.getAvatarUrl());
            user.setNickname(data.getNickName());
            user.setOpenid(openid);
            user.setCitycode(data.getCity());
            user.setProvincecode(data.getProvince());
            user.setMobileno(phoneNumber);*/
            //插入到数据库
            userformservice.addUser(user);
        } else {
            //已存在
            //logger.info("用户openid已存在,不需要插入");
            return String.valueOf(user.getUid());//返回用户唯一标志skey
        }
        return skey;
    }

}
