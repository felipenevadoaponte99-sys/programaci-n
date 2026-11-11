package ejercicios;

import ejemplo.MiEntradaSalida;

import java.util.Scanner;

public class Ejercicio14 {
    static int con = 0;

    public static int[] desencolar(int[] almace) {
        almace[0] = 0;
        for (int i = 0; i < con; i++) {
            if (i == con - 1) {
                almace[i] = 0;
            } else {
                almace[i] = almace[i + 1];
            }
        }
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
        System.out.println("Para apilar di ´encolar´, para desapilar di ´desencolar´ y para finalizar escrive lo que quieras");
        String letra = teclado.nextLine();
        int numero = 0;
        int[] almace = new int[10];
        int[] pila;
        do {
            switch (letra) {
                case "encolar":
                    numero = MiEntradaSalida.leerEntero("inseta el numero");
                    if (con < 10) {
                        System.out.print("cola ->");
                        pila = MiEntradaSalida.apilar(numero, almace);
                        con++;

                    } else {
                        System.out.println("La cola está llena, no puedo encolar el elemento");
                    }
                    break;
                case "desencolar":
                    if (con > 0) {
                        System.out.print("cola ->");
                        pila = desencolar(almace);
                    } else {
                        System.out.println("No hay elementos en la cola");
                    }
                    break;
                default:
                    System.out.println("final");
                    letra = "";
                    break;

            }
            if (letra.equals("encolar") || letra.equals("desencolar")) {
                letra = teclado.nextLine();
            }
        } while (letra.equals("encolar") || letra.equals("desencolar"));
        System.out.print("fin de prueba");
    }
}
