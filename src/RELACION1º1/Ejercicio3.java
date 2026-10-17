package RELACION1º1;

import java.util.Scanner;

public class Ejercicio3 {
    static void main (String[] args){
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();

        if (numero % 2 == 0){
            System.out.println("El número "+numero+" es múltiplo de 2");
        }
        if (numero % 3 == 0){
            System.out.println("El número "+numero+" es múltiplo de 3");
        }
    }
}
