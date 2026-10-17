package RELACION1º1;

import java.util.Scanner;

public class Ejercicio2 {
    static void main (String[] args){
        Scanner teclado = new Scanner(System.in);
        int numero1 = teclado.nextInt();
        int numero2 = teclado.nextInt();

        if (numero1==numero2){
            System.out.println("son iguales");
        }
        else if (numero1<numero2) {
            System.out.println("el mayor es el segundo");
        }
        else {
            System.out.println("el mayor es el primero");
        }

    }

}
