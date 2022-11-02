package com.example.demo.service;

import com.example.demo.model.course.CourseEntity;

public interface CourseService {
    public CourseEntity saveCourse(CourseEntity course);

    public void deleteCourse(CourseEntity courseEntity);
}
