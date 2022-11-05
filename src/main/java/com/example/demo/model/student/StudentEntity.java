package com.example.demo.model.student;

import com.example.demo.model.course.CourseEntity;

import javax.persistence.*;
import java.util.List;

@Entity
public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long student_Id;

    private String name;

    @ManyToMany(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
    @JoinTable(joinColumns = @JoinColumn(name = "student_Id"),
    inverseJoinColumns = @JoinColumn(name = "course_Id"))
    private List<CourseEntity> courses;

    public StudentEntity(Long student_Id, String name, List<CourseEntity> courses) {
        this.student_Id = student_Id;
        this.name = name;
        this.courses = courses;
    }

    public StudentEntity() {
    }

    public StudentEntity(String name) {
        this.name = name;
    }

    public StudentEntity(String name, List<CourseEntity> courses) {
        this.name = name;
        this.courses = courses;
    }

    public StudentEntity(Long student_Id, String name) {
        this.student_Id = student_Id;
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

    public List<CourseEntity> getCourses() {
        return courses;
    }

    public void setCourses(List<CourseEntity> courses) {
        this.courses = courses;
    }
}
