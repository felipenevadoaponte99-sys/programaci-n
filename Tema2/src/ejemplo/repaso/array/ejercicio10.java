package ejemplo.repaso;

import ejemplo.MiEntradaSalida;

public class ejercicio10 {
    static int []parimparmodificado(int [] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length-1; j > i; j--) {
                if (array[j]%2==0){
                    int caja=array[j-1];
                    array[j-1]=array[j];
                    array[j]=caja;
                }
            }
        }
        return array;
    }

    static void main() {
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i]=MiEntradaSalida.numeroAleatorio(101);
            System.out.println(array[i]);
        }
        System.out.println("----------------");
        parimparmodificado(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
