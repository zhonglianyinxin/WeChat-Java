package com.zlyx.wechatjava.service.impl;

import com.zlyx.wechatjava.mapper.MiniGroupMapper;
import com.zlyx.wechatjava.pojo.MiniGroup;
import com.zlyx.wechatjava.pojo.MiniGroupExample;
import com.zlyx.wechatjava.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupServiceImpl implements GroupService {

    @Autowired
    private MiniGroupMapper miniGroupMapper;

    @Override
    public int insertSelective(MiniGroup record) {
        return miniGroupMapper.insertSelective(record);
    }

    @Override
    public MiniGroup selectByPrimaryKey(String stuGroupId) {
        return miniGroupMapper.selectByPrimaryKey(stuGroupId);
    }

    @Override
    public List<MiniGroup> selectByExample(MiniGroupExample miniGroupExample) {
        return miniGroupMapper.selectByExample(miniGroupExample);
    }
}
