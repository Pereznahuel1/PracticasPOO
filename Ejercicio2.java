package trabajo_practico_1;


import java.util.Scanner;

public class Ejercicio2 {
    public static void resolver() {
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.print("Ingrese la cantidad de notas: ");
        n = scanner.nextInt();

        int[] notas = new int[n];
        int aprobados = 0;
        int desaprobados = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese la nota " + (i + 1) + ": ");
            notas[i] = scanner.nextInt();

            if (notas[i] >= 6) {
                aprobados++;
            } else {
                desaprobados++;
            }
        }

        System.out.println("Cantidad de aprobados: " + aprobados);
        System.out.println("Cantidad de desaprobados: " + desaprobados);
    }
}