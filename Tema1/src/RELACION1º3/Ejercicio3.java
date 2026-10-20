package RELACION1º3;

import java.util.Scanner;

public class Ejercicio3 {
    static void main(String[] args){
        Scanner tecldo= new Scanner(System.in);
        System.out.print("Introduce un número:");
        int miNumero=tecldo.nextInt();
        int cifra=0;
        int cuenta =miNumero;
        do{
            cuenta/=10;
            cifra++;
        }while(cuenta>0);
        System.out.print("El número "+miNumero+" tiene "+cifra+" cifras");
    }
}
