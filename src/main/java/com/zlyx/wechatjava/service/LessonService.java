package com.zlyx.wechatjava.service;

import com.zlyx.wechatjava.pojo.LessionCompleteStatus;
import com.zlyx.wechatjava.pojo.LessionCompleteStatusExample;

import java.util.List;

public interface LessonService {
    void insertSelective(LessionCompleteStatus lessionCompleteStatus);

    List<LessionCompleteStatus> selectByExample(LessionCompleteStatusExample example);
}
