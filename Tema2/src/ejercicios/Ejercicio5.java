package ejercicios;

import ejemplo.MiEntradaSalida;

import java.util.Scanner;

public class Ejercicio5 {

    static Scanner teclado = new Scanner(System.in);

    public static int[] listaArrayAleatorio(int lista, int asta) {
        int[] array=new int[lista];
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]= MiEntradaSalida.numeroAleatorio(asta));
        }
        return array;
    }

    static void main() {
        System.out.print("inserta el tamaño: ");
        int tamano= teclado.nextInt();
        int[] array= listaArrayAleatorio(tamano,1001);
    }
}
