package com.example.demo.model.course;

import com.example.demo.model.student.StudentEntity;

import javax.persistence.*;
import java.util.List;

@Entity
public class CourseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long course_Id;

    private String name;

    @ManyToMany(mappedBy = "courses")
    List<StudentEntity> students;

    public CourseEntity() {
    }

    public CourseEntity(Long course_Id, String name) {
        this.course_Id = course_Id;
        this.name = name;
    }

    public CourseEntity(Long course_Id, String name, List<StudentEntity> students) {
        this.course_Id = course_Id;
        this.name = name;
        this.students = students;
    }

    public CourseEntity(String name) {
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

    public List<StudentEntity> getStudents() {
        return students;
    }

    public void setStudents(List<StudentEntity> students) {
        this.students = students;
    }
}
