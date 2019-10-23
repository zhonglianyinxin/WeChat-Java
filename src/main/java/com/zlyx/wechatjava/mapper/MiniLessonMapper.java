package com.zlyx.wechatjava.mapper;

import com.zlyx.wechatjava.pojo.MiniLesson;
import com.zlyx.wechatjava.pojo.MiniLessonExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MiniLessonMapper {
    int countByExample(MiniLessonExample example);

    int deleteByExample(MiniLessonExample example);

    int deleteByPrimaryKey(String lessId);

    int insert(MiniLesson record);

    int insertSelective(MiniLesson record);

    List<MiniLesson> selectByExample(MiniLessonExample example);

    MiniLesson selectByPrimaryKey(String lessId);

    int updateByExampleSelective(@Param("record") MiniLesson record, @Param("example") MiniLessonExample example);

    int updateByExample(@Param("record") MiniLesson record, @Param("example") MiniLessonExample example);

    int updateByPrimaryKeySelective(MiniLesson record);

    int updateByPrimaryKey(MiniLesson record);
}