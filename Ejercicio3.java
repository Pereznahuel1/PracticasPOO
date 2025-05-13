package trabajo_practico_1;
//Se tienen 2 vectores con “n” productos, uno con las cantidades[n] y el otro con los
//costos[n]. Determinar el precio total e informar todos aquellos que superen los $1000.

import java.util.Scanner;

public class Ejercicio3 {
    
    public static void resolver() {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de productos: ");
        int n = scanner.nextInt();

        int[] cantidades = new int[n];
        double[] costos = new double[n];

        // Carga de datos
        for (int i = 0; i < n; i++) {
            System.out.print("Cantidad del producto " + (i + 1) + ": ");
            cantidades[i] = scanner.nextInt();

            System.out.print("Costo unitario del producto " + (i + 1) + ": ");
            costos[i] = scanner.nextDouble();
        }

        double precioTotalGeneral = 0;
        System.out.println("\nProductos con precio total mayor a $1000:");

        for (int i = 0; i < n; i++) {
            double precioTotal = cantidades[i] * costos[i];
            precioTotalGeneral += precioTotal;

            if (precioTotal > 1000) {
                System.out.println("Producto " + (i + 1) + ": $" + precioTotal);
            }
        }

        System.out.println("Precio total de todos los productos: $" + precioTotalGeneral);
    }
}