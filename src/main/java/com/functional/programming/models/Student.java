package com.functional.programming.models;

import com.functional.programming.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;
import java.util.Date;

@AllArgsConstructor
@Getter
public class Student {

    private String name;
    private Gender gender;
    private Double grade;
    private LocalDate dateOfBirth;


}
