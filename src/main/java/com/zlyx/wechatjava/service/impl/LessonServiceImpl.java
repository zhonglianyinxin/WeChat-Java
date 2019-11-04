package com.zlyx.wechatjava.service.impl;

import com.zlyx.wechatjava.mapper.LessionCompleteStatusMapper;
import com.zlyx.wechatjava.mapper.MiniLessonMapper;
import com.zlyx.wechatjava.pojo.LessionCompleteStatus;
import com.zlyx.wechatjava.pojo.LessionCompleteStatusExample;
import com.zlyx.wechatjava.pojo.MiniLesson;
import com.zlyx.wechatjava.pojo.MiniLessonExample;
import com.zlyx.wechatjava.service.LessonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class LessonServiceImpl implements LessonService {

    @Autowired
    private LessionCompleteStatusMapper lessionCompleteStatusMapper;
    @Autowired
    private MiniLessonMapper MiniLessonMapper;

    @Override
    public void insertSelective(LessionCompleteStatus lessionCompleteStatus) {
        lessionCompleteStatusMapper.insertSelective(lessionCompleteStatus);
    }

    @Override
    public List<LessionCompleteStatus> selectByExample(LessionCompleteStatusExample example) {
        return lessionCompleteStatusMapper.selectByExample(example);
    }

    @Override
    public List<Map> selectLesson(MiniLessonExample miniLesson) {
        return MiniLessonMapper.selectLesson(miniLesson);
    }


}
