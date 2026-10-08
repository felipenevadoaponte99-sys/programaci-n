package ejemplo;

import java.util.Scanner;

public class Ejemplo2 {
    static void main (String[] args){
        System.out.println("escribe el divisor mas pequeño:");
        Scanner teclado =new Scanner(System.in);
        int nu = teclado.nextInt();
        int res= 2;
        while (nu%res!=0){
            res++;
        }
        System.out.println("numero : " + res);
    }
}
