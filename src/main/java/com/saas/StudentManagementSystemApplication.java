package com.saas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.saas.entity.Student;
import com.saas.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Student student1 = new Student("Ramesh" , "Reddy" , "rr@gmail.com");
		studentRepository.save(student1);
		
		Student student2 = new Student("Ajey" , "kalyan" , "reddy@gmail.com");
		studentRepository.save(student2);
		
		Student student3 = new Student("Allu" , "Teja" , "qwer@gmail.com");
		studentRepository.save(student3);
		
		
		
		
		
	}

}
