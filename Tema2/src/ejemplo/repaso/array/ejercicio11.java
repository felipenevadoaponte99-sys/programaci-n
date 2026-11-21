package ejemplo.repaso;

public class ejercicio11 {
    /*Realiza un programa que pida 10 números por teclado y que los almacene en
un array. A continuación se mostrará el contenido de ese array junto al índice
(0 – 9) utilizando para ello una tabla. Seguidamente el programa pasará los
primos a las primeras posiciones, desplazando el resto de números (los que no
son primos) de tal forma que no se pierda ninguno. Al final se debe mostrar el
array resultante.*/
    static void muestra(int[] num) {
        int con = 0;
        int[] escrito = {20, 5, 7, 4, 32, 9, 2, 14, 11, 6};
        for (int i = 0; i < escrito.length; i++) {
            System.out.println("indice " + i + " valor " + escrito[i]);
        }
        for (int i = 0; i < escrito.length; i++) {
            for (int j = escrito.length-1; j > i; j--) {
                for (int k = 1; k <= escrito[j]; k++) {
                    if (escrito[j]%k==0){
                        con++;
                    }
                }
                if (con==2){
                    int caja= escrito[j];
                    escrito[j]=escrito[j-1];
                    escrito[j-1]=caja;
                }
                con=0;
            }
        }
        System.out.println("----------------------------------------------");

        for (int i = 0; i < escrito.length; i++) {
            System.out.println("indice " + i + " valor " + escrito[i]);
        }
    }

    static void main() {
        int[] num = new int[10];
        muestra(num);
    }
}
