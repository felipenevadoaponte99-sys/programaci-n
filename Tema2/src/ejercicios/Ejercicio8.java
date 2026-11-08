package ejercicios;

import ejemplo.MiEntradaSalida;

import java.util.Scanner;

public class Ejercicio8 {
    static Scanner teclado = new Scanner(System.in);


    static void main() {
        int miArray[] = {1, 2, 3, 4, 5};
        System.out.print("insete el numero: ");
        int busca = teclado.nextInt();
        int valor = MiEntradaSalida.bucarArrayPosicion(miArray, busca);
        if (valor == -1) {
            System.out.println("posicion " + valor + " no encontrado");
        } else {
            System.out.println("esta en la posicion " + valor);
        }
    }
}
