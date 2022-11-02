package com.example.demo.model.course;

import com.example.demo.model.student.StudentModel;

import java.util.List;

public class CourseModel {
    private Long course_Id;

    private String name;

    private List<StudentModel> students;

    public CourseModel() {
    }

    public CourseModel(Long course_Id, String name, List<StudentModel> students) {
        this.course_Id = course_Id;
        this.name = name;
        this.students = students;
    }

    public CourseModel(Long course_Id, String name) {
        this.course_Id = course_Id;
        this.name = name;
    }

    public CourseModel(String name) {
        this.name = name;
    }

    public Long getCourse_Id() {
        return course_Id;
    }

    public void setCourse_Id(Long course_Id) {
        this.course_Id = course_Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<StudentModel> getStudents() {
        return students;
    }

    public void setStudents(List<StudentModel> students) {
        this.students = students;
    }
}
