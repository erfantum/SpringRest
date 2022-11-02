package com.example.demo.mapper;

import com.example.demo.model.course.CourseEntity;
import com.example.demo.model.course.CourseModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CourseConvertor {
    CourseEntity modelToEntityConvertor(CourseModel courseModel);

    CourseModel entityToModelConvertor(CourseEntity courseEntity);
}
