package com.zlyx.wechatjava.mapper;

import com.zlyx.wechatjava.pojo.UserResources;
import com.zlyx.wechatjava.pojo.UserResourcesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserResourcesMapper {
    int countByExample(UserResourcesExample example);

    int deleteByExample(UserResourcesExample example);

    int deleteByPrimaryKey(String resCode);

    int insert(UserResources record);

    int insertSelective(UserResources record);

    List<UserResources> selectByExample(UserResourcesExample example);

    UserResources selectByPrimaryKey(String resCode);

    int updateByExampleSelective(@Param("record") UserResources record, @Param("example") UserResourcesExample example);

    int updateByExample(@Param("record") UserResources record, @Param("example") UserResourcesExample example);

    int updateByPrimaryKeySelective(UserResources record);

    int updateByPrimaryKey(UserResources record);
}