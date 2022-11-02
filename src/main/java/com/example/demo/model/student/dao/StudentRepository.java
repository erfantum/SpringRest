package com.example.demo.model.student.dao;

import com.example.demo.model.student.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<StudentEntity,Long>{
}
