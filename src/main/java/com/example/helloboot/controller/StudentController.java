package com.example.helloboot.controller;

import com.example.helloboot.bean.Student;
import com.example.helloboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "getAllStudent", method = {RequestMethod.GET})
    public List<Student> getAllStudents(String name) {
        System.out.print(name);
        return this.studentService.getAllStudent();
    }

    @RequestMapping("insert")
    public String insert(String name,int age,String sex,String id) {
        Student student = new Student();
        student.setAge(age);
        student.setName(name);
        student.setSex(sex);
        student.setId(id);
        studentService.insert(student);

        return "success";
    }

    @RequestMapping("hello")
    public String hello(String name) {
        return "hello:"+name;
    }
}
