package com.zlyx.wechatjava.controller;


import com.zlyx.wechatjava.pojo.MiniUser;
import com.zlyx.wechatjava.service.UserService;
import com.zlyx.wechatjava.util.AesCbcUtil;
import com.zlyx.wechatjava.util.HttpRequest;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/*
 * 登录
 */
@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public Map<String,Object> decodeUserInfo(String code,String encryptedData,String iv,String userNo,String userName,String userPwd) {
        System.out.println("小程序调用。。。。。。。");
//        String code = JavaUtil.isEmptyReplace(jsonObject.get("code"), "");
//        String encryptedData = JavaUtil.isEmptyReplace(jsonObject.get("encryptedData"), "");
//        String iv = JavaUtil.isEmptyReplace(jsonObject.get("iv"), "");

        Map<String,Object> map = new HashMap();
        //登录凭证不能为空
        if (code == null || code.length() == 0) {
            map.put("status", 0);
            map.put("msg", "code 不能为空");
            return map;
        }

        //小程序唯一标识   (在微信小程序管理后台获取)
        String wxspAppid = "wx8cefd287d1c162c3";
        //小程序的 app secret (在微信小程序管理后台获取)
        String wxspSecret = "4ef58ac157cef709d796a93ec2727bc7";
        //授权（必填）
        String grant_type = "authorization_code";


        //1、向微信服务器 使用登录凭证 code 获取 session_key 和 openid
        //请求参数
        String params = "appid=" + wxspAppid + "&secret=" + wxspSecret + "&js_code=" + code + "&grant_type=" + grant_type;
        //发送请求
        String sr = HttpRequest.sendGet("https://api.weixin.qq.com/sns/jscode2session", params);
        //解析相应内容（转换成json对象）
        JSONObject json = JSONObject.fromObject(sr);
        //获取会话密钥（session_key）
        String session_key = json.get("session_key").toString();
        //用户的唯一标识（openid）
        String openid = (String) json.get("openid");

        // 2、对encryptedData加密数据进行AES解密 ////////////////
        try {
            String result = AesCbcUtil.decrypt(encryptedData, session_key, iv, "UTF-8");
            if (null != result && result.length() > 0) {
                map.put("status", 1);
                map.put("msg", "解密成功");

                JSONObject userInfoJSON = JSONObject.fromObject(result);
                Map<String,Object> userInfo = new HashMap();
                userInfo.put("openId", userInfoJSON.get("openId"));
                userInfo.put("nickName", userInfoJSON.get("nickName"));
                userInfo.put("gender", userInfoJSON.get("gender"));
                userInfo.put("city", userInfoJSON.get("city"));
                userInfo.put("province", userInfoJSON.get("province"));
                userInfo.put("country", userInfoJSON.get("country"));
                userInfo.put("avatarUrl", userInfoJSON.get("avatarUrl"));
                userInfo.put("unionId", userInfoJSON.get("unionId"));
                map.put("userInfo", userInfo);

                //判断用户是否已注册
                MiniUser miniUser = new MiniUser();
                miniUser.setUserNo(userNo);
                miniUser.setUserName(userName);
                miniUser.setUserPwd(userPwd);
                MiniUser user = userService.selectByThree(miniUser);
                if (!"".equals(user) || user !=null){
                    String userLevel = user.getUserLevel();
                    map.put("userLevel",userLevel);
                }else{
                    map.put("status", 2);
                    map.put("msg","用户未注册！");
                }
                return map;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        map.put("status", 0);
        map.put("msg", "解密失败");
        System.out.println("小程序调用完成。。。。。。。");

        return map;
    }

}
