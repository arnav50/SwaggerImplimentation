package com.demo.service;

import com.demo.dto.StudentDto;
import com.demo.entity.Student;

import java.util.List;

public interface StudentService {

    public Student addStudent(StudentDto studentDto);
    public List<Student> findAll();

}
