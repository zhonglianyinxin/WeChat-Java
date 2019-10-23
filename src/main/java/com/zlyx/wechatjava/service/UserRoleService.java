package com.zlyx.wechatjava.service;

import com.zlyx.wechatjava.pojo.UserRole;
import com.zlyx.wechatjava.pojo.UserRoleExample;

import java.util.List;

public interface UserRoleService {
    List<UserRole> selectByExample(UserRoleExample example);

    int insertSelective(UserRole record);

    int updateByExampleSelective(UserRole record, UserRoleExample example);

    int deleteByExample(UserRoleExample example);
}
