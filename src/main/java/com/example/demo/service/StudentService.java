package com.example.demo.service;

import com.example.demo.model.student.StudentEntity;

import java.util.List;

public interface StudentService {
    StudentEntity saveStudent(StudentEntity entity);

    public void deleteStudent(StudentEntity studentEntity);

    public List<StudentEntity> getAllStudent();

    public StudentEntity getStudentById(StudentEntity student);

}
