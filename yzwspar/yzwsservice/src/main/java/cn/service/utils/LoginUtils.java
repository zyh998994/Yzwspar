package cn.service.utils;

import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class LoginUtils {
    public static JSONObject getSessionKeyOrOpenId(String code){
        //微信端登录code
        String wxCode = code;
        String requestUrl = "https://api.weixin.qq.com/sns/jscode2session";
        Map<String,String> requestUrlParam = new HashMap<String,String>();
        requestUrlParam.put("appid","wx3834556439b39332");
        requestUrlParam.put("secret","f09a01415c0447e30e3eff3edfeb0fc5");
        requestUrlParam.put("js_code","wxCode");
        requestUrlParam.put("grant_type","authorization_code");
        //JSONObject jsonObject = JSON.parseObject(UrlUtil.sendPost(requestUrl,requestUrlParam));
        return null;
    }
}
