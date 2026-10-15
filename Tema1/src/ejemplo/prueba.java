package ejemplo;

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

    }
}
