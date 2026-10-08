package RELACION1º2;

public class Ejercicio1 {
    static void main (String[] args){
        for (int i = 1;i<=100;i++){
         int res7 = i%7;
         int res13 = i%13;
         if (res7 == 0 || res13 == 0){
             System.out.print("El numero es "+i+" es multiplo por ");
             if (res7 == 0){
                 System.out.print("7 ");
             }
             if (res13 == 0){
                 System.out.print("13");
             }
             System.out.print("\n");
         }
        }
    }
}
