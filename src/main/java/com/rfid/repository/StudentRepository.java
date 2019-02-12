package com.rfid.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rfid.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
	
	Student findBytagid(String tagid);
}
