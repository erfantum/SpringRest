package com.example.demo.model.student;

import com.example.demo.model.course.CourseModel;

import java.util.List;
public class StudentModel {
    private Long student_Id;

    private String name;

    private List<CourseModel> courses;

    public StudentModel() {
    }

    public StudentModel(Long student_Id) {
        this.student_Id = student_Id;
    }

    public StudentModel(Long student_Id, String name) {
        this.student_Id = student_Id;
        this.name = name;
    }

    public StudentModel(Long student_Id, String name, List<CourseModel> courses) {
        this.student_Id = student_Id;
        this.name = name;
        this.courses = courses;
    }

    public StudentModel(String name) {
        this.name = name;
    }

    public Long getStudent_Id() {
        return student_Id;
    }

    public void setStudent_Id(Long student_Id) {
        this.student_Id = student_Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<CourseModel> getCourses() {
        return courses;
    }

    public void setCourses(List<CourseModel> courses) {
        this.courses = courses;
    }
}
