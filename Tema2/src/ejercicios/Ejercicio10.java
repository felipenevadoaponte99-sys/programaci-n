package ejercicios;

import ejemplo.MiEntradaSalida;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio10 {
    static Scanner teclado = new Scanner(System.in);

    public static void arreglaArray(int[] miArray) {
        //int[] nuevoArray = new int[miArray.length];

        /*for (int i = 0; i < nuevoArray.length; i++) {
            System.out.print(nuevoArray[i]);
        }*/

        Arrays.sort(miArray);

        for (int j = 0; j < miArray.length; j++) {
            if (miArray.length - 1 == j || miArray[j] != miArray[j + 1]) {
                System.out.print(miArray[j]);
            }
        }

        //return nuevoArray;
    }

    static void main() {
        int miArray[] = {1, 3, 2, 3, 5, 4, 5};
        arreglaArray(miArray);
        /*int [] array=arreglaArray(miArray);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }*/

        /*System.out.print("inserta el tamaño: ");
        int tamano = teclado.nextInt();
        System.out.print("el maximo del aleatorio: ");
        int max = teclado.nextInt();
        int[] array = MiEntradaSalida.listaArrayAleatorio(tamano, max);*/
    }
}
