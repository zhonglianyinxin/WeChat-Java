package com.zlyx.wechatjava.service;

import com.zlyx.wechatjava.pojo.MiniStudent;
import com.zlyx.wechatjava.pojo.MiniStudentExample;

import java.util.List;

public interface StudentService {
    List<MiniStudent> selectByExample(MiniStudentExample studentExample);

    int insertSelective(MiniStudent record);

    int updateByExampleSelective(MiniStudent record,MiniStudentExample example);

    int deleteByExample(MiniStudentExample example);

    //通过学生编号更新小组和届数
    void updateByStuId(MiniStudent miniStudent);
}
