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
        System.out.println("-----------------------------------------" );

        int nu2 =0;
        for (int i = 1; i <= 10; i++) {
            nu2=nu2+i;
        }
        System.out.println("la suma del 1 al 10 es: "+nu2);

        System.out.println("-----------------------------------------" );

    }
}
