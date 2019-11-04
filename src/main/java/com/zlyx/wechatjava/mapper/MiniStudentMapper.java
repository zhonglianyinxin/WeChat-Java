package com.zlyx.wechatjava.mapper;

import com.zlyx.wechatjava.pojo.MiniStudent;
import com.zlyx.wechatjava.pojo.MiniStudentExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MiniStudentMapper {
    int countByExample(MiniStudentExample example);

    int deleteByExample(MiniStudentExample example);

    int deleteByPrimaryKey(Long stuNo);

    int insert(MiniStudent record);

    int insertSelective(MiniStudent record);

    List<MiniStudent> selectByExample(MiniStudentExample example);

    MiniStudent selectByPrimaryKey(Long stuNo);

    int updateByExampleSelective(@Param("record") MiniStudent record, @Param("example") MiniStudentExample example);

    int updateByExample(@Param("record") MiniStudent record, @Param("example") MiniStudentExample example);

    int updateByPrimaryKeySelective(MiniStudent record);

    int updateByPrimaryKey(MiniStudent record);

    void updateByStuId(MiniStudent miniStudent);
}