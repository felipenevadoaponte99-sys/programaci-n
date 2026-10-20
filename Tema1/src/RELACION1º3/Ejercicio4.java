package RELACION1º3;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio4 {
    static void main(String[] args){
        Scanner teclado=new Scanner(System.in);
        Random random=new Random();
        int aleatorio= random.nextInt(100)+1;
        int miNumero=0;
        int intento=0;
        System.out.println("juego del numero secreto");
        do{
            intento++;
           // System.out.println(aleatorio);
            miNumero = teclado.nextInt();
            if (miNumero<1 || miNumero>100){
                System.out.println("El numero debe estar entre 1 y 100");
            }else{
                if (miNumero==aleatorio){
                    System.out.println("enora buena lo as adivinado");
                }else if(miNumero<aleatorio){
                    System.out.println("el numero número secreto es mayor");
                }else {
                    System.out.println("el numero número secreto es menor");
                }
            }
        }while (intento<5 && miNumero!=aleatorio);
        if (intento==5 && miNumero!=aleatorio){
            System.out.println("fin del juego as perdido");
        }
        //System.out.print(aleatorio+1);
    }
}
