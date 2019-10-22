package com.zlyx.wechatjava.mapper;

import com.zlyx.wechatjava.pojo.MiniGroup;
import com.zlyx.wechatjava.pojo.MiniGroupExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface MiniGroupMapper {
    int countByExample(MiniGroupExample example);

    int deleteByExample(MiniGroupExample example);

    int deleteByPrimaryKey(String groupId);

    int insert(MiniGroup record);

    int insertSelective(MiniGroup record);

    List<MiniGroup> selectByExample(MiniGroupExample example);

    MiniGroup selectByPrimaryKey(String groupId);

    int updateByExampleSelective(@Param("record") MiniGroup record, @Param("example") MiniGroupExample example);

    int updateByExample(@Param("record") MiniGroup record, @Param("example") MiniGroupExample example);

    int updateByPrimaryKeySelective(MiniGroup record);

    int updateByPrimaryKey(MiniGroup record);
}