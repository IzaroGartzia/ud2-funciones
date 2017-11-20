package com.izaro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static String morse(char letra) {
        String res = "";

        switch (letra) {
            case 'a':
                res = "· —";
                break;

            case 'b':
                res = "— · · ·";
                break;

            case 'c':
                res = "— · — ·";
                break;

            case 'd':
                res = "— · ·";
                break;

            case 'e':
                res = "·";
                break;

            case 'f':
                res = "· · — ·";
                break;

            case 'g':
                res = "— — ·";
                break;

            case 'h':
                res = "· · · ·";
                break;

            case 'i':
                res = "· ·";
                break;

            case 'j':
                res = "· — — —";
                break;

            case 'k':
                res = "— · —";
                break;

            case 'l':
                res = "· — · ·";
                break;

            case 'm':
                res = "— —";
                break;

            case 'n':
                res = "— ·";
                break;

            case 'ñ':
                res = "— — · — —";
                break;

            case 'o':
                res = "— — —";
                break;

            case 'p':
                res = "· — — ·";
                break;

            case 'q':
                res = "— — · —";
                break;

            case 'r':
                res = "· — ·";
                break;

            case 's':
                res = "· · ·";
                break;

            case 't':
                res = "—";
                break;

            case 'u':
                res = "· · —";
                break;

            case 'v':
                res = "· · · —";
                break;

            case 'w':
                res = "· — —";
                break;

            case 'x':
                res = "— · · —";
                break;

            case 'y':
                res = "— · — —";
                break;

            case 'z':
                res = "— — · ·";
                break;

            case '0':
                res = "— — — — —";
                break;

            case '1':
                res = "· — — — —";
                break;

            case '2':
                res = "· · — — —";
                break;

            case '3':
                res = "· · · — —";
                break;

            case '4':
                res = "· · · · —";
                break;

            case '5':
                res = "· · · · ·";
                break;

            case '6':
                res = "— · · · ·";
                break;

            case '7':
                res = "— — · · ·";
                break;

            case '8':
                res = "— — — · ·";
                break;

            case '9':
                res = "— — — — ·";
                break;

            case '-':
                res = "· — · — · —";
                break;

            case ',':
                res = "— · — · — —";
                break;

            case '?':
                res = "· · — — · ·";
                break;

            case '"':
                res = "· — · · — ·";
                break;

            case '!':
                res = "— — · · — —";
                break;

            case ' ':
                res = "";
                break;
            default:
                res = "ERROR.";

        }


        return res;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Escribe algo y te lo mostraré en moooorse :)");
        String texto = br.readLine().toLowerCase();

        for (int i = 0; i < texto.length(); i++) {
            System.out.print(morse(texto.charAt(i)));
        }

    }
}
