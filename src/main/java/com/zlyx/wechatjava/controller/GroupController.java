package com.zlyx.wechatjava.controller;

import com.zlyx.wechatjava.pojo.MiniGroup;
import com.zlyx.wechatjava.pojo.MiniGroupExample;
import com.zlyx.wechatjava.pojo.MiniStudent;
import com.zlyx.wechatjava.pojo.MiniStudentExample;
import com.zlyx.wechatjava.service.GroupService;
import com.zlyx.wechatjava.service.StudentService;
import com.zlyx.wechatjava.util.JavaUtil;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/group")
public class GroupController {

    @Autowired
    private GroupService groupService;
    @Autowired
    private StudentService studentService;

    //查询所有小组信息
    @RequestMapping("/selectGroup")
    public JSONObject selectGroup(@RequestBody JSONObject jsonObject){
        Map<String,Object> returnMap = new HashMap<String,Object>();

        MiniGroupExample miniGroupExample = new MiniGroupExample();
        List<MiniGroup> miniGroups = groupService.selectByExample(miniGroupExample);
        ArrayList<Object> list = new ArrayList<>();
        for (MiniGroup group: miniGroups) {
            HashMap<Object, Object> map = new HashMap<>();
            String groupId = group.getGroupId();
            String stuYear = group.getStuYear();
            map.put("groupId",groupId);
//            map.put("stuYear",stuYear);
            list.add(map);
        }

        returnMap.put("k",list);
        JSONObject returnJson = JSONObject.fromObject(returnMap);
        System.out.println("returnJson:-----"+returnJson);
        return  returnJson;
    }

    //根据小组id查询学生信息
    @RequestMapping("/selectByGroupId")
    public JSONObject selectByGroupId(@RequestBody JSONObject jsonObject){
        String groupId = JavaUtil.isEmptyReplace(jsonObject.get("groupId"), "");
        Map<String,Object> returnMap = new HashMap<String,Object>();

        MiniStudentExample studentExample = new MiniStudentExample();
        studentExample.createCriteria().andStuGroupIdEqualTo(groupId);
        List<MiniStudent> studentList = studentService.selectByExample(studentExample);
        ArrayList<Object> list = new ArrayList<>();
        for (MiniStudent student: studentList) {
            HashMap<Object, Object> map = new HashMap<>();
            String stuId = student.getStuId();
            String stuName = student.getStuName();
            String stuGroupId = student.getStuGroupId();
            String stuYear = student.getStuYear();
            map.put("stuId",stuId);
            map.put("stuName",stuName);
            map.put("groupId",stuGroupId);
            map.put("stuYear",stuYear);
            list.add(map);
        }

        returnMap.put("k",list);
        JSONObject returnJson = JSONObject.fromObject(returnMap);
        System.out.println("returnJson:-----"+returnJson);
        return  returnJson;
    }
}
