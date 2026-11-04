package ejercicios;

import ejemplo.MiEntradaSalida;

import java.util.Scanner;

public class Ejercicio6 {
    static Scanner teclado = new Scanner(System.in);

    public static void bucarArray(int[] miArray, int busca) {
        int i = 0;
        boolean encontrado=true;
        while (encontrado && i<miArray.length) {
            if (miArray[i] == busca) {
                System.out.println("se encontro el " + busca);
                encontrado=false;
            }else {
                i++;
            }
        }
        if (encontrado){
            System.out.println("no se encontro ");
        }
    }

    static void main() {
        System.out.print("inserta el tamaño: ");
        int tamano = teclado.nextInt();
        System.out.print("el maximo del aleatorio: ");
        int max = teclado.nextInt();
        System.out.print("el numero que buscas: ");
        int busca = teclado.nextInt();

        int[] array = MiEntradaSalida.listaArrayAleatorio(tamano, max);
        bucarArray(array, busca);

    }
}
