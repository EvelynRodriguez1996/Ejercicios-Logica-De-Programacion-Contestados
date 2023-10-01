package ejercicioSiete;

import java.util.Scanner;

public class EjercicioSiete {
    public static void main(String[] args) {
        // Solicitar al usuario el día de la semana y la hora
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un día de la semana (Lunes - Viernes): ");
        String diaSemana = scanner.nextLine();

        System.out.print("Ingrese la hora y los minutos (formato hh:mm): ");
        String hora = scanner.nextLine();

        // Validar formato de la hora
        if (!hora.matches("\\d{1,2}:\\d{2}")) {
            System.out.println("El formato de la hora es incorrecto. Debe ser hh:mm.");
            return;
        }

        // Obtener las horas y los minutos
        int horas = Integer.parseInt(hora.split(":")[0]);
        int minutos = Integer.parseInt(hora.split(":")[1]);

        // Validar que las horas y los minutos estén dentro de los rangos correctos
        if (horas < 0 || horas > 23 || minutos < 0 || minutos > 59) {
            System.out.println("La hora ingresada no es válida.");
            return;
        }

        // Calcular los minutos faltantes para el fin de semana
        int minutosFaltantes = 0;
        if (diaSemana.equals("Lunes")) {
            minutosFaltantes = 4 * 24 * 60 - (horas * 60 + minutos);
        } else if (diaSemana.equals("Martes")) {
            minutosFaltantes = 3 * 24 * 60 - (horas * 60 + minutos);
        } else if (diaSemana.equals("Miércoles")) {
            minutosFaltantes = 2 * 24 * 60 - (horas * 60 + minutos);
        } else if (diaSemana.equals("Jueves")) {
            minutosFaltantes = 24 * 60 - (horas * 60 + minutos);
        } else if (diaSemana.equals("Viernes")) {
            minutosFaltantes = 15 * 60 - (horas * 60 + minutos);
        } else {
            System.out.println("El día de la semana ingresado no es válido.");
            return;
        }

        // Mostrar el resultado
        System.out.println("Faltan " + minutosFaltantes + " minutos para el fin de semana.");
    }
}