package com.functional.programming;

import com.functional.programming.models.Student;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.function.Predicate;

import static com.functional.programming.enums.Gender.FEMALE;
import static com.functional.programming.enums.Gender.MALE;

public class PredicateMain {

    public static void main(String[] args) {

        System.out.println("O Jorge é adulto? ");
        System.out.println(isAdultPredicate.test(jorge));

        System.out.println("\nE a Maria?");
        System.out.println(isAdultPredicate.test(maria));

        System.out.println("\nE quem é adulto e também está aprovado?");
        students.stream().filter(isAdultAndApprovedPredicate).map(student -> student.getName()).forEach(System.out::println);

    }

    static Student jorge = new Student("Jorge", MALE, 4.0, LocalDate.of(2003, 12, 1));
    static Student maria = new Student("Maria", FEMALE, 6.0, LocalDate.of(2010, 5, 10));
    static Student marta = new Student("Marta", FEMALE, 7.0, LocalDate.of(2000, 7, 30));

    static List<Student> students = List.of(jorge, maria, marta);

    static Predicate<Student> isAdultPredicate = student -> Period.between(student.getDateOfBirth(), LocalDate.now())
            .getYears() >= 18;

    static Predicate<Student> isAdultAndApprovedPredicate = student -> student.getGrade() >= 5.0 &&
            Period.between(student.getDateOfBirth(), LocalDate.now()).getYears() >= 18;

    static Boolean isAdult(Student student) {
        return Period.between(student.getDateOfBirth(), LocalDate.now()).getYears() >= 18;
    }
}
