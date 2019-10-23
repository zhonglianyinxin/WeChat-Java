package com.zlyx.wechatjava.controller;


import com.zlyx.wechatjava.pojo.UserRole;
import com.zlyx.wechatjava.pojo.UserRoleExample;
import com.zlyx.wechatjava.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/role")
public class UserRoleController {

    @Autowired
    private UserRoleService userRoleService;

    /*
     * 查询所有权限
     */
    @RequestMapping("/selectByExample")
    public List<UserRole> selectByExample(UserRoleExample example) {
        List<UserRole> resources = userRoleService.selectByExample(example);
        return resources;
    }
    /*
     * 新增权限
     */
    @RequestMapping("/insertSelective")
    public int insertSelective( UserRole record) {
        return userRoleService.insertSelective(record);
    }

    /*
     * 修改权限
     */
    @RequestMapping("/updateByExampleSelective")
    public int updateByExampleSelective(UserRole record, UserRoleExample example) {
        return userRoleService.updateByExampleSelective(record,example);
    }

    /*
     * 删除权限
     */
    @RequestMapping("/deleteByExample")
    public int deleteByExample( UserRoleExample example) {
        return userRoleService.deleteByExample(example);
    }
}
