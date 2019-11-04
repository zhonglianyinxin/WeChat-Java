package com.zlyx.wechatjava.controller;

import com.zlyx.wechatjava.pojo.*;
import com.zlyx.wechatjava.service.GroupService;
import com.zlyx.wechatjava.service.LessonService;
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
@RequestMapping("/lesson")
public class LessonController {

    @Autowired
    private LessonService lessonService;
    @Autowired
    private StudentService studentService;
    @Autowired
    private GroupService groupService;

    //查询课程表信息
    @RequestMapping("/selectLesson")
    public JSONObject selectLesson(@RequestBody JSONObject jsonObject){
        Map<String,Object> returnMap = new HashMap<String,Object>();

        MiniLessonExample miniLesson = new MiniLessonExample();
        List<Map> miniLessons = lessonService.selectLesson(miniLesson);

        //查询用户是否已填写信息
        String userNo = JavaUtil.isEmptyReplace(jsonObject.get("userNo"), "");
        MiniStudentExample studentExample = new MiniStudentExample();
        studentExample.createCriteria().andStuIdEqualTo(userNo);
        List<MiniStudent> studentList = studentService.selectByExample(studentExample);
        for (MiniStudent student: studentList) {
            if(student.getStuYear() !=null){
                returnMap.put("isInfo","true");
            }
        }

        returnMap.put("k",miniLessons);
        JSONObject returnJson = JSONObject.fromObject(returnMap);
        System.out.println("returnJson:-----"+returnJson);
        return  returnJson;
    }

    //查询课程完成情况信息
    @RequestMapping("/selectByExample")
    public JSONObject selectByExample(@RequestBody JSONObject jsonObject){
        Map<String,Object> returnMap = new HashMap<String,Object>();

        String userNo = JavaUtil.isEmptyReplace(jsonObject.get("userNo"),"");

        //查询小组编号
        MiniStudentExample studentExample = new MiniStudentExample();
        studentExample.createCriteria().andStuIdEqualTo(userNo);
        List<MiniStudent> studentList = studentService.selectByExample(studentExample);
        String groupId = null;
        for (MiniStudent student: studentList) {
            if(!"".equals(student.getStuGroupId()) || student.getStuGroupId() !=null){
                groupId =  student.getStuGroupId();
            }
        }
        LessionCompleteStatusExample example = new LessionCompleteStatusExample();
        example.createCriteria().andStuIdEqualTo(userNo);
        List<LessionCompleteStatus> lessionCompleteStatuses = lessonService.selectByExample(example);
        ArrayList<Object> list = new ArrayList<>();
//        for (int i = 0; i < lessionCompleteStatuses.size(); i++) {
            HashMap<Object, Object> map0 = new HashMap<>();
            map0.put("stuYear",lessionCompleteStatuses.get(0).getStuYear());
            map0.put("groupId",groupId);
            String studyBeginTime = lessionCompleteStatuses.get(0).getStudyBeginTime();
            studyBeginTime = studyBeginTime.substring(0,4)+"-"+studyBeginTime.substring(4,6)+"-"+studyBeginTime.substring(6,8);
            map0.put("studyBeginTime",studyBeginTime);
            String studyEndTime = lessionCompleteStatuses.get(0).getStudyEndTime();
            studyEndTime = studyEndTime.substring(0,4)+"-"+studyEndTime.substring(4,6)+"-"+studyEndTime.substring(6,8);
            map0.put("studyEndTime",studyEndTime);
            map0.put("lessonBegin",lessionCompleteStatuses.get(0).getLessonBegin());
            map0.put("lessonEnd",lessionCompleteStatuses.get(0).getLessonEnd());
            map0.put("complete",lessionCompleteStatuses.get(0).getComplete());
            map0.put("noComplete",lessionCompleteStatuses.get(0).getNoComplete());
            HashMap<Object, Object> map1 = new HashMap<>();
            map1.put("completee",lessionCompleteStatuses.get(1).getComplete());
            map1.put("noCompletee",lessionCompleteStatuses.get(1).getNoComplete());
            HashMap<Object, Object> map2 = new HashMap<>();
            map2.put("lessonBegin2",lessionCompleteStatuses.get(2).getLessonBegin());
            map2.put("lessonEnd2",lessionCompleteStatuses.get(2).getLessonEnd());
            map2.put("complete2",lessionCompleteStatuses.get(2).getComplete());
            map2.put("noComplete2",lessionCompleteStatuses.get(2).getNoComplete());
            HashMap<Object, Object> map3 = new HashMap<>();
            map3.put("completee2",lessionCompleteStatuses.get(3).getComplete());
            map3.put("noCompletee2",lessionCompleteStatuses.get(3).getNoComplete());
            HashMap<Object, Object> map4 = new HashMap<>();
            map4.put("lessonBegin3",lessionCompleteStatuses.get(4).getLessonBegin());
            map4.put("lessonEnd3",lessionCompleteStatuses.get(4).getLessonEnd());
            map4.put("complete3",lessionCompleteStatuses.get(4).getComplete());
            map4.put("noComplete3",lessionCompleteStatuses.get(4).getNoComplete());
            HashMap<Object, Object> map5 = new HashMap<>();
            map5.put("complete4",lessionCompleteStatuses.get(5).getComplete());
            HashMap<Object, Object> map6 = new HashMap<>();
            map6.put("complete5",lessionCompleteStatuses.get(6).getComplete());
            HashMap<Object, Object> map7 = new HashMap<>();
            map7.put("complete6",lessionCompleteStatuses.get(7).getComplete());
            HashMap<Object, Object> map8 = new HashMap<>();
            map8.put("complete7",lessionCompleteStatuses.get(8).getComplete());
            HashMap<Object, Object> map9 = new HashMap<>();
            map9.put("complete8",lessionCompleteStatuses.get(9).getComplete());
            list.add(map0);
            list.add(map1);
            list.add(map2);
            list.add(map3);
            list.add(map4);
            list.add(map5);
            list.add(map6);
            list.add(map7);
            list.add(map8);
            list.add(map9);
//        }

        returnMap.put("k",list);
        JSONObject returnJson = JSONObject.fromObject(returnMap);
        System.out.println("returnJson:-----"+returnJson);
        return returnJson;
    }



