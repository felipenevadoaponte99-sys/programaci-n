import java.util.Scanner;

public class Ejercicio4 {
    static void main (String[] args){
        Scanner teclado = new Scanner(System.in);
        int edad = teclado.nextInt();

        if (edad<100 && edad>=0){
           // System.out.println("vamos bien");
            if (edad<13){
                System.out.println("niño");
            }
            else if(edad<18){
                System.out.println("adolescente");
            }
            else if(edad<30) {
                System.out.println("joven");
            }
            else{
                System.out.println("adulto");
            }
        }
    }

}
