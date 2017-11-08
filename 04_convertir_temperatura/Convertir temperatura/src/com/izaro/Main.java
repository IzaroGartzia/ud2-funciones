package com.izaro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static double convertirTemperatura(double n)
    {
        return n*1.8+32;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Escribe una temperatura en Cº para convertirla en Fahrenheit:");
        double n = Double.parseDouble(br.readLine());

        System.out.println("Los grados centígrados "+n+" son "+convertirTemperatura(n)+" Fahrenheit.");

    }
}
