package ejemplo;

import java.util.Scanner;

public class prueba {
    static void main(String[] args) {
        //1Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle for.
        /*
        for (int i =5;i<=100;i+=5){
            System.out.println(i);
        }
        */
        //2Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle while.
        /*
        int contador=5;
        while (contador<=100){
            System.out.println(contador);
            contador+=5;
        }
        */
        //3Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle do-while.
        /*
        int contador=0;
        do{
            if (contador<100){
                contador+=5;
            }
            System.out.println(contador);

        }while (contador<100);
        */
        //4Muestra los números del 320 al 160,contandode 20 en 20 hacia atrás utilizando un bucle
        /*
        for(int i =320; 160<=i; i-=20){
            System.out.println(i);
        }
        System.out.println("----------------------------------------------------");
        */
        //5 Muestra los números del 320 al 160,contandode 20 en 20 hacia atrás utilizando un bucle
        /*
        int numero=320;
        while (160<=numero){
            System.out.println(numero);
            numero-=20;
        }
        */
        //6 Muestra los números del 320 al 160, contando de 20 en 20 utilizando un bucle
        /*
        int numero=320;
        do{
            System.out.println(numero);
            if (160<=numero){
                numero-=20;
            }
        }while (160<=numero);
        */
//7 Realiza el control de acceso a una caja fuerte. La combinación será un
//número de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no
//acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación”
//y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
//Tendremos cuatro oportunidades para abrir la caja fuerte.
        /*
        Scanner teclado =new Scanner(System.in);
        int intentos=0;
        int pass=1234;
        boolean corecto=false;
        System.out.println("contraseña para seguir");
        while (intentos<4) {
            intentos++;
            int numero = teclado.nextInt();
            if (numero ==pass) {
                corecto=true;
                intentos=4;
            }else {
                System.out.println("has gastado " + intentos+" intentos");
            }
        }
        if (corecto){
            System.out.println("contraseña corecta");
        }else {
            System.out.println("final de intentos");
        }
        */
        //8Muestra la tabla de multiplicar de un número introducido por teclado.
        /*
        System.out.println("Tablas de multiplicar");
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();
        for(int i=1; i<=10;i++){
            System.out.println(numero+"*"+i+"="+numero*i);
        }
        */
        //9 Realiza un programa que nos diga cuántos dígitos tiene un número introducido
        //por teclado. Este ejercicio es equivalente a otro realizado anteriormente, con
        //la salvedad de que el anterior estaba limitado a números de 5 dígitos como
        //máximo. En esta ocasión, hay que realizar el ejercicio utilizando bucles; de
        //esta manera, la única limitación en el número de dígitos la establece el tipo de
        //dato que se utilice
        /*
        System.out.println("inserte el numero");
        Scanner teclado = new Scanner(System.in);
        int nume = teclado.nextInt();
        int conta=0;
        while (nume>=1){
            nume/=10;
            conta++;
        }
        System.out.println("tiene "+ conta+" digitos");
        */
    }
}
