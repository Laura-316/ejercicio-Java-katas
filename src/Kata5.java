import java.util.Scanner;

public class Kata5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcion = 0;
        int total = 0;

        // Bucle para repetir el menú mientras la opción NO sea 6 (Salir)
        while (opcion != 6) {
            System.out.println(" Menú de la Cafetería");
            System.out.println("1. Café ($4.000)");
            System.out.println("2. Muffin ($3.500)");
            System.out.println("3. Sandwich ($7.500)");
            System.out.println("4. Jugo ($5.000)");
            System.out.println("5. Té ($3.000)");
            System.out.println("6. Salir");

            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            // Procesamos la opción con switch
            switch (opcion) {
                case 1 -> {
                    total = total + 4000;
                    System.out.println("Producto agregado: Café ($4.000)");
                }
                case 2 -> {
                    total = total + 3500;
                    System.out.println("Producto agregado: Muffin ($3.500)");
                }
                case 3 -> {
                    total = total + 7500;
                    System.out.println("Producto agregado: Sandwich ($7.500)");
                }
                case 4 -> {
                    total = total + 5000;
                    System.out.println("Producto agregado: Jugo ($5.000)");
                }
                case 5 -> {
                    total = total + 3000;
                    System.out.println("Producto agregado: Té ($3.000)");
                }
                case 6 -> {
                    // No hace nada, el bucle terminará porque opción es 6
                }
                default -> {
                    // Se ejecuta si pone un número fuera del 1 al 6 (como el 9)
                    System.out.println("Opción inválida");
                }
            }
        }

        // Al salir del bucle, mostramos el total del pedido
        System.out.println("Total del pedido: $" + total);

        scanner.close();
    }
}
