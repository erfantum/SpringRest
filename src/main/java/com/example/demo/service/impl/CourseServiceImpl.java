package com.example.demo.service.impl;

import com.example.demo.model.course.CourseEntity;
import com.example.demo.model.course.CourseModel;
import com.example.demo.model.course.dao.CourseRepository;
import com.example.demo.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    CourseRepository courseRepository;

    @Override
    public CourseEntity saveCourse(CourseEntity course) {
        return courseRepository.save(course);
    }

    @Override
    public void deleteCourse(CourseEntity courseEntity) {
        courseRepository.delete(courseEntity);
    }

    @Override
    public List<CourseEntity> getAllCourses() {
        return courseRepository.findAll();
    }

    @Override
    public CourseEntity getCourse(CourseEntity courseEntity) {
        return courseRepository.findById(courseEntity.getCourse_Id()).orElse(null);
    }
}
