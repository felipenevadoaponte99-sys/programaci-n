package RELACION1º1;

import java.util.Scanner;

public class Ejercicio7 {
    static void main (String[] args){
        Scanner teclado =new Scanner(System.in);
        String estado =teclado.nextLine();
        int edad = teclado.nextInt();

        if (edad<50){
            if (edad<35){
                if (estado.equals("S")|| estado.equals("D")){
                    System.out.println("12%");
                }
                if (estado.equals("v")||estado.equals("C")){
                    System.out.println("11.3%");
                }
            }
            else {
                System.out.println("10.5%");
            }
        }
        else {
            System.out.println("8.5%");
        }
    }

}
