package com.zlyx.wechatjava.mapper;

import com.zlyx.wechatjava.pojo.UserRoleResources;
import com.zlyx.wechatjava.pojo.UserRoleResourcesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserRoleResourcesMapper {
    int countByExample(UserRoleResourcesExample example);

    int deleteByExample(UserRoleResourcesExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserRoleResources record);

    int insertSelective(UserRoleResources record);

    List<UserRoleResources> selectByExample(UserRoleResourcesExample example);

    UserRoleResources selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserRoleResources record, @Param("example") UserRoleResourcesExample example);

    int updateByExample(@Param("record") UserRoleResources record, @Param("example") UserRoleResourcesExample example);

    int updateByPrimaryKeySelective(UserRoleResources record);

    int updateByPrimaryKey(UserRoleResources record);
}