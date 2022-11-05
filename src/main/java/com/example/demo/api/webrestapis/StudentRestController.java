package com.example.demo.api.webrestapis;

import com.example.demo.mapper.StudentConvertor;
import com.example.demo.model.student.StudentEntity;
import com.example.demo.model.student.StudentModel;
import com.example.demo.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/students")
public class StudentRestController {
    private final StudentConvertor studentConvertor;
    private final StudentService studentService;

    public StudentRestController(StudentConvertor studentConvertor, StudentService studentService) {
        this.studentConvertor = studentConvertor;
        this.studentService = studentService;
    }

    @PostMapping("/save")
    public StudentModel save(@RequestBody StudentModel studentModel) {
        return studentConvertor.entityToModelConvertor(studentService.saveStudent(
                studentConvertor.modelToEntityConvertor(studentModel)));
    }

    @DeleteMapping("/delete/{studentId}")
    public String deleteStudent(@PathVariable Long studentId) {
        StudentEntity studentEntity = studentConvertor.modelToEntityConvertor(new StudentModel(studentId));
        try {
            studentService.deleteStudent(studentEntity);
            return "DELETED";
        } catch (Exception e) {
            e.getCause();
            return "ERROR";
        }
    }

    @GetMapping("/getAllStudent")
    public List<StudentModel> getAllStudent() {
        return studentService.getAllStudent().stream()
                .map(studentConvertor::entityToModelConvertor)
                .collect(Collectors.toList());
    }

    @GetMapping("/getStudent/{studentId}")
    public StudentModel getStudent(@PathVariable Long studentId) {
        return studentConvertor.entityToModelConvertor(studentService.getStudentById(
                studentConvertor.modelToEntityConvertor(new StudentModel(studentId))));
    }


    @PutMapping("/update")
    public StudentModel updateStudent(@RequestBody StudentModel studentModel) {
        return studentConvertor.entityToModelConvertor(studentService.saveStudent(
                studentConvertor.modelToEntityConvertor(studentModel)));
    }
}
