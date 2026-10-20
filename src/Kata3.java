import java.util.Scanner;

public class Kata3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variables sencillas para guardar los valores
        double subtotal = 0;

        System.out.print("Ingresa el precio del producto (0 para terminar): ");
        double precio = scanner.nextDouble();

        // Repetimos mientras el precio NO sea 0
        while (precio != 0) {
            subtotal = subtotal + precio;

            System.out.print("Ingresa el precio del producto (0 para terminar): ");
            precio = scanner.nextDouble();
        }

        // Cálculos básicos
        double iva = subtotal * 0.19;
        double totalConIVA = subtotal + iva;
        double descuento = 0;
        double totalFinal = totalConIVA;

        // Si el total con IVA pasa de 50000, calculamos el descuento del 10%
        if (totalConIVA > 50000) {
            descuento = totalConIVA * 0.10;
            totalFinal = totalConIVA - descuento;
        }

        // Mostrar resultados en pantalla
        System.out.println("Subtotal: $" + (int) subtotal);
        System.out.println("IVA (19%): $" + (int) iva);

        if (totalConIVA > 50000) {
            System.out.println("Total con IVA: $" + (int) totalConIVA);
            System.out.println("Descuento (10%): $" + (int) descuento);
            System.out.println("Total a pagar: $" + (int) totalFinal);
        } else {
            System.out.println("Total: $" + (int) totalFinal);
        }

        scanner.close();
    }
}
