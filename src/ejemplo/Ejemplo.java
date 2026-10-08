package ejemplo;

import jdk.dynalink.beans.StaticClass;

import java.util.Scanner;

public class Ejemplo {
    static void main (String[] args){
        System.out.println("inserta los dos numeros");
/*
        Scanner teclado1 =new Scanner(System.in);
         int numero1= teclado1.nextInt();

        Scanner teclado2 =new Scanner(System.in);
        int numero2= teclado2.nextInt();
*/
        Scanner teclado1 =new Scanner(System.in);
        double numero1= Double.parseDouble(teclado1.nextLine());

//        int numero = Integer.parseInt(teclado1.nextLine())

        Scanner teclado2 =new Scanner(System.in);
        double numero2= Double.parseDouble(teclado2.nextLine());

//        System.out.printf("la suma es %.d\n", numero1+numero2);
        System.out.printf("la suma es %.2f\n", numero1+numero2);
        System.out.printf("la resta es %.2f\n", numero1-numero2);
        System.out.printf("la multiplica es %.2f\n", numero1/numero2);
        System.out.printf("la divide es %.2f\n", numero1*numero2);
/*        System.out.println("la suma es "+ (numero1+numero2));
        System.out.println("la resta es "+ (numero1-numero2));
        System.out.println("la multiplica es "+ (numero1*numero2));
        System.out.println("la divide es "+ (numero1/numero2));
*/
    }
}
// pides dos numeros por teclado y haz una suma, resta, multiplicacion division
//prueba de subida