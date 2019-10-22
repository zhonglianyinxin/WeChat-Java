package com.zlyx.wechatjava.controller;


import com.zlyx.wechatjava.pojo.MiniGroup;
import com.zlyx.wechatjava.pojo.MiniStudent;
import com.zlyx.wechatjava.service.GroupService;
import com.zlyx.wechatjava.service.StudentService;
import com.zlyx.wechatjava.util.JavaUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/*
 * 注册
 */
@RestController
@RequestMapping("/register")
public class RegisterController {

    @Autowired
    private StudentService studentService;
    @Autowired
    private GroupService groupService;

    @RequestMapping("/register")
    public void register(Map<String,Object> paramMap) throws Exception {
        String stuName = JavaUtil.isEmptyReplace(paramMap.get("stuName"),"");
        String stuId = JavaUtil.isEmptyReplace(paramMap.get("stuId"),"");
        String stuSex = JavaUtil.isEmptyReplace(paramMap.get("stuSex"),"");
        String stuAge = JavaUtil.isEmptyReplace(paramMap.get("stuAge"),"");
        String stuYear = JavaUtil.isEmptyReplace(paramMap.get("stuYear"),"");
        String stuGroupId = JavaUtil.isEmptyReplace(paramMap.get("stuGroupId"),"");
        String groupName = JavaUtil.isEmptyReplace(paramMap.get("groupName"),"");

        MiniStudent student = new MiniStudent();
        student.setStuName(stuName);
        student.setStuId(stuId);
        student.setStuSex(stuSex);
        student.setStuAge(stuAge);
        student.setStuYear(stuYear);
        student.setStuGroupId(stuGroupId);
        student.setCreateTime(JavaUtil.nowToString());
        student.setCreateName(stuName);
        student.setOpTime(JavaUtil.nowToString());
        student.setOpName(stuName);
        studentService.insertSelective(student);

        MiniGroup group = new MiniGroup();
        group.setGroupId(stuGroupId);
        group.setGroupName(groupName);
        group.setStuYear(stuYear);
        group.setCreateTime(JavaUtil.nowToString());
        group.setCreateName(stuName);
        group.setOpTime(JavaUtil.nowToString());
        group.setOpName(stuName);
        groupService.insertSelective(group);
    }
}
