package com.zlyx.wechatjava.controller;

import com.zlyx.wechatjava.pojo.UserResources;
import com.zlyx.wechatjava.pojo.UserResourcesExample;
import com.zlyx.wechatjava.service.UserResourcesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/*
* 用户权限
*/
@RestController
@RequestMapping("/resources")
public class UserResourcesController {
    @Autowired
    private UserResourcesService userResourcesService;
    /*
     * 查询所有权限
     */
    @RequestMapping("/selectByExample")
    public List<UserResources> selectByExample(UserResourcesExample example) {
        List<UserResources> resources = userResourcesService.selectByExample(example);
        return resources;
    }
    /*
     * 新增权限
     */
    @RequestMapping("/insertSelective")
    public int insertSelective( UserResources record) {
        return userResourcesService.insertSelective(record);
    }

    /*
     * 修改权限
     */
    @RequestMapping("/updateByExampleSelective")
    public int updateByExampleSelective(UserResources record, UserResourcesExample example) {
        return userResourcesService.updateByExampleSelective(record,example);
    }

    /*
     * 删除权限
     */
    @RequestMapping("/deleteByExample")
    public int deleteByExample( UserResourcesExample example) {
        return userResourcesService.deleteByExample(example);
    }
}

