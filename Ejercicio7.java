package trabajo_practico_1;

import java.util.Scanner;

public class Ejercicio7 {

    public static void resolver() {
        Scanner sc = new Scanner(System.in);

        int documento;
        int edad;
        char sexo;

        int totalPersonas = 0;
        int totalHombres = 0;
        int totalMujeres = 0;
        int hombresEntre16y65 = 0;

        int maxEdad = -1;
        int dniMayorEdad = 0;
        char sexoMayorEdad = ' ';
        
        // Inicio del ingreso de datos
        System.out.println("=== Ingreso de datos del censo ===");
        while (true) {
            System.out.print("Ingrese número de documento (0 para terminar): ");
            documento = sc.nextInt();

            if (documento == 0) {
                break; // Fin del ingreso
            }

            System.out.print("Ingrese edad: ");
            edad = sc.nextInt();

            System.out.print("Ingrese sexo (F o M): ");
            sexo = sc.next().toUpperCase().charAt(0);

            totalPersonas++;

            if (sexo == 'M') {
                totalHombres++;
                if (edad >= 16 && edad <= 65) {
                    hombresEntre16y65++;
                }
            } else if (sexo == 'F') {
                totalMujeres++;
            }

            if (edad > maxEdad) {
                maxEdad = edad;
                dniMayorEdad = documento;
                sexoMayorEdad = sexo;
            }
        }

        // Cálculo del porcentaje
        double porcentajeHombres16a65 = 0;
        if (totalHombres > 0) {
            porcentajeHombres16a65 = (double) hombresEntre16y65 * 100 / totalHombres;
        }

        // Resultados
        System.out.println("=== Resultados del Censo ===");
        System.out.println("Total de personas censadas: " + totalPersonas);
        System.out.println("Cantidad de varones: " + totalHombres);
        System.out.println("Cantidad de mujeres: " + totalMujeres);
        System.out.printf("Porcentaje de varones entre 16 y 65 años: %.2f%%", porcentajeHombres16a65);
        System.out.println("Persona de mayor edad: DNI " + dniMayorEdad + ", Edad " + maxEdad + ", Sexo " + sexoMayorEdad);
    }
}
