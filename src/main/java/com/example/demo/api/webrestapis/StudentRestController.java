package com.example.demo.api.webrestapis;

import com.example.demo.mapper.StudentConvertor;
import com.example.demo.model.student.StudentEntity;
import com.example.demo.model.student.StudentModel;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")
public class StudentRestController {
    @Autowired
    private StudentConvertor studentConvertor;

    @Autowired
    private StudentService studentService;

    @PostMapping("/save")
    public StudentModel save(@RequestBody StudentModel studentModel){
        StudentEntity studentEntity = studentConvertor.modelToEntityConvertor(studentModel);
        StudentEntity savedStudent = studentService.saveStudent(studentEntity);

        StudentModel savedModel = studentConvertor.entityToModelConvertor(savedStudent);


        return savedModel;
    }

    @DeleteMapping("/delete/{studentId}")
    public String deleteStudent(@PathVariable Long studentId){
        StudentModel studentModel =new StudentModel();

        studentModel.setStudent_Id(studentId);

        StudentEntity studentEntity = studentConvertor.modelToEntityConvertor(studentModel);

        try {
            studentService.deleteStudent(studentEntity);
            return ";";
        }catch (Exception e){
            e.getCause();
            return "a";
        }
    }
}
