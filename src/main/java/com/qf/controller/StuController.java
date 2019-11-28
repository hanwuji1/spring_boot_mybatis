package com.qf.controller;

import com.qf.dao.StuMapper;
import com.qf.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/stu")
public class StuController {

    @Autowired
    private StuMapper stuMapper;

    /**
     * 获取列表
     * @return
     */
    @RequestMapping("/list")
    public List<Student> stuList(){
        List<Student> students = stuMapper.stuList();
        return students;
    }
    //新建了一个分支,这是mylove写的
}
