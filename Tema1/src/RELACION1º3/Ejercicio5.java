package RELACION1º3;

import java.util.Scanner;

public class Ejercicio5 {
    static void main(String[] args) {
        System.out.println("inserta el nuemero");
        Scanner teclado=new Scanner(System.in);
        int primo=0;
        int miNumero=teclado.nextInt();
        int con=0;
        int i=1;

        while (con<=2 && i<miNumero){
            primo=miNumero%i;
            if(primo==0) {
                con++;
            }
            i++;
        }
        if (con>2){
            System.out.println("no es un numero primo");
        }else {
            System.out.println("es un numero primo");
        }
    }
}
