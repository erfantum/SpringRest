package com.example.demo.model.course.dao;

import com.example.demo.model.course.CourseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<CourseEntity,Long> {
}
