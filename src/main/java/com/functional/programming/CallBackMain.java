package com.functional.programming;

import java.util.function.Consumer;

public class CallBackMain {
    public static void main(String[] args) {
        message("José",
                4.0,
                () -> System.out.println("Parabéns, você está aprovado!"));

        System.out.println();

        message2("João", " da Silva", message -> {
            System.out.println(", e não tenho sobrenome");
        });

        message2("João", null, message -> {
            System.out.println(", e não tenho sobrenome");
        });
    }

    static void message(String name, Double grade, Runnable callback) {
        System.out.println(name + ":");
        if (grade <= 5.0) {
            System.out.println("Sua prova de recuperação será segunda");
        } else {
            callback.run();
        }
    }

    static void message2(String name, String secondName, Consumer<String> callback) {
        System.out.print("Meu nome é " + name);
        if (secondName != null) {
            System.out.println(secondName);
        } else {
            callback.accept(name);
        }
    }
}
