package com.zlyx.wechatjava.controller;

import com.zlyx.wechatjava.pojo.LessionCompleteStatus;
import com.zlyx.wechatjava.pojo.LessionCompleteStatusExample;
import com.zlyx.wechatjava.service.LessonService;
import com.zlyx.wechatjava.util.JavaUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/lesson")
public class LessonController {

    @Autowired
    private LessonService lessonService;

    @RequestMapping("/selectByExample")
    public List<LessionCompleteStatus> selectByExample(){
        LessionCompleteStatusExample example = new LessionCompleteStatusExample();
        List<LessionCompleteStatus> lessionCompleteStatuses = lessonService.selectByExample(example);
        return lessionCompleteStatuses;
    }

    @RequestMapping("/insertSelective")
    public void insertSelective(Map<String,Object> paramMap) {
        String stuId = JavaUtil.isEmptyReplace(paramMap.get("stuId"),"");
        String lessId = JavaUtil.isEmptyReplace(paramMap.get("lessId"),"");
        String lessType = JavaUtil.isEmptyReplace(paramMap.get("lessType"),"");
        String lessAttribute = JavaUtil.isEmptyReplace(paramMap.get("lessAttribute"),"");
        String complete = JavaUtil.isEmptyReplace(paramMap.get("complete"),"");
        String studyBeginTime = JavaUtil.isEmptyReplace(paramMap.get("studyBeginTime"),"");
        String studyEndTime = JavaUtil.isEmptyReplace(paramMap.get("studyEndTime"),"");
        String stuYear = JavaUtil.isEmptyReplace(paramMap.get("stuYear"),"");
        LessionCompleteStatus lessionCompleteStatus = new LessionCompleteStatus();
        lessionCompleteStatus.setStuId(stuId);
        lessionCompleteStatus.setLessId(lessId);
        lessionCompleteStatus.setLessType(lessType);
        lessionCompleteStatus.setLessAttribute(lessAttribute);
        lessionCompleteStatus.setComplete(complete);
        lessionCompleteStatus.setStudyBeginTime(studyBeginTime);
        lessionCompleteStatus.setStudyEndTime(studyEndTime);
        lessionCompleteStatus.setStuYear(stuYear);

        lessonService.insertSelective(lessionCompleteStatus);
    }
}
