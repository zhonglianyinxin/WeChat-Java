package com.zlyx.wechatjava.service.impl;

import com.zlyx.wechatjava.mapper.UserResourcesMapper;
import com.zlyx.wechatjava.pojo.UserResources;
import com.zlyx.wechatjava.pojo.UserResourcesExample;
import com.zlyx.wechatjava.service.UserResourcesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserResourcesServiceImpl  implements UserResourcesService {

    @Autowired
    private UserResourcesMapper userResourcesMapper;

    @Override
    public List<UserResources> selectByExample(UserResourcesExample example) {
        return userResourcesMapper.selectByExample(example);
    }

    @Override
    public int insertSelective(UserResources record) {
        return userResourcesMapper.insertSelective(record);
    }

    @Override
    public int updateByExampleSelective(UserResources record, UserResourcesExample example) {
        return userResourcesMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int deleteByExample(UserResourcesExample example) {
        return userResourcesMapper.deleteByExample(example);
    }
}
