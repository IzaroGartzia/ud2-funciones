package com.izaro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Math.PI;

public class Main {

    public static double longitud(double radio) {
        return 2 * PI * radio;
    }

    public static double area(double radio) {
        return PI * Math.pow(radio, 2);
    }

    public static double volumen(double radio) {
        return (4 * PI * Math.pow(radio, 2) / 3);
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char opcion;

        do {
            System.out.println("\n=== Calculadora ===\n" +
                    "a) Longitud de la circunferencia\n" +
                    "b) Área del círculo\n" +
                    "c) Volumen de la esfera\n" +
                    "d) Salir\n" +
                    "Opción:");
            opcion = br.readLine().toLowerCase().charAt(0);
            double n = 0;

            if (opcion == 'a' || opcion == 'b' || opcion == 'c') {
                System.out.println("Escribe el valor del radio para hacer el cálculo:");
                n = Double.parseDouble(br.readLine());
            }


            switch (opcion) {
                case 'a':
                    System.out.format("La longitud de la circunferencia es: %.3f.", longitud(n));
                    break;

                case 'b':
                    System.out.format("El área del círculo es: %.3f.", area(n));
                    break;

                case 'c':
                    System.out.format("El volumen de la esfera es: %.3f.", volumen(n));
                    break;

                case 'd':
                    break;

                default:
                    System.out.println("Escoge una opción correcta, por favor.");
                    break;
            }


        }
        while (opcion != 'd');

        if (opcion == 'd') {
            System.out.println("Has salido de la calculadora.");
        }

    }
}
