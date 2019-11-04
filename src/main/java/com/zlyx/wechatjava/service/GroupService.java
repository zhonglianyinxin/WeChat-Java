package com.zlyx.wechatjava.service;

import com.zlyx.wechatjava.pojo.MiniGroup;
import com.zlyx.wechatjava.pojo.MiniGroupExample;

import java.util.List;

public interface GroupService {

    int insertSelective(MiniGroup record);

    MiniGroup selectByPrimaryKey(String stuGroupId);

    List<MiniGroup> selectByExample(MiniGroupExample miniGroupExample);
}
