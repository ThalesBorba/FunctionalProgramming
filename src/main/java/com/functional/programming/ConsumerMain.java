package com.functional.programming;

import com.functional.programming.models.Student;

import java.time.LocalDate;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

import static com.functional.programming.enums.Gender.MALE;

public class ConsumerMain {
    public static void main(String[] args) {
        greetStudentConsumer.accept(fabio);

        greetStudentConsumer2.accept(fabio, true);

        greetStudentConsumer3.accept(fabio, 8.0);
    }

    static Student fabio = new Student("Fabio", MALE, 8.0, LocalDate.of(2003, 7, 15));



    static Consumer<Student> greetStudentConsumer = student ->
            System.out.println("Olá " + student.getName() + ", sua nota foi " + student.getGrade());

    static BiConsumer<Student, Boolean> greetStudentConsumer2 = (student, passed) ->
            System.out.println("Olá " + student.getName() + ", você foi " + (passed ? "aprovado" : "reprovado"));

    static BiConsumer<Student, Double> greetStudentConsumer3 = (student, grade) ->
            System.out.println("Olá " + student.getName() + ", você foi " + (grade >= 5 ? "aprovado" : "reprovado"));

}
