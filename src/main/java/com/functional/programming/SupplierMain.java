package com.functional.programming;

import java.util.List;
import java.util.function.Supplier;

public class SupplierMain {

    public static void main(String[] args) {
        System.out.println(getGreeting());
        System.out.println();
        getGreetingSupplier.get().stream().forEach(System.out::println);
    }

    static String getGreeting() {
        return "Olá, bem-vindo ao nosso aplicativo!";
    }

    static Supplier<List<String>> getGreetingSupplier = () -> List.of("Olá!", "Seja bem-vindo!");

}
