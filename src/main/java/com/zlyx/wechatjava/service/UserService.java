package com.zlyx.wechatjava.service;

import com.zlyx.wechatjava.pojo.MiniUser;

public interface UserService {
    void insertSelective(MiniUser user);

    MiniUser selectByPrimaryKey(String userNo);

    MiniUser selectByThree(MiniUser miniUser);
}
