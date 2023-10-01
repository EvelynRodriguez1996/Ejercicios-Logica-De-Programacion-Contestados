El algoritmo para invertir el texto ingresado puede ser el siguiente:

1. Leer la palabra o frase ingresada por consola.
2. Crear una variable de tipo String para almacenar el texto invertido.
3. Recorrer el texto ingresado de derecha a izquierda.
4. En cada iteración, obtener el caracter actual y agregarlo al inicio de la variable para almacenar el texto invertido.
5. Mostrar por consola el texto invertido.

El pseudocódigo sería:


Leer texto
Crear variable textoInvertido y asignar valor vacío
Para i desde longitud del texto - 1 hasta 0, decrementando de 1
   Obtener caracter en posición i del texto
   Agregar caracter al inicio de textoInvertido
Mostrar textoInvertido


A continuación, el código en Java:

java
import java.util.Scanner;

public class InvertirTexto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar por consola una palabra o frase
        System.out.println("Ingrese una palabra o frase: ");
        String texto = scanner.nextLine();
        
        // Invertir el texto ingresado
        String textoInvertido = "";
        for (int i = texto.length() - 1; i >= 0; i--) {
            char caracter = texto.charAt(i);
            textoInvertido += caracter;
        }
        
        // Mostrar el texto invertido por consola
        System.out.println("Texto invertido: " + textoInvertido);
    }
}