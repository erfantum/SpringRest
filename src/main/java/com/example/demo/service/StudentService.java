package com.example.demo.service;

import com.example.demo.model.student.StudentEntity;

public interface StudentService {
    StudentEntity saveStudent(StudentEntity entity);

    public void deleteStudent(StudentEntity studentEntity);
}
