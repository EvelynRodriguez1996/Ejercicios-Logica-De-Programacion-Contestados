import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> dictionary = new HashMap<>();

        // Agregar palabras al diccionario
        dictionary.put("casa", "house");
        dictionary.put("perro", "dog");
        dictionary.put("gato", "cat");
        dictionary.put("mesa", "table");
        dictionary.put("sol", "sun");
        // ...

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        ArrayList<String> palabrasEspanol = new ArrayList<>(dictionary.keySet());
        int palabrasCorrectas = 0;
        int palabrasIncorrectas = 0;

        System.out.println("Traduce las siguientes palabras del español al inglés:");
        for (int i = 0; i < 5; i++) {
            // Escoger una palabra al azar
            String palabraEspanol = palabrasEspanol.get(random.nextInt(palabrasEspanol.size()));
            String palabraIngles = dictionary.get(palabraEspanol);

            System.out.print(palabraEspanol + ": ");
            String traduccion = scanner.nextLine();

            if (traduccion.equalsIgnoreCase(palabraIngles)) {
                palabrasCorrectas++;
                System.out.println("¡Correcto!");
            } else {
                palabrasIncorrectas++;
                System.out.println("Incorrecto. La traducción correcta es: " + palabraIngles);
            }
        }

        System.out.println("Respuestas correctas: " + palabrasCorrectas);
        System.out.println("Respuestas incorrectas: " + palabrasIncorrectas);
    }
}