package com.zlyx.wechatjava.mapper;

import com.zlyx.wechatjava.pojo.MiniChapter;
import com.zlyx.wechatjava.pojo.MiniChapterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MiniChapterMapper {
    int countByExample(MiniChapterExample example);

    int deleteByExample(MiniChapterExample example);

    int deleteByPrimaryKey(Long chapId);

    int insert(MiniChapter record);

    int insertSelective(MiniChapter record);

    List<MiniChapter> selectByExample(MiniChapterExample example);

    MiniChapter selectByPrimaryKey(Long chapId);

    int updateByExampleSelective(@Param("record") MiniChapter record, @Param("example") MiniChapterExample example);

    int updateByExample(@Param("record") MiniChapter record, @Param("example") MiniChapterExample example);

    int updateByPrimaryKeySelective(MiniChapter record);

    int updateByPrimaryKey(MiniChapter record);
}