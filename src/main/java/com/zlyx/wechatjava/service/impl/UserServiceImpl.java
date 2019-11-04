package com.zlyx.wechatjava.service.impl;

import com.zlyx.wechatjava.mapper.MiniUserMapper;
import com.zlyx.wechatjava.pojo.MiniUser;
import com.zlyx.wechatjava.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private MiniUserMapper miniUserMapper;

    @Override
    public void insertSelective(MiniUser user) {
        miniUserMapper.insertSelective(user);
    }

    @Override
    public MiniUser selectByPrimaryKey(String userNo) {
        return miniUserMapper.selectByPrimaryKey(userNo);
    }

    @Override
    public MiniUser selectByThree(MiniUser miniUser) {
        return miniUserMapper.selectByThree(miniUser);
    }
}
