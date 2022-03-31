package com.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDto {
//    @Id
    private Long id;
    private String firstName;
    private String lastName;
    private int rollno;
    private String subject;
}
