package com.izaro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static int esPar(int n)
    {
     int resultado = n%2;
        if(resultado == 0)
        {
            System.out.println("El número "+n+" es par.");
        }

     return resultado;
    }

    public static int esImpar(int n)
    {
        int resultado = n%2;
            if(resultado !=0)
            {
                System.out.println("El número "+n+" es impar.");
            }
        return resultado;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Escribe un número y te diré si es par o impar: ");
        int n = Integer.parseInt(br.readLine());

        int r1 = esPar(n);
        int r2 = esImpar(n);

    }
}
