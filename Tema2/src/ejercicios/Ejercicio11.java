package ejercicios;

public class Ejercicio11 {
    public static int[] comboArray(int[] miArray, int[] tuArray) {
        int[] array = new int[miArray.length];
        for (int i = 0; i < miArray.length; i++) {
            for (int j = 0; j < tuArray.length; j++) {
                if (miArray[i] == tuArray[j]) {
                    array[i] = miArray[i];
                }
            }
        }
        return array;

        /*int[] array=new int[miArray.length];
        for (int i = 0; i < miArray.length; i++) {
            if (miArray[i] == tuArray[i]) {
                array[i]=miArray[i];
            }
        }
        return array;*/
    }

    static void main() {
        int miArray[] = {9, 3, 2, 6, 5, 7, 5};
        int tuArray[] = {1, 6, 2, 3, 7, 4, 9};
        int[] array = comboArray(miArray, tuArray);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

