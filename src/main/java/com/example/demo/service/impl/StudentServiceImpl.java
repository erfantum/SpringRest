package com.example.demo.service.impl;

import com.example.demo.model.student.StudentEntity;
import com.example.demo.model.student.dao.StudentRepository;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public StudentEntity saveStudent(StudentEntity entity) {
        StudentEntity savedEntity = studentRepository.save(entity);

        return savedEntity;
    }

    @Override
    public void deleteStudent(StudentEntity studentEntity) {

        studentRepository.delete(studentEntity);
    }
}
