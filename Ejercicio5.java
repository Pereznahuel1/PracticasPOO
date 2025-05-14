package trabajo_practico_1;

import java.util.Scanner;

public class Ejercicio5 {

    public static void resolver() {
        Scanner scanner = new Scanner(System.in);
        final int TOTAL_CLIENTES = 5;

        for (int i = 1; i <= TOTAL_CLIENTES; i++) {
            System.out.println("Cliente " + i);

            // Ingresar DNI
            System.out.print("Ingrese el DNI del cliente: ");
            String dni = scanner.nextLine();

            // Ingresar tipo de servicio
            int tipoServicio;
            do {
                System.out.print("Ingrese el tipo de servicio (1 = 30 megas, 2 = 50 megas, 3 = 100 megas): ");
                tipoServicio = scanner.nextInt();
                scanner.nextLine(); // Limpiar buffer
            } while (tipoServicio < 1 || tipoServicio > 3);

            // Calcular monto a pagar
            double monto = 0;

            switch (tipoServicio) {
                case 1:
                    monto = 750;
                    break;
                case 2:
                    monto = 1100;
                    break;
                case 3:
                    monto = 1500 * 0.95; // 5% de descuento
                    break;
            }

            // Mostrar resultado
            System.out.println("DNI del cliente: " + dni);
            System.out.println("Tipo de servicio: " + tipoServicio);
            System.out.println("Monto a pagar: $" + monto);
            System.out.println("-----------------------------");
        }

        scanner.close();
    }
}
