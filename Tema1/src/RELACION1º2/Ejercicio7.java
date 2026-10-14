package RELACION1º2;

import java.util.Scanner;

public class Ejercicio7 {
    static void main (String[] args){
        Scanner teclado=new Scanner(System.in);
        System.out.println("inserta la cantidad de nueros que vas a insertar");
        int cantidad =teclado.nextInt();
        int total =0;
        System.out.println("agrega los numeros para la media");
        for (int i = 1; i<= cantidad; i++){
            int numeros =teclado.nextInt();
            //total = total+ numeros;
            total+=numeros;
        }
        System.out.printf("la media es " + total/cantidad);

    }
}
