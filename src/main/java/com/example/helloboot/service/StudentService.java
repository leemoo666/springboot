package com.example.helloboot.service;

import com.example.helloboot.bean.Student;
import com.example.helloboot.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("studentService")
public class StudentService {
    @Autowired
    private StudentDao dao;

    public List<Student> getAllStudent() {
        return this.dao.findAll();
    }

    @Transactional
    public void insert(Student student){
       dao.insert(student);
       int a = 1 / 0;
    }
}
