package com.example.helloboot.dao;


import java.util.List;

import com.example.helloboot.bean.Student;
import com.example.helloboot.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDao{
    @Autowired
    StudentMapper mapper;

    public List<Student> findAll() {
        return mapper.findAll();
    }

    public boolean insert(Student student){
        return mapper.insertStudent(student);
    }
}
