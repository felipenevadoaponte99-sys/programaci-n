package RELACION1º1;

import java.util.Scanner;

public class Ejercicio5 {
    static void main (String[] args){
        Scanner teclado = new Scanner(System.in);
        int numero1= teclado.nextInt();
        int numero2= teclado.nextInt();
        int numero3= teclado.nextInt();
        int numero4= teclado.nextInt();

        int sumar = numero1+numero2+numero3+numero4;

        int total=sumar/4;

        System.out.println("la media es "+total);

        if (total<numero1){
            System.out.println("El numero "+numero1+" es superior que la media");
        }
        else if (total<numero2){
            System.out.println("El numero "+numero2+" es superior que la media");
        }
        else if (total<numero3){
            System.out.println("El numero "+numero3+" es superior que la media");
        }
        else if (total<numero4){
            System.out.println("El numero "+numero4+" es superior que la media");
        }
//ejercicio con bucle
/*
        int con=0;
        int total=0;
        while (con<4){
            Scanner teclado = new Scanner(System.in);
            int numero= teclado.nextInt();
            total=total+numero;
            con++;
        }

        System.out.println("la media es "+total/con);
*/
    }
}
