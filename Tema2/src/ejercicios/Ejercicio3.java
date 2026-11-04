package ejercicios;

import ejemplo.MiEntradaSalida;

public class Ejercicio3 {
    public static int[] listaArray(int[] lista) {

        for (int i = 0; i < lista.length; i++) {
            lista[i] = MiEntradaSalida.leerEntero("Introduzca el número " + (i + 1));
        }
        return lista;
    }

    public static int max(int[] miArray) {
        int comparaMax = Integer.MIN_VALUE;
        int con = 0;
        for (int i = 0; i < miArray.length; i++) {
            if (miArray[i] > comparaMax) {
                comparaMax = miArray[i];
                con = 0;
            } else if (miArray[i] == comparaMax) {
                con++;
            }
        }
        System.out.print("El mayor número introducido es " + comparaMax);
        if (con > 0) {
            System.out.println(" ( e repite "+con+" veces)");
        }else {
            System.out.println();
        }
        return comparaMax;
    }
    public static int min(int[] miArray) {
        int comparaMin = Integer.MAX_VALUE;
        int con = 0;
        for (int i = 0; i < miArray.length; i++) {
            if (miArray[i] < comparaMin) {
                comparaMin = miArray[i];
                con = 0;
            } else if (miArray[i] == comparaMin) {
                con++;
            }
        }
        System.out.print("El minimo número introducido es " + comparaMin);
        if (con > 0) {
            System.out.println(" ( se repite "+con+" veces)");
        }else {
            System.out.println();
        }
        return comparaMin;
    }
    public static void miMedia(int[] miArray){
        int sumaMedia=0;
        int con=0;
        for (int i = 0; i <miArray.length ; i++) {
            sumaMedia+=miArray[i];
            con++;
        }
        System.out.println("La media de los números introducidos es: "+((double)sumaMedia/con));
    }
    /*
   public static void max(int[] miArray) {
       int comparaMax = Integer.MIN_VALUE;
       recorre(comparaMax, miArray);
   }
   public static int recorre(int res,int[] miArray) {
       int con = 0;
       for (int i = 0; i < miArray.length; i++) {
           if (miArray[i] > res) {
               res = miArray[i];
               con = 0;
           } else if (miArray[i] == res) {
               con++;
           }
       }
       System.out.print("El número introducido es " + res);
       if (con > 0) {
           System.out.println("(se repite "+con+" veces)");
       }else {
           System.out.println();
       }
       return res;
   }*/



    static void main() {
        int[] lista = new int[MiEntradaSalida.leerEnterPositivoMayor0("Introduzca las posiciones que tendrá el array")];
        listaArray(lista);
        int max = max(lista);
        int min = min(lista);
        miMedia(lista);
        //max(lista);
    }
}
