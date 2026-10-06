package RELACION1º1;

import java.util.Scanner;

public class Ejercicio9 {
    static void main (String[] args){
        System.out.println("inserta el tipo y el precio;");
        Scanner teclado =new Scanner(System.in);
        String tipo = teclado.nextLine();
        int precio = teclado.nextInt();

        if (tipo.equals("A")){
            System.out.println("7%");
        } else if (tipo.equals("C")||precio<500) {
            System.out.println("12%");
        } else {
            System.out.println("9%");
        }
    }
}
