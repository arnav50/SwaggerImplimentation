package com.demo.mapper;

import com.demo.dto.StudentDto;
import com.demo.entity.Student;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-03-29T11:40:38+0530",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.13 (Oracle Corporation)"
)
public class mapperImpl implements mapper {

    @Override
    public Student dtoToEntity(StudentDto studentDto) {
        if ( studentDto == null ) {
            return null;
        }

        Student student = new Student();

        student.setId( studentDto.getId() );
        student.setFirstName( studentDto.getFirstName() );
        student.setLastName( studentDto.getLastName() );
        student.setRollno( studentDto.getRollno() );
        student.setSubject( studentDto.getSubject() );

        return student;
    }

    @Override
    public StudentDto entityToDto(Student student) {
        if ( student == null ) {
            return null;
        }

        StudentDto studentDto = new StudentDto();

        studentDto.setId( student.getId() );
        studentDto.setFirstName( student.getFirstName() );
        studentDto.setLastName( student.getLastName() );
        studentDto.setRollno( student.getRollno() );
        studentDto.setSubject( student.getSubject() );

        return studentDto;
    }
}
