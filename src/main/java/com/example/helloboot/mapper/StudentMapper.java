package com.example.helloboot.mapper;

import com.example.helloboot.bean.Student;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface StudentMapper {
    List<Student> findAll();

    boolean insertStudent(Student student);
}
