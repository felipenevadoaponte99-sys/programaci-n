package ejercicios;

public class Ejercicio1 {
    static int sumaPosocionesPares(int[] unArray){
        int posicion=0;
        for (int i=0;i<unArray.length;i++){
            if (i%2==0){
                posicion+=unArray[i];
            }
        }
        return posicion;
    }
    static void main(){
        int miArray[] = {1,2,3,4,5};
        int pares =sumaPosocionesPares(miArray);
        System.out.println("la suma de las posiciones pares es "+pares);

    }
}
