import java.util.Scanner;
import java.util.Locale;

public class Kata6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); // Por si acaso manejamos decimales o configuraciones

        int totalClientes = 0;
        int contadorHoras = 0;
        int maxClientes = -1;
        int horaPico = -1;

        // Pedimos la primera hora antes del bucle
        System.out.print("Ingresa la hora (0-23, -1 para terminar): ");
        int hora = scanner.nextInt();

        // Bucle while que se repite mientras la hora sea diferente de -1
        while (hora != -1) {
            // Validar que la hora esté entre 0 y 23
            if (hora < 0 || hora > 23) {
                System.out.println("Hora inválida");
            } else {
                // Si la hora es correcta, pedimos los clientes de esa hora
                System.out.print("Ingresa el número de clientes en esa hora: ");
                int clientes = scanner.nextInt();

                // Acumulamos los datos
                totalClientes = totalClientes + clientes;
                contadorHoras = contadorHoras + 1;

                // Buscamos si esta hora tiene más clientes que el récord anterior
                if (clientes > maxClientes) {
                    maxClientes = clientes;
                    horaPico = hora;
                }
            }

            // Volvemos a pedir la hora para continuar o salir en la siguiente vuelta
            System.out.print("Ingresa la hora (0-23, -1 para terminar): ");
            hora = scanner.nextInt();
        }

        // Al salir del bucle, revisamos si se ingresaron datos o no
        if (contadorHoras == 0) {
            System.out.println("No se ingresaron datos");
        } else {
            System.out.println("--- Reporte de Clientes ---");
            System.out.println("Total de clientes: " + totalClientes);

            // Calculamos el promedio dividiendo el total entre las horas válidas conndecimales usando (.)
            double promedio = (double) totalClientes / contadorHoras;
            System.out.println("Promedio por hora: " + String.format(Locale.US, "%.2f", promedio));

            System.out.println("Hora con más clientes: " + horaPico + " (" + maxClientes + " clientes)");
        }

        scanner.close();
    }
}
