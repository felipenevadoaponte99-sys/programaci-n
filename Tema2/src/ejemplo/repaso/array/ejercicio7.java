package ejemplo.repaso;

import ejemplo.MiEntradaSalida;

import java.util.Scanner;

public class ejercicio7 {
    static Scanner teclado = new Scanner(System.in);
    static void cabios(int[] array){
        int numero = teclado.nextInt();
        int cambia =teclado.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (array[i]==numero){
                array[i]=cambia;
                System.out.println("'"+array[i]+"'");
            }else {
                System.out.println(array[i]);
            }
        }
    }

    static void main() {
        int [] array= new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i]= MiEntradaSalida.numeroAleatorio(21);
            System.out.println(array[i]);
        }
        cabios(array);
    }
}
