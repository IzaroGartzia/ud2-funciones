package com.izaro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static int repetitiva(int n) {
        int a = 0;
        int b = 1;
        int c;

        for (int k = 0; k < n; k++) {
            c = b + a;
            a = b;
            b = c;
        }


        return a;
    }

    public static int recursiva(int n) {
        if (n < 2) {
            return n;
        } else {
            return recursiva(n - 1) + recursiva(n - 2);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Vamos a hacer la sucesión de Fibonacci. Escribe un valor: ");
        int valor = Integer.parseInt(br.readLine());

        System.out.println("El resultado es: " + repetitiva(valor) + "(repetitiva).");
        System.out.println("El resultado es: " + recursiva(valor) + "(recursiva).");

    }
}
