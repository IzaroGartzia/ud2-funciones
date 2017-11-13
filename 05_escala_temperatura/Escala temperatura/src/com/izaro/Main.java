package com.izaro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static double convertirTemperatura(double temperatura, char escala) {
        if (escala == 'F') {
            return temperatura * 1.8 + 32;
        } else {
            return temperatura + 273.15;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int opcion;

        do {
            System.out.println("=== Temperaturas ===\n" +
                    "1. Convertir a Fahrenheit\n" +
                    "2. Convertir a Kelvin\n" +
                    "3. Salir\n" +
                    "Opción:");

            opcion = Integer.parseInt(br.readLine());

            if (opcion != 3) {
                System.out.println("Escribe la temperatura en grados centígrados: ");
                double temperatura = Double.parseDouble(br.readLine());


                switch (opcion) {
                    case 1:
                        System.out.println("El resultado es: " + convertirTemperatura(temperatura, 'F'));
                        break;

                    case 2:
                        convertirTemperatura(temperatura, 'K');
                        break;

                    default:
                        break;
                }
            }

        }
        while (opcion != 3);


        if (opcion == 3) {
            System.out.println("Has salido del programa.");
        }


    }


}
