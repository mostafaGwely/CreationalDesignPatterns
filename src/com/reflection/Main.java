package com.reflection;

public class Main {

    public static void main(String[] args) {
        System.out.println(echo(35,100));
    }

    public static double echo(float n, int echoNumber) {
        if (echoNumber == 0)
            return Math.sqrt(n * (n - 1));
        return Math.sqrt(n * (n - 1) + echo(n, echoNumber-1));
    }
}