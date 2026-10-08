package RELACION1º2;

import java.util.Scanner;

public class Ejercicio4 {
    static void main(String[] args){
        System.out.print("Introduce un número positivo: ");
        Scanner teclado =new Scanner(System.in);
        int numero = teclado.nextInt();
        while (numero<0){
            System.out.println("valor incorecto:");
            numero = teclado.nextInt();
        }
        int total=0;
        for (int i=1; i<=numero+1;i++){
            int con=0;
            for (int a=100; a>=1;a--){
                if(i%a==0){
                    con++;
                }
            }
            if (con==2){
                total=total+i;
            }
        }
        System.out.println("la suma de los "+numero+" primeros numeros es: "+total);

    }
}
