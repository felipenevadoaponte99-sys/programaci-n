package RELACION1º2;

import java.util.Scanner;

public class Ejercicio9 {
    static void main (String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("escribe el numeros");
        int miNumero= teclado.nextInt();
        int miContador=0;
        String miRespuesta="";
        if (miNumero<0){
            System.out.println("no se permie numeros negativos");
        }else {
            for (int i=1;i<miNumero;i++){
                if(miNumero%i==0){
                    miContador=miContador+i;
                    if (miContador==1){
                        miRespuesta= miRespuesta + i ;
                    }else {
                        miRespuesta= miRespuesta +"+"+ i ;
                    }
                }
            }
            miRespuesta= miRespuesta +"=";
            System.out.print("El número " + miNumero);
            if (miContador==miNumero){
                System.out.print(" es perfecto porque es igual que ");
            }else{
                System.out.print(" no es perfecto porque ");
            }
            System.out.print(miRespuesta +miContador);
        }
    }

}
