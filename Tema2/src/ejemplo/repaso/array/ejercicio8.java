package ejemplo.repaso;

import java.util.Scanner;

public class ejercicio8 {
    static Scanner teclado = new Scanner(System.in);
    static void diagrama(double [] array){

        for (int i = 0; i < array.length; i++) {
            String puntos="";
            for (int j = 0; j < array[i]; j++) {
                puntos+="*";
            }
            System.out.println("mes "+i+" "+puntos);
        }

    }
    static void main (){
        double [] array= new double[12];
        for (int i = 0; i < array.length; i++) {
            array[i] = Double.parseDouble(teclado.nextLine());
        }
        diagrama(array);
    }
}
