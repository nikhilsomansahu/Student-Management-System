package com.saas.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.saas.entity.Student;
import com.saas.service.StudentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
public class StudentController {

    private StudentService studentService; 

    // Constructor injection for StudentService
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    // Handler method to return the list of students
    @GetMapping("/students")
    public String listStudents(Model model) {
        model.addAttribute("students", studentService.getall()); 
        return "students";
    }
    
    public String createStudnetForm(Model model) {
		Student student = new Student();
		model.addAttribute("student", student);
		
		
    	return "create_student";
    	
    }
    
    @PostMapping("/students")
    public String saveStudent(@ModelAttribute ("student") Student student) {
    	
    	
    	studentService.saveStudent(student);
        
        return "redirects:/students";
    }
    
    
}
