package org.example;

public class Main {
    public static void main(String[] args) {
        message(1);
    }
    static void message(int i){
        if (i > 23090) return;
        System.out.println(i);
        message(i+1);
    }
}