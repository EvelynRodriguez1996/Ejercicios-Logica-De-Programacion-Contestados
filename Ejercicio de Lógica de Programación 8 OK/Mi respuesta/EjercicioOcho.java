package ejercicioOcho;

import java.util.Scanner;

public class EjercicioOcho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[10];

        System.out.println("Ingrese 10 números:");

        // Solicitar los números al usuario
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        // Ordenar el array moviendo los números primos al inicio
        ordenarArray(array);

        // Mostrar el array resultante
        mostrarArray(array);
    }

    // Método para verificar si un número es primo
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }

    // Método para ordenar el array moviendo los números primos al inicio
    public static void ordenarArray(int[] array) {
        int i = 0;
        int j = array.length - 1;

        while (i < j) {
            // Mover i hacia adelante hasta encontrar un número no primo
            while (i < j && esPrimo(array[i])) {
                i++;
            }

            // Mover j hacia atrás hasta encontrar un número primo
            while (i < j && !esPrimo(array[j])) {
                j--;
            }

            // Intercambiar los números no primos y primos
            if (i < j) {
                int tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;
            }
        }
    }

    // Método para mostrar el array
    public static void mostrarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("pos[" + i + "] = " + array[i]);
        }
    }
}