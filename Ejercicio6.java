package trabajo_practico_1;

import java.util.Scanner;

public class Ejercicio6 {

    public static void resolver() {
        Scanner sc = new Scanner(System.in);

        int numeroVehiculo;
        double tiempo;

        int mejorVehiculo = 0;
        double mejorTiempo = Double.MAX_VALUE; // Lo inicializamos con el valor más alto posible

        for (int i = 1; i <= 12; i++) {
            System.out.println("Ingrese el número del vehículo " + i + ":");
            numeroVehiculo = sc.nextInt();

            System.out.println("Ingrese el tiempo en segundos del vehículo " + numeroVehiculo + ":");
            tiempo = sc.nextDouble();

            if (tiempo < mejorTiempo) {
                mejorTiempo = tiempo;
                mejorVehiculo = numeroVehiculo;
            }
        }

        System.out.println("El vehículo con el mejor tiempo fue el número " + mejorVehiculo +
                " con un tiempo de " + mejorTiempo + " segundos.");
    }
}