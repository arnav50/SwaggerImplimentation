package com.demo.controller;

import java.util.List;

import com.demo.dto.StudentDto;
import com.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.Student;
import com.demo.repository.StudentRepo;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	public StudentService studentService;
	
	
	@PostMapping()
	public Student saveStudent(@RequestBody StudentDto dto) {
		return studentService.addStudent(dto);
	}
	
	
	@GetMapping()
	public List<Student> findAllStudents(){
		return studentService.findAll();
	}
	
}
