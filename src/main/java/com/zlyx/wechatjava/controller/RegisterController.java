package com.zlyx.wechatjava.controller;


import com.zlyx.wechatjava.pojo.MiniStudent;
import com.zlyx.wechatjava.pojo.MiniUser;
import com.zlyx.wechatjava.service.GroupService;
import com.zlyx.wechatjava.service.StudentService;
import com.zlyx.wechatjava.service.UserService;
import com.zlyx.wechatjava.util.JavaUtil;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/*
 * 注册
 */
@RestController
@RequestMapping(value = "/register", method = RequestMethod.POST)
public class RegisterController {

    @Autowired
    private UserService userService;
    @Autowired
    private StudentService studentService;
    @Autowired
    private GroupService groupService;

    @RequestMapping("/inster")
    public JSONObject register(@RequestBody JSONObject jsonObject) throws Exception {
        System.out.println("进入小程序注册了。。。。。。。。。。。。。。。。jsonObject:" +jsonObject);
        Map<String,String> returnMap = new HashMap<String,String>();
        String userName = JavaUtil.isEmptyReplace(jsonObject.get("userName"),"");
        String userNo = JavaUtil.isEmptyReplace(jsonObject.get("userNo"),"");
        String userPwd = JavaUtil.isEmptyReplace(jsonObject.get("userPwd"),"");
        String userLevel = JavaUtil.isEmptyReplace(jsonObject.get("userLevel"),"");

        //查询用户是否存在
        //不存在，新增用户
        MiniUser users = userService.selectByPrimaryKey(userNo);
        if("".equals(users) || users==null){
            MiniUser user = new MiniUser();
            user.setUserName(userName);
            user.setUserNo(userNo);
            user.setUserPwd(userPwd);
            user.setUserLevel(userLevel);
            user.setCreateTime(JavaUtil.nowToString());
            user.setCreateName(userName);
            user.setOpTime(JavaUtil.nowToString());
            user.setOpName(userName);
            userService.insertSelective(user);
        }else{
            returnMap.put("success","false");
            returnMap.put("msg","该用户已存在！");
            JSONObject returnJson = JSONObject.fromObject(returnMap);
            return  returnJson;
        }

        //判断用户级别是否是学员
        // 是，则新增学生
        if("1".equals(userLevel)){
            MiniStudent student = new MiniStudent();
            student.setStuName(userName);
            student.setStuId(userNo);
            student.setUserLevel(userLevel);
            student.setCreateTime(JavaUtil.nowToString());
            student.setCreateName(userName);
            student.setOpTime(JavaUtil.nowToString());
            student.setOpName(userName);
            studentService.insertSelective(student);

        }
        returnMap.put("userLevel",userLevel);
        returnMap.put("success","true");
        JSONObject returnJson = JSONObject.fromObject(returnMap);
        return  returnJson;
    }
}
