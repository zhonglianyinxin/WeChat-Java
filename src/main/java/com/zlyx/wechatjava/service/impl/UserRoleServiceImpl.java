package com.zlyx.wechatjava.service.impl;

import com.zlyx.wechatjava.mapper.UserRoleMapper;
import com.zlyx.wechatjava.pojo.UserRole;
import com.zlyx.wechatjava.pojo.UserRoleExample;
import com.zlyx.wechatjava.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserRoleServiceImpl implements UserRoleService {

    @Autowired
    private UserRoleMapper userRoleMapper;

    @Override
    public List<UserRole> selectByExample(UserRoleExample example) {
        return userRoleMapper.selectByExample(example);
    }

    @Override
    public int insertSelective(UserRole record) {
        return userRoleMapper.insertSelective(record);
    }

    @Override
    public int updateByExampleSelective(UserRole record, UserRoleExample example) {
        return userRoleMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int deleteByExample(UserRoleExample example) {
        return userRoleMapper.deleteByExample(example);
    }
}
