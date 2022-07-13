package com.functional.programming;

import com.functional.programming.models.Student;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

import static com.functional.programming.enums.Gender.FEMALE;
import static com.functional.programming.enums.Gender.MALE;

@SpringBootApplication
public class ProgrammingApplication {

	public static void main(String[] args) {





		Optional.ofNullable(null)
				.ifPresentOrElse(pessoa -> System.out.println("Olá, " + pessoa),
						() -> System.out.println("Cadê você?"));



		greetStudentConsumer.accept(fabio);

		greetStudentConsumer2.accept(fabio, true);

		greetStudentConsumer3.accept(fabio, 8.0);

	}

	static List<Student> students = List.of(
			new Student("José", MALE, 7.5),
			new Student("Maria", FEMALE, 9.5),
			new Student("João", MALE, 5.8),
			new Student("Michelle", FEMALE, 7.5),
			new Student("Bianca", FEMALE, 8.0),
			new Student("Paulo", MALE, 4.0)
	);

	static Student fabio = new Student("Fabio", MALE, 8.0);



	static Consumer<Student> greetStudentConsumer = student ->
			System.out.println("Olá " + student.getName() +
					", sua nota foi "
					+ student.getGrade());

	static BiConsumer<Student, Boolean> greetStudentConsumer2 = (student, passed) ->
		System.out.println("Olá " + student.getName() +
				", você foi "
				+ (passed ? "aprovado" : "reprovado"));

	static BiConsumer<Student, Double> greetStudentConsumer3 = (student, grade) ->
			System.out.println("Olá " + student.getName() +
					", você foi "
					+ (grade >= 5 ? "aprovado" : "reprovado"));


}
