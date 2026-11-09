package ejercicios;

import java.util.Arrays;

public class Ejercicio13 {
    /*public static int[] apilar(int nume, int[] almace, int i) {
        almace[i]=nume;
        System.out.println(Arrays.toString(almace));
        return almace;
    }
    //public static int[] desapilar(){

    //}*/

    public static int[] apilar(int nume, int[] almace) {
        boolean si = true;
        for (int i = 0; i < almace.length; i++) {
            if (almace[i] == 0 && si) {
                almace[i] = nume;
                si = false;
                System.out.println("pila-->"+Arrays.toString(almace));
            }
            if (almace[almace.length - 1] != 0 && si) {
                System.out.println("La pila está llena, no puedo apilar el elemento");
                si = false;

            }
        }
        return almace;
    }

    public static int[] desapilar(int[] almace) {
        boolean si = true;
        for (int i = 0; i < almace.length; i++) {
            if (almace[0] == 0 && si) {
                System.out.println("No hay elementos en la pila");
                si = false;
            }
            if (almace[i] == 0 && si) {
                almace[i - 1] = 0;
                si = false;
                System.out.println("pila-->"+Arrays.toString(almace));
            }
            if(almace[almace.length-1]!=0){
                almace[almace.length - 1] = 0;
                System.out.println("pila-->"+Arrays.toString(almace));
                si = false;

            }
        }
        return almace;
    }

    static void main() {
        /*int i=0;
        int[] pila;
        int[] almace= new int[10];
        pila = apilar(3, almace, i++);
        pila = apilar(12, almace, i++);
        pila = apilar(40, almace, i);
        //pila =desapilar();*/
        int[] almace = new int[5];
        int[] pila;
        pila = apilar(3, almace);
        pila = apilar(12, almace);
        pila = apilar(40, almace);
        pila = apilar(40, almace);
        pila = apilar(40, almace);
        pila = apilar(40, almace);
        pila = desapilar(almace);
        pila = desapilar(almace);
        pila = desapilar(almace);
        pila = desapilar(almace);
        pila = desapilar(almace);
        pila = desapilar(almace);

        System.out.print("fin de prueba");
    }
}
