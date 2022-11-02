package com.example.demo.mapper;

import com.example.demo.model.student.StudentEntity;
import com.example.demo.model.student.StudentModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface StudentConvertor {
    StudentEntity modelToEntityConvertor(StudentModel studentModel);

    StudentModel entityToModelConvertor(StudentEntity studentEntity);
}
