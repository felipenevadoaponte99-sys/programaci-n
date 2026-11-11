package ejemplo;

import java.util.Scanner;

public class MiEntradaSalida {
    static Scanner teclado = new Scanner(System.in);

    public static String leerCadena(String mensaje) {
//        Scanner teclado = new Scanner(System.in);
//        System.out.print(mensaje+": ");
        System.out.printf("%s: ", mensaje);
//        String cadenaIntroducuda = teclado.nextLine();
//        return cadenaIntroducuda;
        return teclado.nextLine();
    }

    public static int leerEntero(String mensaje) {
//        Scanner teclado = new Scanner(System.in);
        System.out.printf("%s: ", mensaje);
        return Integer.parseInt(teclado.nextLine());
    }

    public static int leerEnterPositivoMayor0(String mensaje) {
//        Scanner teclado = new Scanner(System.in);
        System.out.printf("%s: ", mensaje);
        int numero = Integer.parseInt(teclado.nextLine());
        do {
            if (numero <= 0) {
                System.out.print("introduce un numero positivo: ");
                numero = Integer.parseInt(teclado.nextLine());
            }
        } while (numero <= 0);
        return numero;
    }

    public static double leerDouble(String mensaje) {
        System.out.printf("%s: ", mensaje);
        return Double.parseDouble(teclado.nextLine());
    }

    //leerEnteroEnRango(String mensaje, int min, int max)
    public static String leerEnteroEnRango(String mensaje, int min, int max) {
        System.out.printf("%s: ", mensaje);
        int numero = Integer.parseInt(teclado.nextLine());
        while (numero < min || numero > max) {
            System.out.print("numero fuera de rango (el rango es " + min + " a " + max + "): ");
            numero = Integer.parseInt(teclado.nextLine());
        }
        return ("el numero esta en el rango");
    }
    //leerCaracter(String mensaje)
  public static char leerCaracter(String mensaje){
          System.out.printf("%s: ",mensaje);
          return teclado.nextLine().charAt(0);
         // return mensaje.charAt(0);

  }
    //leerSiN(String mensaje)
    public static void leerSiN(String mensaje){
        System.out.println(mensaje+" ¡Hola Mundo!");
    }
    //leerSiNo(String mensaje)
    public static boolean leerSiNo(String mensaje){
        System.out.printf("%s: ", mensaje);
        String esAzul = teclado.next();
        if (esAzul.equals("si")){
            return true;
        }else {
            return false;
        }
    }
    public static int numeroAleatorio(int numero) {
        //int numeroAleatorio = (int) (Math.random() * numero) + 1;
        int numeroAleatorio = (int) (Math.random() * numero);
        return numeroAleatorio;
    }

    public static int[] listaArrayAleatorio(int lista, int asta) {
        int[] array=new int[lista];
        for (int i = 0; i < array.length; i++) {
            array[i]= MiEntradaSalida.numeroAleatorio(asta);
        }
        return array;
    }
    public static boolean bucarArray(int[] miArray, int busca) {
        int i = 0;
        while (i<miArray.length) {
            if (miArray[i] == busca) {
                return true;
            }else {
                i++;
            }
        }
        return false;
    }
    public static int bucarArrayPosicion(int[] miArray, int busca) {
        int i = 0;
        while (i<miArray.length) {
            if (miArray[i] == busca) {
                return i;
            }else {
                i++;
            }
        }
        return -1;
    }
    static int con = 0;
    public static int[] apilar(int nume, int[] almace) {
        almace[con] = nume;
        con++;
        System.out.print("[");
        for (int j = 0; j < con; j++) {
            if (con == 1) {
                System.out.print(almace[j]);
            } else if (con <= 10) {
                if (con - 1 > j) {
                    System.out.print(almace[j] + ", ");
                } else {
                    System.out.print(almace[j]);
                }
            }
        }
        System.out.println("]");
        return almace;
    }

    public static int[] desapilar(int[] almace) {
        almace[con] = 0;
        con--;
        System.out.print("[");
        for (int j = 0; j < con; j++) {
            if (con == 1) {
                System.out.print(almace[j]);
            } else if (con <= 10) {
                if (con > j) {
                    System.out.print(almace[j] + ", ");
                } else {
                    System.out.print(almace[j]);
                }
            }
        }
        System.out.println("]");
        return almace;
    }

    static void main(String[] args) {
        String nombre = leerCadena("¿como te llamas?");
        System.out.printf("Hola %s\n", nombre);
//        System.out.println("Hola " + nombre);
        int numero = leerEntero("¿cuantos años tienes?");
        System.out.printf("tienes %s años\n", numero);
//        System.out.println("tienes " + numero);
        int supeNumero = leerEnterPositivoMayor0("¿escribe el numero?");
        System.out.println(supeNumero);

        double numeroRaro = leerDouble("¿Escrive el numero con coma?");
        System.out.printf("su numero es %s\n", numeroRaro);

        //leerEnteroEnRango(String mensaje, int min, int max)
        String miNumero = leerEnteroEnRango("¿escrive un numero?", 5, 15);
        System.out.println(miNumero);

        //leerCaracter(String mensaje)
        char miCaracter = leerCaracter("¿dime un caracter?");
        System.out.printf("tu caracter es %s\n", miCaracter);

        //leerSiN(String mensaje)
        leerSiN("¿hola?");

        boolean siNo = leerSiNo("¿el cielo es azul?");
        System.out.print("la respuesta es ");
        if (siNo){
            System.out.print("verdadero");
        }
        else {
            System.out.print("falso");
        }

    }
}