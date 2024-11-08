package org.example;

import java.util.function.Consumer;

public class Hello {
    public static void main(String[] args) {
        Printer printer = new Printer();

        // Lambda expression
        printer.print("Hello World!");
    }
}

class Printer {
    public void print(String message) {
        System.out.println(message);
    }
}
