package com.example.demo.service;

import com.example.demo.model.course.CourseEntity;

import java.util.List;

public interface CourseService {
    public CourseEntity saveCourse(CourseEntity course);

    public void deleteCourse(CourseEntity courseEntity);

    public List<CourseEntity> getAllCourses();

    public CourseEntity getCourse(CourseEntity courseEntity);
}
