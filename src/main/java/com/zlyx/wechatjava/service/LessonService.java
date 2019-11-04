package com.zlyx.wechatjava.service;

import com.zlyx.wechatjava.pojo.LessionCompleteStatus;
import com.zlyx.wechatjava.pojo.LessionCompleteStatusExample;
import com.zlyx.wechatjava.pojo.MiniLessonExample;

import java.util.List;
import java.util.Map;

public interface LessonService {
    void insertSelective(LessionCompleteStatus lessionCompleteStatus);

    List<LessionCompleteStatus> selectByExample(LessionCompleteStatusExample example);

    List<Map> selectLesson(MiniLessonExample miniLesson);
}
