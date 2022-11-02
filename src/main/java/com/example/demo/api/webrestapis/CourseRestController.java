package com.example.demo.api.webrestapis;

import com.example.demo.mapper.CourseConvertor;
import com.example.demo.model.course.CourseEntity;
import com.example.demo.model.course.CourseModel;
import com.example.demo.model.student.StudentEntity;
import com.example.demo.model.student.StudentModel;
import com.example.demo.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/courses")
public class CourseRestController {
    @Autowired
    private CourseService courseService;

    @Autowired
    CourseConvertor courseConvertor;

    @PostMapping("/save")
    public CourseModel save(@RequestBody CourseModel courseModel){
        CourseEntity courseEntity = courseConvertor.modelToEntityConvertor(courseModel);
        CourseEntity savedCourse = courseService.saveCourse(courseEntity);

        CourseModel savedCourseModel = courseConvertor.entityToModelConvertor(savedCourse);

        return savedCourseModel;
    }

    @DeleteMapping("/delete/{courseId}")
    public String deleteStudent(@PathVariable Long courseId){
        CourseModel courseModel =new CourseModel();

        courseModel.setCourse_Id(courseId);

        CourseEntity courseEntity = courseConvertor.modelToEntityConvertor(courseModel);

        try {
            courseService.deleteCourse(courseEntity);
            return ";";
        }catch (Exception e){
            e.getCause();
            return "a";
        }
    }
}
