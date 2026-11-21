package ejemplo.repaso;

import ejemplo.MiEntradaSalida;

public class ejercicio4 {
    static int [] numero(int[] num){
        for (int i = 0; i < num.length; i++) {
            num[i]=MiEntradaSalida.numeroAleatorio(101);
        }
        return num;
    }
    static int[] cuadrado(int[] num){
        int [] cuadrado= new int[num.length];
        for (int i = 0; i < num.length; i++) {
            cuadrado[i]=num[i]*num[i];
        }
        return cuadrado;
    }
    static int[] cubo(int[] num){
        int [] cubo= new int[num.length];
        for (int i = 0; i < num.length; i++) {
            cubo[i]=num[i]*num[i]*num[i];
        }
        return cubo;
    }

    static void main() {
        int[] num = new int[20];
        numero(num);
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]+" ");
        }
        System.out.println();
        int [] cudra= cuadrado(num);
        for (int i = 0; i < cudra.length; i++) {
            System.out.print(cudra[i]+" ");
        }
        System.out.println();
        int [] cubo= cubo(num);
        for (int i = 0; i < cubo.length; i++) {
            System.out.print(cubo[i]+" ");
        }
    }

}
