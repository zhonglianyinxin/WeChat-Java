package com.zlyx.wechatjava.service.impl;

import com.zlyx.wechatjava.mapper.MiniStudentMapper;
import com.zlyx.wechatjava.pojo.MiniStudent;
import com.zlyx.wechatjava.pojo.MiniStudentExample;
import com.zlyx.wechatjava.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private MiniStudentMapper miniStudentMapper;

    @Override
    public List<MiniStudent> selectByExample(MiniStudentExample studentExample) {
        return miniStudentMapper.selectByExample(studentExample);
    }

    @Override
    public int insertSelective(MiniStudent record) {
        return miniStudentMapper.insertSelective(record);
    }

    @Override
    public int updateByExampleSelective(MiniStudent record,MiniStudentExample example) {
        return miniStudentMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int deleteByExample(MiniStudentExample example) {
        return miniStudentMapper.deleteByExample(example);
    }

    @Override
    public void updateByStuId(MiniStudent miniStudent) {
        miniStudentMapper.updateByStuId(miniStudent);
    }
}
