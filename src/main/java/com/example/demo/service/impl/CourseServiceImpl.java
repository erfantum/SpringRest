package com.example.demo.service.impl;

import com.example.demo.model.course.CourseEntity;
import com.example.demo.model.course.dao.CourseRepository;
import com.example.demo.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    CourseRepository courseRepository;

    @Override
    public CourseEntity saveCourse(CourseEntity course) {
        CourseEntity savedEntity = courseRepository.save(course);
        return savedEntity;
    }

    @Override
    public void deleteCourse(CourseEntity courseEntity) {
        courseRepository.delete(courseEntity);
    }
}
