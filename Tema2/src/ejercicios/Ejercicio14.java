package ejercicios;

import ejemplo.MiEntradaSalida;

import java.util.Scanner;

public class Ejercicio14 {
    static int con = 0;
    static int primerElemento = 0;
    static int NUMERO_ARRAY = 3;
    static int[] almace = new int[NUMERO_ARRAY];

    public static void encolar(int nume) {
        if (NUMERO_ARRAY > con) {
            //almace[con] = nume;
            int posicion=(primerElemento+con)% almace.length;
            almace[posicion]=nume;
            con++;
            mostrarcola();
        } else {
            System.out.println("La pila está llena, no puedo apilar el elemento");
        }
    }

    public static void desencolar() {
        if (0 < con) {/*
            for (int i = 0; i < con; i++) {
                almace[i] = almace[i + 1];
            }*/
            System.out.println(primerElemento);
            primerElemento=(primerElemento+1)% almace.length;
            //almace[0]=primerElemento;
            con--;
            mostrarcola();
        } else {
            System.out.println("No hay elementos en la pila");
        }
    }
    public static void mostrarcola() {

        System.out.print("pila ->[");
        for (int j = 0; j < con; j++) {
            if (j > 0) {
                System.out.print(", " + almace[(j+primerElemento) % almace.length]);
            } else {
                System.out.print(almace[(j+primerElemento) % almace.length]);
            }
        }
        System.out.println("]");

    }

    static void main() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Para apilar di ´encolar´, para desapilar di ´desencolar´ y para finalizar escrive lo que quieras");
        String letra = teclado.nextLine();
        int numero = 0;
        do {
            switch (letra) {
                case "encolar":
                    numero = MiEntradaSalida.leerEntero("inseta el numero");
                    encolar(numero);
                    break;
                case "desencolar":
                    desencolar();
                    break;
                case "salir":
                    letra = "";
                    break;
                default:

            }
            letra = teclado.nextLine();

        } while (!letra.equals("salir"));
        System.out.print("fin de prueba");
    }
}
