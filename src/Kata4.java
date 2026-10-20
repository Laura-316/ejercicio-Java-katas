import java.util.Scanner;

public class Kata4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // PASO 1: Pedir el día y la hora
        System.out.print("Ingresa el día (1=Lunes, 7=Domingo): ");
        int dia = scanner.nextInt();

        System.out.print("Ingresa la hora (0-23): ");
        int hora = scanner.nextInt();

        // PASO 2: Validar que el día y la hora estén en los rangos correctos
        if (dia < 1 || dia > 7) {
            System.out.println("Error: día inválido");
        } else if (hora < 0 || hora > 23) {
            System.out.println("Error: hora inválida");
        } else {

            // PASO 3: Switch actualizado con flechas (->) y sin break
            switch (dia) {
                case 1, 2, 3, 4, 5 -> {
                    if (hora >= 6 && hora < 20) {
                        System.out.println("La cafetería está abierta.");
                        System.out.println("Horario: 6:00 AM - 8:00 PM");
                    } else {
                        System.out.println("La cafetería está cerrada.");
                        System.out.println("Horario de lunes a viernes: 6:00 AM - 8:00 PM");
                    }
                }
                case 6 -> {
                    if (hora >= 7 && hora < 14) { // 14 representa las 2:00 PM
                        System.out.println("La cafetería está abierta.");
                        System.out.println("Horario de sábado: 7:00 AM - 2:00 PM");
                    } else {
                        System.out.println("La cafetería está cerrada.");
                        System.out.println("Horario de sábado: 7:00 AM - 2:00 PM");
                    }
                }
                case 7 -> {
                    System.out.println("La cafetería está cerrada.");
                    System.out.println("Horario de domingo: cerrado todo el día");
                }
            }
        }

        scanner.close();
    }
}
