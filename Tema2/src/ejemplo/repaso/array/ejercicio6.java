package ejemplo.repaso;

import java.util.Scanner;

public class ejercicio6 {
    static Scanner teclado = new Scanner(System.in);

    static int[] rotar(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = teclado.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-1-i; j++) {
                int almacen = array[j+1];
                array[j+1]=array[j];
                array[j]=almacen;
            }
        }

        return array;
    }

    static void main() {
        int[] array = new int[10];
        rotar(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
