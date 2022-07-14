package com.functional.programming;

import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionMain {
    public static void main(String[] args) {

        System.out.println("PA de n + 2: ");
        oneToTen.stream().map(addTwo).forEach(System.out::println);

        System.out.println("\nPA de (n + 2) * 10: ");
        oneToTen.stream().map(addTwo).map(multiplyByTen).forEach(System.out::println);

        System.out.println("\n" + multiplyAndConvert.apply("O resultado de 4 * 10 é: ", 4));
    }

    static List<Integer> oneToTen = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    static Function<Integer, Integer> addTwo = number -> number + 2;

    static Function<Integer, Integer> multiplyByTen = number -> number * 10;

    static BiFunction<String, Integer, String> multiplyAndConvert = (string, number) -> string + (number * 10);





}
