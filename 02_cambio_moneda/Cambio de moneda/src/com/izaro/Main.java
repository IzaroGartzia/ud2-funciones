package com.izaro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static double calcularCambio(double valor, String tipo)
    {
        double resultado = 0;

        switch (tipo)
        {
            case "USD":
            case "usd":
                resultado = valor*1.16075;

                System.out.println("--- "+valor+" euros son "+resultado+" dólares.");
                break;

            case "GBP":
            case "gbp":
                resultado = valor*0.88125;

                System.out.println("--- "+valor+" euros son "+resultado+" libras.");
                break;

            case "CNY":
            case "cny":
                resultado = valor*7.7021;

                System.out.println("--- "+valor+" euros son "+resultado+" yuanes.");
                break;

            case "JPY":
            case "jpy":
                resultado = valor*132.03;

                System.out.println("--- "+valor+" euros son "+resultado+" yenes.");
                break;

            default:
                System.out.println("ERROR. Mete algo con lógica.");

        }
        return resultado;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Introduzca una cantidad en euros: ");
        double valor = Double.parseDouble(br.readLine());

        System.out.println("Moneda a la que convertir (USD, GBP, CNY, JPY): ");
        String tipo = br.readLine();

        double r = calcularCambio(valor,tipo);

    }
}
