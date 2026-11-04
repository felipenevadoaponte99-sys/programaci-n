package ejercicios;

import ejemplo.MiEntradaSalida;

import java.util.Scanner;

public class Ejercicio7 {
    static Scanner teclado = new Scanner(System.in);

    static void main() {
        System.out.print("inserta el tamaño: ");
        int tamano = teclado.nextInt();
        System.out.print("el maximo del aleatorio: ");
        int max = teclado.nextInt();
        System.out.print("el numero que buscas: ");
        int busca = teclado.nextInt();

        int[] array = MiEntradaSalida.listaArrayAleatorio(tamano, max);
        boolean exite = MiEntradaSalida.bucarArray(array, busca);
        if(exite){
            System.out.println("se encontro");
        }else {
            System.out.println("NO se encontro");
        }
    }
}
