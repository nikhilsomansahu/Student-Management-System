package com.saas.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.saas.entity.Student;
import com.saas.repository.StudentRepository;
import com.saas.service.*;

@Service
public class StudentServiceimpl implements StudentService {

	
	 private StudentRepository studentRepository;
	
	 public StudentServiceimpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}
	@Override
	public List<Student> getall() {
		
		
		
		return studentRepository.findAll();
	}

}
