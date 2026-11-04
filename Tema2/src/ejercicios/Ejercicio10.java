package ejercicios;

import ejemplo.MiEntradaSalida;

import java.util.Scanner;

public class Ejercicio10 {
    static Scanner teclado = new Scanner(System.in);

    public static void arreglaArray(int[] miArray) {
        int[] nuevoArray = new int[miArray.length];

        /*for (int i = 0; i < nuevoArray.length; i++) {
            System.out.print(nuevoArray[i]);
        }*/
        for (int i = 0; i < miArray.length; i++) {
            for (int j = 0; j < nuevoArray.length; j++) {
                if (nuevoArray[j] != miArray[i] && j==i) {
                    System.out.print(miArray[i]);
                }
            }
        }
        //return nuevoArray;
//////////////////////////////////////////preguntar

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
