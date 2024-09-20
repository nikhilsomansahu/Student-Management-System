package com.saas.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.saas.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
	
	

}
