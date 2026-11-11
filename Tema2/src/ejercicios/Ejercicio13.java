package ejercicios;

import ejemplo.MiEntradaSalida;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio13 {
    static int con = 0;

    public static int[] apilar(int nume, int[] almace) {
        almace[con] = nume;
        con++;
        System.out.print("[");
        for (int j = 0; j < con; j++) {
            if (con == 1) {
                System.out.print(almace[j]);
            } else if (con <= 10) {
                if (con - 1 > j) {
                    System.out.print(almace[j] + ", ");
                } else {
                    System.out.print(almace[j]);
                }
            }
        }
        System.out.println("]");
        return almace;
    }

    public static int[] desapilar(int[] almace) {
        almace[con] = 0;
        con--;
        System.out.print("[");
        for (int j = 0; j < con; j++) {
            if (con == 1) {
                System.out.print(almace[j]);
            } else if (con <= 10) {
                if (con > j) {
                    System.out.print(almace[j] + ", ");
                } else {
                    System.out.print(almace[j]);
                }
            }
        }
        System.out.println("]");
        return almace;
    }

    static void main() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Para apilar di ´apilar´, para desapilar di ´desapilar´ y para finalizar escrive lo que quieras");
        String letra = teclado.nextLine();
        int numero = 0;
        int[] almace = new int[10];
        int[] pila;
        do {
            switch (letra) {
                case "apilar":
                    numero = MiEntradaSalida.leerEntero("inseta el numero");
                    if (con < 10) {
                        System.out.print("pila ->");
                        pila = apilar(numero, almace);
                    } else {
                        System.out.println("La pila está llena, no puedo apilar el elemento");
                    }
                    break;
                case "desapilar":
                    if (con > 0) {
                        System.out.print("pila ->");
                        pila = desapilar(almace);
                    } else {
                        System.out.println("No hay elementos en la pila");
                    }
                    break;
                default:
                    System.out.println("final");
                    letra = "";
                    break;

            }
            if (letra.equals("apilar") || letra.equals("desapilar")) {
                letra = teclado.nextLine();
            }
        } while (letra.equals("apilar") || letra.equals("desapilar"));
        System.out.print("fin de prueba");
    }
}
