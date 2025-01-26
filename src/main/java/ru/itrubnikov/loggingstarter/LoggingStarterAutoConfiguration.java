package ru.itrubnikov.loggingstarter;

public class LoggingStarterAutoConfiguration {
    public static void println(String message) {
        System.out.println("Вызвал println из библиотеки maven: " + message);
    }
}
