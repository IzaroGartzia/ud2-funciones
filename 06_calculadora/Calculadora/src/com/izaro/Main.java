package com.izaro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Math.PI;

public class Main {

    public static double longitud(double radio) {
        double resultado = 2 * radio * PI;
        return resultado;
    }

    public static double area(double radio) {
        double resultado = PI * Math.pow(radio, 2);
        return resultado;
    }

    public static double volumen(double radio) {
        double resultado = (4 * PI * Math.pow(radio, 2) / 3);
        return resultado;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String opcion = "";


        do {
            System.out.println("=== Calculadora ===\n" +
                    "a) Longitud de la circunferencia\n" +
                    "b) Área del círculo\n" +
                    "c) Volumen de la esfera\n" +
                    "d) Salir\n" +
                    "Opción:");
            opcion = br.readLine();

            if (!opcion.equalsIgnoreCase("d")) {

                System.out.println("Escribe el valor del radio para hacer el cálculo:");
                double n = Double.parseDouble(br.readLine());

                switch (opcion) {
                    case "a":
                    case "A":
                        longitud(n);
                        System.out.println("La longitud de la circunferencia es: " + longitud(n) + ".");
                        break;

                    case "b":
                    case "B":
                        area(n);
                        System.out.println("El área del círculo es: " + area(n) + ".");
                        break;

                    case "c":
                    case "C":
                        volumen(n);
                        System.out.println("El volumen de la esfera es: " + volumen(n) + ".");
                        break;

                    default:
                        System.out.println("Escoge una opción correcta, por favor.");
                        break;
                }
            }

        }
        while (!opcion.equalsIgnoreCase("d"));

        if (opcion.equalsIgnoreCase("d")) {
            System.out.println("Has salido de la calculadora.");
        }

    }
}
