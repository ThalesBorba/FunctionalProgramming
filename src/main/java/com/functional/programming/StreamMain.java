package com.functional.programming;

import com.functional.programming.models.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import static com.functional.programming.enums.Gender.FEMALE;
import static com.functional.programming.enums.Gender.MALE;

public class StreamMain {
    public static void main(String[] args) {

        System.out.println("Entre os estudantes, são mulheres: ");
        //listFemaleStudents(students);
        listFemaleStudentsStream(students);

        System.out.println("\nA nota dos aprovados, em ordem crescente de nota são: ");
        students
                .stream()
                .map(student -> student.getGrade())
                .filter(grade -> grade >= 5.0)
                .sorted()
                .forEach(System.out::println);

        System.out.println("\nAlunos que são mulheres e foram aprovados, ou que o nome começa com J: ");
        students
                .stream()
                .filter(isFemale.and(isApproved).or(nameStartsWithJ))
                .map(student -> student.getName())
                .toList()
                .forEach(System.out::println);

    }

    static List<Student> students = List.of(
            new Student("José", MALE, 7.5),
            new Student("Maria", FEMALE, 9.5),
            new Student("João", MALE, 5.8),
            new Student("Michelle", FEMALE, 7.5),
            new Student("Bianca", FEMALE, 3.2),
            new Student("Paulo", MALE, 6.0)
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

    static Predicate<Student> isFemale = student -> student.getGender().equals(FEMALE);
    static Predicate<Student> isApproved = student -> student.getGrade() >= 5.0;
    static Predicate<Student> nameStartsWithJ = student -> student.getName().startsWith("J");

}

