package com.zlyx.wechatjava.service.impl;

import com.zlyx.wechatjava.mapper.LessionCompleteStatusMapper;
import com.zlyx.wechatjava.pojo.LessionCompleteStatus;
import com.zlyx.wechatjava.pojo.LessionCompleteStatusExample;
import com.zlyx.wechatjava.service.LessonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LessonServiceImpl implements LessonService {

    @Autowired
    private LessionCompleteStatusMapper lessionCompleteStatusMapper;

    @Override
    public void insertSelective(LessionCompleteStatus lessionCompleteStatus) {
        lessionCompleteStatusMapper.insertSelective(lessionCompleteStatus);
    }

    @Override
    public List<LessionCompleteStatus> selectByExample(LessionCompleteStatusExample example) {
        return lessionCompleteStatusMapper.selectByExample(example);
    }
}
