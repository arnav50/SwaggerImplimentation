package com.demo.service;

import com.demo.dto.StudentDto;
import com.demo.entity.Student;
import com.demo.mapper.mapper;
import com.demo.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepo studentRepo;



    @Override
    public Student addStudent(StudentDto studentDto) {
        return studentRepo.save(mapper.INSTANCE.dtoToEntity(studentDto));
    }

    @Override
    public List<Student> findAll() {

        return studentRepo.findAll();
    }
}
