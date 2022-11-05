package com.example.demo.api.webrestapis;

import com.example.demo.mapper.CourseConvertor;
import com.example.demo.model.course.CourseEntity;
import com.example.demo.model.course.CourseModel;
import com.example.demo.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/courses")
public class CourseRestController {
    private final CourseService courseService;

    private final CourseConvertor courseConvertor;

    public CourseRestController(CourseService courseService, CourseConvertor courseConvertor) {
        this.courseService = courseService;
        this.courseConvertor = courseConvertor;
    }

    @PostMapping("/save")
    public CourseModel save(@RequestBody CourseModel courseModel) {
        return courseConvertor.entityToModelConvertor(courseService.saveCourse(courseConvertor.modelToEntityConvertor(courseModel)));
    }

    @DeleteMapping("/delete/{courseId}")
    public String deleteStudent(@PathVariable Long courseId) {
        CourseEntity courseEntity = courseConvertor.modelToEntityConvertor(new CourseModel(courseId));
        try {
            courseService.deleteCourse(courseEntity);
            return "deleted";
        } catch (Exception e) {
            e.getCause();
            return "ERROR";
        }
    }


    @GetMapping("/getAllCourses")
    public List<CourseModel> getAllCourses() {
        return courseService.getAllCourses().stream()
                .map(course -> new CourseModel(course.getCourse_Id(), course.getName()))
                .collect(Collectors.toList());
    }


    @GetMapping("/getCourse/{courseId}")
    public CourseModel getCourse(@PathVariable Long courseId){
        return courseConvertor.entityToModelConvertor(courseService.getCourse(courseConvertor.modelToEntityConvertor(new CourseModel(courseId))));
    }

    @PutMapping("update")
    public CourseModel updateCourse(@RequestBody CourseModel courseModel){
        return courseConvertor.entityToModelConvertor(courseService.saveCourse(courseConvertor.modelToEntityConvertor(courseModel)));
    }
}
