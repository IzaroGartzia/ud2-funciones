package com.izaro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static int perimetroRectangulo(int base, int altura) {
        int peri = (2*base) + (2*altura);
        return peri;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduce la base del rectángulo: ");
        int base = Integer.parseInt(br.readLine());

        System.out.println("Introduce la altura del rectángulo: ");
        int altura = Integer.parseInt(br.readLine());

        int resultado = perimetroRectangulo(base, altura);
        System.out.println("El perimetro del rectángulo es: " + resultado);

    }
}

