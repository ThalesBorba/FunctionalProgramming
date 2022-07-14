package com.functional.programming;

import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionMain {
    public static void main(String[] args) {

        System.out.println(addTwo.apply(7));

        System.out.println(addTwo.andThen(multiplyByTen).apply(5));

        System.out.println("\n" + multiplyAndConvert.apply("O resultado de 4 * 10 é: ", 4));
    }

    static Function<Integer, Integer> addTwo = number -> number + 2;

    static Function<Integer, Integer> multiplyByTen = number -> number * 10;

    static BiFunction<String, Integer, String> multiplyAndConvert = (string, number) -> string + (number * 10);





}
