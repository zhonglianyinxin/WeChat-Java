package com.zlyx.wechatjava.mapper;

import com.zlyx.wechatjava.pojo.MiniLesson;
import com.zlyx.wechatjava.pojo.MiniLessonExample;
import com.zlyx.wechatjava.pojo.MiniLessonKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface MiniLessonMapper {
    int countByExample(MiniLessonExample example);

    int deleteByExample(MiniLessonExample example);

    int deleteByPrimaryKey(MiniLessonKey key);

    int insert(MiniLesson record);

    int insertSelective(MiniLesson record);

    List<MiniLesson> selectByExample(MiniLessonExample example);

    MiniLesson selectByPrimaryKey(MiniLessonKey key);

    int updateByExampleSelective(@Param("record") MiniLesson record, @Param("example") MiniLessonExample example);

    int updateByExample(@Param("record") MiniLesson record, @Param("example") MiniLessonExample example);

    int updateByPrimaryKeySelective(MiniLesson record);

    int updateByPrimaryKey(MiniLesson record);

    List<Map> selectLesson(MiniLessonExample miniLesson);
}