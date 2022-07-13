package com.functional.programming.models;

import com.functional.programming.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Student {

    private String name;
    private Gender gender;
    private Double grade;


}