    //课程完成情况提交
    @RequestMapping("/insertSelective")
    public JSONObject insertSelective(@RequestBody JSONObject jsonObject) throws Exception {
        Map<String,String> returnMap = new HashMap<String,String>();
        String userNo = JavaUtil.isEmptyReplace(jsonObject.get("userNo"),"");
        String stuYear = JavaUtil.isEmptyReplace(jsonObject.get("stuYear"),"");
        String groupId = JavaUtil.isEmptyReplace(jsonObject.get("groupId"),"");

        //给学生添加小组和届数
        MiniStudent miniStudent = new MiniStudent();
        miniStudent.setStuId(userNo);
        miniStudent.setStuGroupId(groupId);
        miniStudent.setStuYear(stuYear);
        miniStudent.setOpName(userNo);
        miniStudent.setOpTime(JavaUtil.nowToString());
        studentService.updateByStuId(miniStudent);

        //查询小组是否存在
        // 不存在，新增小组
        MiniGroup group = groupService.selectByPrimaryKey(groupId);
        if ("".equals(group) || group==null){
            MiniGroup miniGroup = new MiniGroup();
            miniGroup.setGroupId(groupId);
            miniGroup.setStuYear(stuYear);
            groupService.insertSelective(miniGroup);
        }

        //新增课程完成情况信息
        insertLesson(jsonObject);

        returnMap.put("success","true");
        JSONObject returnJson = JSONObject.fromObject(returnMap);
        return  returnJson;
    }

