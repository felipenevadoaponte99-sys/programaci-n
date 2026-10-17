package RELACION1º2;

import java.util.Scanner;

public class Ejercicio2 {
    static void main(String[] args){
        Scanner teclado =new Scanner(System.in);
        int numero= teclado.nextInt();

        while (numero<0 || numero>10){
            System.out.println("numero incorecto:");
            numero= teclado.nextInt();
        }
//        System.out.println("listo");
        System.out.println("tabla del "+numero+":");
        for (int i=1;i<=10;i++){
            System.out.println(i+"*"+numero+"="+(numero*i));
        }
    }
}
