package ejemplo;

import java.util.Random;

public class Aleatorios {
    static void main (String[] args){
        //Forma 1: Clase Random
        Random r =new Random();
        System.out.println(r.nextInt());
        System.out.println(r.nextInt(10)); // 0 asta 9
        System.out.println(r.nextInt(-10,10)); //-10 asta 9
        /*for (int i = 0; i < 10; i++) {
            System.out.println(r.nextInt(10));
            System.out.println(r.nextInt(-10,10));
        }*/
        //forma2: Clase math
        double random = Math.random();
        int numeroAleatorio = (int) (Math.random() * 10);
        int numeroAleatorioMenos = (int) (Math.random() * 10) - 10;
    }
}
