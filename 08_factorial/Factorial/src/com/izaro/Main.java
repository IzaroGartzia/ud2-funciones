package com.izaro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static int repetitiva(int n) {
        int resultado = 1;

        for (int rep = 1; rep <= n; rep++) {
            resultado = resultado * rep;
        }
        return resultado;
    }

    public static int factorial(int n) {


        if (n > 1) {
            return n * factorial(n - 1);
        } else
            return n;

    }


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Escribe un número para calcular el factorial: ");
        int n = Integer.parseInt(br.readLine());

        System.out.println("El factorial del número "+n+" en método repetitivo es " + repetitiva(n) + " y con método recursivo es " + factorial(n)+".");

    }
}
