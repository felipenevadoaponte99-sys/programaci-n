package RELACION1º3;

import java.util.Scanner;

public class Ejercicio2 {
    static void main (String[] args) {
        int base=0;
        int expo=0;
        int resul=1;
        Scanner teclado=new Scanner(System.in);
        do {
            System.out.println("inserta la base");
             base=teclado.nextInt();
            System.out.println("inserta el exponente");
             expo=teclado.nextInt();
             if (base<0||expo<0){
                 System.out.println("base o exponeste negativo");
             }
        }while(base<0||expo<0);
        for (int i=expo;i>0;i--){
            resul*=base;
        }
        System.out.println("el resultado es "+resul);
    }
}
