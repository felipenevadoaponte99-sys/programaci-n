package ejercicios;

import ejemplo.MiEntradaSalida;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio10 {

        public static int[] arreglaArray(int[] miArray) {

            Arrays.sort(miArray);
            int[] array = new int[miArray.length];
            int con = 0;
            for (int j = 0; j < miArray.length; j++) {
                if (miArray.length - 1 == j || miArray[j] != miArray[j + 1]) {
                    array[con] = miArray[j];
                    con++;
                }
            }
            int[] arrayDOs = new int[con];
            for (int j = 0; j < arrayDOs.length; j++) {
                arrayDOs[j] = array[j];
            }
            return arrayDOs;
        }

    static void main() {

        int miArray[] = {1, 1, 3, 2, 3, 5, 4, 5, 1};
        int[] array = arreglaArray(miArray);
        System.out.println(Arrays.toString(array));

        /*
        int[] miArray = new int[MiEntradaSalida.leerEntero("Introduce el tamaño del array")];
        for (int i = 0; i < miArray.length; i++) {
            miArray[i] = MiEntradaSalida.leerEntero("Introduce el elemento " + (i+1) + " del array");
        }

        boolean igual;
        int contador = 0;
        int[] array2 = new int[miArray.length];
        for (int i = 0; i < miArray.length; i++) {
            igual = false;
            for (int j = 0; j < miArray.length; j++) {
                if (miArray[i] == array2[j]) {
                    igual = true;
                }
            }

            if (!igual) {
                array2[contador++] = miArray[i];
            }
        }

        int[] array3 = new int[contador];
        for (int i = 0; i < contador; i++) {
            array3[i] = array2[i];
        }

        for (int i = 0; i < array3.length; i++) {
            System.out.println(array3[i]);
        }*/
    }
}
