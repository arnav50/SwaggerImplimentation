package com.demo.mapper;

import com.demo.dto.StudentDto;
import com.demo.entity.Student;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface mapper {
    mapper INSTANCE = Mappers.getMapper(mapper.class);

    Student dtoToEntity(StudentDto studentDto);

    StudentDto entityToDto(Student student);
}
