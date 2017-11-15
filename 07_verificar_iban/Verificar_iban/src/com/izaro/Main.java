package com.izaro;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static boolean verificar(String iban) {
        // Quitar los espacios
        iban.replaceAll("\\s+", "");

        // Extraer los 4 primeros caracteres
        String cuatroPrimeros = iban.substring(0,4);
        String restoCadena = iban.substring(4);

        // Convertir las letras en números usando la tabla
        int numero1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".indexOf(cuatroPrimeros.charAt(0)) + 10;
        int numero2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".indexOf(cuatroPrimeros.charAt(1)) + 10;

        // Montar el String final
        String nuevoIban = restoCadena + numero1 + numero2 + cuatroPrimeros.substring(2);

        // Hacer la división y comprobar
        long numero = Long.parseLong(nuevoIban);

        System.out.println(iban);

        System.out.println(cuatroPrimeros);
        System.out.println(restoCadena);
        System.out.println(nuevoIban);

        return numero%97 == 1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        if (verificar("BE88 3200 3471 3441")) {
            System.out.println("OK");
        } else {
            System.out.println("ERROR.");
        }

    }
}
