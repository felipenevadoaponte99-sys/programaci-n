package ejemplo.repaso;

public class ejercicio2 {
/*Define un array de 10 caracteres con nombre simbolo y asigna valores a los
elementos según la tabla que se muestra a continuación. Muestra el contenido
de todos los elementos del array. ¿Qué sucede con los valores de los elementos
que no han sido inicializados?*/
static void main(){
    char[] num = new char[12];
    num[0]='a';
    num[1]='x';
    num[4]='@';
    num[6]=' ';
    num[8]='+';
    num[9]='Q';
    for (int i = 0; i < num.length; i++) {
        System.out.print(num[i]+" ");
    }
}
}
