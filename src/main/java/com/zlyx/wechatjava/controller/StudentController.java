package com.zlyx.wechatjava.controller;


import com.zlyx.wechatjava.pojo.MiniStudent;
import com.zlyx.wechatjava.pojo.MiniStudentExample;
import com.zlyx.wechatjava.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/*
 * 学员
 */
@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;
    /*
     * 查询所有学员
     */
    @RequestMapping("/selectByExample")
    public List<MiniStudent> selectByExample( MiniStudentExample studentExample) {
        List<MiniStudent> studentList = studentService.selectByExample(studentExample);
        return studentList;
    }

    /*
     * 新增学员
     */
    @RequestMapping("/insertSelective")
    public int insertSelective( MiniStudent record) {
        return studentService.insertSelective(record);
    }

    /*
     * 修改学员
     */
    @RequestMapping("/updateByExampleSelective")
    public int updateByExampleSelective( MiniStudent record,MiniStudentExample example) {
        return studentService.updateByExampleSelective(record,example);
    }

    /*
     * 删除学员
     */
    @RequestMapping("/deleteByExample")
    public int deleteByExample( MiniStudentExample example) {
        return studentService.deleteByExample(example);
    }
}
