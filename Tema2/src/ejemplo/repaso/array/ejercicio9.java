package ejemplo.repaso;

import ejemplo.MiEntradaSalida;

public class ejercicio9 {
    static void parimpar(int [] array){
        for (int i = 0; i < array.length; i++) {
            if (array[i]%2==0){
                System.out.print("par ");
            }else {
                System.out.print("impar ");
            }
            System.out.println(array[i]);
        }
    }
    static void main(){
        int [] array =new int[4];
        for (int i = 0; i < array.length; i++) {
            array[i]= MiEntradaSalida.leerEntero("numero "+(i+1)+"");
        }
        parimpar(array);
    }
}
