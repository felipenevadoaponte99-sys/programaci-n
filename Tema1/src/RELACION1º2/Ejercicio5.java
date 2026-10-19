package RELACION1º2;

import java.util.Scanner;

public class Ejercicio5 {
    static void main(String[] args){
        Scanner teclado =new Scanner(System.in);
        int numero = 0;
        int contador = 0;
        do{
            System.out.print("Introduce un número (negativo para terminar): ");
            numero = teclado.nextInt();
            if(numero>=0){
                contador++;
            }
        }while (numero>=0);
        System.out.print("Has introducido " +contador+ " números positivos");

    }
}
