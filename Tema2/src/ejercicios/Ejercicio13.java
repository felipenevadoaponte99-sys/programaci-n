package ejercicios;

import ejemplo.MiEntradaSalida;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio13 {
    static int con = 0;
    static int NUMERO_ARRAY = 10;
    static int[] almace = new int[NUMERO_ARRAY];

    public static void apilar(int nume) {
        if (NUMERO_ARRAY > con) {
            almace[con] = nume;
            con++;
            mostrapila();
        } else {
            System.out.println("La pila está llena, no puedo apilar el elemento");
        }
    }

    public static void desapilar() {
        if (0 < con) {
            con--;
            mostrapila();
        } else {
            System.out.println("No hay elementos en la pila");
        }
    }

    public static void mostrapila() {

            System.out.print("pila ->[");
            for (int j = 0; j < con; j++) {
                if (j > 0) {
                    System.out.print(", " + almace[j]);
                } else {
                    System.out.print(almace[j]);
                }
            }
            System.out.println("]");

    }

    static void main() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Para apilar di ´apilar´, para desapilar di ´desapilar´ y para finalizar escrive lo que quieras");
        String letra = teclado.nextLine();
        int numero = 0;
        do {
            switch (letra) {
                case "apilar":
                    numero = MiEntradaSalida.leerEntero("inserta el numero");
                    apilar(numero);
                    break;
                case "desapilar":
                    desapilar();
                    break;
                default:
                    System.out.println("final");
                    break;
            }
            if (letra.equals("apilar") || letra.equals("desapilar")) {
                letra = teclado.nextLine();
            }
        } while (letra.equals("apilar") || letra.equals("desapilar"));
        System.out.print("fin de prueba");
    }
}
