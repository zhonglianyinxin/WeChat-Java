package com.zlyx.wechatjava.service;

import com.zlyx.wechatjava.pojo.UserResources;
import com.zlyx.wechatjava.pojo.UserResourcesExample;

import java.util.List;

public interface UserResourcesService {
    List<UserResources> selectByExample(UserResourcesExample example);

    int insertSelective(UserResources record);

    int updateByExampleSelective(UserResources record, UserResourcesExample example);

    int deleteByExample(UserResourcesExample example);
}
