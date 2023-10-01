import java.util.HashMap;
import java.util.Scanner;

public class Traductor {
    public static void main(String[] args) {
        // Crear el diccionario
        HashMap<String, String> diccionario = new HashMap<>();
        diccionario.put("gato", "cat");
        diccionario.put("perro", "dog");
        diccionario.put("casa", "house");
        diccionario.put("árbol", "tree");
        diccionario.put("ordenador", "computer");
        // Agregar más palabras al diccionario si se desea

        // Solicitar una palabra al usuario
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa una palabra en español:");
        String palabra = scanner.nextLine();

        // Buscar la traducción en el diccionario y mostrarla
        if(diccionario.containsKey(palabra)) {
            String traduccion = diccionario.get(palabra);
            System.out.println("La traducción de \"" + palabra + "\" es \"" + traduccion + "\"");
        } else {
            System.out.println("La palabra \"" + palabra + "\" no se encuentra en el diccionario");
        }
    }
}