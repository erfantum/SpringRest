package com.example.demo.service.impl;

import com.example.demo.model.student.StudentEntity;
import com.example.demo.model.student.dao.StudentRepository;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public StudentEntity saveStudent(StudentEntity entity) {
        return studentRepository.save(entity);
    }

    @Override
    public void deleteStudent(StudentEntity studentEntity) {
        studentRepository.delete(studentEntity);
    }

    @Override
    public List<StudentEntity> getAllStudent() {
        return studentRepository.findAll();
    }

    @Override
    public StudentEntity getStudentById(StudentEntity student) {
        return studentRepository.findById(student.getStudent_Id()).orElse(null);
    }


}
