import java.util.Scanner;

public class Kata1 {
    public static void main(String[] args) {
        // Creamos el Scanner para leer datos por la consola
        Scanner scanner = new Scanner(System.in);

        // Pedimos los datos al usuario
        System.out.print("Ingresa el total de la cuenta: ");
        double totalCuenta = scanner.nextDouble();

        System.out.print("Ingresa el porcentaje de propina: ");
        double porcentajePropina = scanner.nextDouble();

        // Validaciones
        if (totalCuenta <= 0) {
            System.out.println("Error: total inválido");
            scanner.close();
            return;
        }

        if (porcentajePropina < 0 || porcentajePropina > 100) {
            System.out.println("Error: porcentaje inválido");
            scanner.close();
            return;
        }

        // Cálculos
        double propina = totalCuenta * (porcentajePropina / 100.0);
        double totalPagar = totalCuenta + propina;

        // Mostrar resultados
        if (propina == (int) propina && totalPagar == (int) totalPagar) {
            System.out.println("Propina: $" + (int) propina);
            System.out.println("Total a pagar: $" + (int) totalPagar);
        } else {
            System.out.println("Propina: $" + String.format("%.2f", propina));
            System.out.println("Total a pagar: $" + String.format("%.2f", totalPagar));
        }

        // Mensaje según porcentaje
        if (porcentajePropina > 30) {
            System.out.println("¡Propina generosa!");
        } else if (porcentajePropina < 5) {
            System.out.println("Propina muy baja");
        }

        scanner.close();
    }
}