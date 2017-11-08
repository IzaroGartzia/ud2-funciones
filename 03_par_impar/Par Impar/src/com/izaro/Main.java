package com.izaro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static boolean esPar(int n)
    {
        if (n%2 == 0) {
            return true;
        }
        else
        {
            return false;
        }

    }

    /* Acortarlo a tope

    return n% 2 == 0;

    */

    public static boolean esImpar(int n) {

        if (n%2 != 0) {
            return true;
        }
        else {
            return false;
        }
    }
    /*
    public static boolean esImpar(int n)
    {
        return !espar(n);
     }
     */



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Escribe un número y te diré si es par o impar: ");
        int n = Integer.parseInt(br.readLine());

        if(esPar(n))
        {
            System.out.println("El número "+n+" es par.");
        }
        else
        {
            System.out.println("El número "+n+" es impar.");
        }
    }
}
