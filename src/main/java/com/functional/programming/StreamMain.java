package com.functional.programming;

import com.functional.programming.models.Student;

import java.util.ArrayList;
import java.util.List;

import static com.functional.programming.enums.Gender.FEMALE;
import static com.functional.programming.enums.Gender.MALE;

public class StreamMain {
    public static void main(String[] args) {

        listFemaleStudents(students);

        System.out.println("Entre os estudantes, são mulheres: ");
        //listFemaleStudents(students);
        listFemaleStudentsStream(students);

        System.out.println("\nA nota dos aprovados são: ");
        students
                .stream()
                .map(student -> student.getGrade())
                .filter(grade -> grade >= 5.0)
                .forEach(System.out::println);
    }

    static List<Student> students = List.of(
            new Student("José", MALE, 7.5),
            new Student("Maria", FEMALE, 9.5),
            new Student("João", MALE, 5.8),
            new Student("Michelle", FEMALE, 7.5),
            new Student("Bianca", FEMALE, 8.0),
            new Student("Paulo", MALE, 4.0)
    );

    static void listFemaleStudents(List<Student> students) {
        List<Student> females = new ArrayList<>();
        for (Student student : students) {
            if (student.getGender().equals(FEMALE)) {
                females.add(student);
            }
        }

        for (Student student : females) {
            System.out.println(student.getName());
        }
    }

    static void listFemaleStudentsStream(List<Student> students) {
        students.stream().filter(student -> FEMALE.equals(student.getGender())).map(student -> student.getName())
                .forEach(System.out::println);
    }

}