    private void insertLesson(JSONObject jsonObject) {
        String studyBeginTime = JavaUtil.isEmptyReplace(jsonObject.get("studyBeginTime"),"");
        studyBeginTime = studyBeginTime.replace("-","").trim();
        String studyEndTime = JavaUtil.isEmptyReplace(jsonObject.get("studyEndTime"),"");
        studyEndTime = studyEndTime.replace("-","").trim();

        String lessId = JavaUtil.isEmptyReplace(jsonObject.get("lessId"),"");
        String lessType = JavaUtil.isEmptyReplace(jsonObject.get("lessType"),"");
        String lessAttribute = JavaUtil.isEmptyReplace(jsonObject.get("lessAttribute"),"");
        String lessonBegin = JavaUtil.isEmptyReplace(jsonObject.get("lessonBegin"),"");
        String lessonEnd = JavaUtil.isEmptyReplace(jsonObject.get("lessonEnd"),"");
        String complete = JavaUtil.isEmptyReplace(jsonObject.get("complete"),"");
        String noComplete = JavaUtil.isEmptyReplace(jsonObject.get("noComplete"),"");
        String lessTypee = JavaUtil.isEmptyReplace(jsonObject.get("lessTypee"),"");
        String completee = JavaUtil.isEmptyReplace(jsonObject.get("completee"),"");
        String noCompletee = JavaUtil.isEmptyReplace(jsonObject.get("noCompletee"),"");

        LessionCompleteStatus lessionInfo = new LessionCompleteStatus();
        lessionInfo.setStuId(JavaUtil.isEmptyReplace(jsonObject.get("userNo"),""));
        lessionInfo.setStuYear(JavaUtil.isEmptyReplace(jsonObject.get("stuYear"),""));
        lessionInfo.setStudyBeginTime(studyBeginTime);
        lessionInfo.setStudyEndTime(studyEndTime);

        lessionInfo.setLessId(lessId);
        lessionInfo.setLessType(lessType);
        lessionInfo.setLessAttribute(lessAttribute);
        lessionInfo.setLessonBegin(lessonBegin);
        lessionInfo.setLessonEnd(lessonEnd);
        lessionInfo.setComplete(complete);
        lessionInfo.setNoComplete(noComplete);
        lessonService.insertSelective(lessionInfo);//插入课程1-法本

        lessionInfo.setLessType(lessTypee);
        lessionInfo.setComplete(completee);
        lessionInfo.setNoComplete(noCompletee);
        lessonService.insertSelective(lessionInfo);//插入课程1-音频

        String lessId2 = JavaUtil.isEmptyReplace(jsonObject.get("lessId2"),"");
        String lessType2 = JavaUtil.isEmptyReplace(jsonObject.get("lessType2"),"");
        String lessAttribute2 = JavaUtil.isEmptyReplace(jsonObject.get("lessAttribute2"),"");
        String lessonBegin2 = JavaUtil.isEmptyReplace(jsonObject.get("lessonBegin2"),"");
        String lessonEnd2 = JavaUtil.isEmptyReplace(jsonObject.get("lessonEnd2"),"");
        String complete2 = JavaUtil.isEmptyReplace(jsonObject.get("complete2"),"");
        String noComplete2 = JavaUtil.isEmptyReplace(jsonObject.get("noComplete2"),"");
        String lessTypee2 = JavaUtil.isEmptyReplace(jsonObject.get("lessType2e"),"");
        String completee2 = JavaUtil.isEmptyReplace(jsonObject.get("completee2"),"");
        String noCompletee2 = JavaUtil.isEmptyReplace(jsonObject.get("noCompletee2"),"");

        lessionInfo.setLessId(lessId2);
        lessionInfo.setLessType(lessType2);
        lessionInfo.setLessAttribute(lessAttribute2);
        lessionInfo.setLessonBegin(lessonBegin2);
        lessionInfo.setLessonEnd(lessonEnd2);
        lessionInfo.setComplete(complete2);
        lessionInfo.setNoComplete(noComplete2);
        lessonService.insertSelective(lessionInfo);//插入课程2-法本

        lessionInfo.setLessType(lessTypee2);
        lessionInfo.setComplete(completee2);
        lessionInfo.setNoComplete(noCompletee2);
        lessonService.insertSelective(lessionInfo);//插入课程2-音频


        String lessId3 = JavaUtil.isEmptyReplace(jsonObject.get("lessId3"),"");
        String lessType3 = JavaUtil.isEmptyReplace(jsonObject.get("lessType3"),"");
        String lessAttribute3 = JavaUtil.isEmptyReplace(jsonObject.get("lessAttribute3"),"");
        String lessonBegin3 = JavaUtil.isEmptyReplace(jsonObject.get("lessonBegin3"),"");
        String lessonEnd3 = JavaUtil.isEmptyReplace(jsonObject.get("lessonEnd3"),"");
        String complete3 = JavaUtil.isEmptyReplace(jsonObject.get("complete3"),"");
        String noComplete3 = JavaUtil.isEmptyReplace(jsonObject.get("noComplete3"),"");

        lessionInfo.setLessId(lessId3);
        lessionInfo.setLessType(lessType3);
        lessionInfo.setLessAttribute(lessAttribute3);
        lessionInfo.setLessonBegin(lessonBegin3);
        lessionInfo.setLessonEnd(lessonEnd3);
        lessionInfo.setComplete(complete3);
        lessionInfo.setNoComplete(noComplete3);
        lessonService.insertSelective(lessionInfo);//插入课程3

        String lessId4 = JavaUtil.isEmptyReplace(jsonObject.get("lessId4"),"");
        String lessType4 = JavaUtil.isEmptyReplace(jsonObject.get("lessType4"),"");
        String lessAttribute4 = JavaUtil.isEmptyReplace(jsonObject.get("lessAttribute4"),"");
        String complete4 = JavaUtil.isEmptyReplace(jsonObject.get("complete4"),"");

        lessionInfo.setLessId(lessId4);
        lessionInfo.setLessType(lessType4);
        lessionInfo.setLessAttribute(lessAttribute4);
        lessionInfo.setComplete(complete4);
        lessonService.insertSelective(lessionInfo);//插入课程4

        String lessId5 = JavaUtil.isEmptyReplace(jsonObject.get("lessId5"),"");
        String lessType5 = JavaUtil.isEmptyReplace(jsonObject.get("lessType5"),"");
        String lessAttribute5 = JavaUtil.isEmptyReplace(jsonObject.get("lessAttribute5"),"");
        String complete5 = JavaUtil.isEmptyReplace(jsonObject.get("complete5"),"");

        lessionInfo.setLessId(lessId5);
        lessionInfo.setLessType(lessType5);
        lessionInfo.setLessAttribute(lessAttribute5);
        lessionInfo.setComplete(complete5);
        lessonService.insertSelective(lessionInfo);//插入课程5

        String lessId6 = JavaUtil.isEmptyReplace(jsonObject.get("lessId6"),"");
        String lessType6 = JavaUtil.isEmptyReplace(jsonObject.get("lessType6"),"");
        String lessAttribute6 = JavaUtil.isEmptyReplace(jsonObject.get("lessAttribute6"),"");
        String complete6 = JavaUtil.isEmptyReplace(jsonObject.get("complete6"),"");

        lessionInfo.setLessId(lessId6);
        lessionInfo.setLessType(lessType6);
        lessionInfo.setLessAttribute(lessAttribute6);
        lessionInfo.setComplete(complete6);
        lessonService.insertSelective(lessionInfo);//插入课程6

        String lessId7 = JavaUtil.isEmptyReplace(jsonObject.get("lessId7"),"");
        String lessType7 = JavaUtil.isEmptyReplace(jsonObject.get("lessType7"),"");
        String lessAttribute7 = JavaUtil.isEmptyReplace(jsonObject.get("lessAttribute7"),"");
        String complete7 = JavaUtil.isEmptyReplace(jsonObject.get("complete7"),"");

        lessionInfo.setLessId(lessId7);
        lessionInfo.setLessType(lessType7);
        lessionInfo.setLessAttribute(lessAttribute7);
        lessionInfo.setComplete(complete7);
        lessonService.insertSelective(lessionInfo);//插入课程7

        String lessId8 = JavaUtil.isEmptyReplace(jsonObject.get("lessId8"),"");
        String lessType8 = JavaUtil.isEmptyReplace(jsonObject.get("lessType8"),"");
        String lessAttribute8 = JavaUtil.isEmptyReplace(jsonObject.get("lessAttribute8"),"");
        String complete8 = JavaUtil.isEmptyReplace(jsonObject.get("complete8"),"");

        lessionInfo.setLessId(lessId8);
        lessionInfo.setLessType(lessType8);
        lessionInfo.setLessAttribute(lessAttribute8);
        lessionInfo.setComplete(complete8);
        lessonService.insertSelective(lessionInfo);//插入课程8

    }
}
