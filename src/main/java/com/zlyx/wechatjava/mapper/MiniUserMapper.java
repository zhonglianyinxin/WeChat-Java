package com.zlyx.wechatjava.mapper;

import com.zlyx.wechatjava.pojo.MiniUser;
import com.zlyx.wechatjava.pojo.MiniUserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MiniUserMapper {
    int countByExample(MiniUserExample example);

    int deleteByExample(MiniUserExample example);

    int deleteByPrimaryKey(String userNo);

    int insert(MiniUser record);

    int insertSelective(MiniUser record);

    List<MiniUser> selectByExample(MiniUserExample example);

    MiniUser selectByPrimaryKey(String userNo);

    int updateByExampleSelective(@Param("record") MiniUser record, @Param("example") MiniUserExample example);

    int updateByExample(@Param("record") MiniUser record, @Param("example") MiniUserExample example);

    int updateByPrimaryKeySelective(MiniUser record);

    int updateByPrimaryKey(MiniUser record);

    MiniUser selectByThree(MiniUser miniUser);
}