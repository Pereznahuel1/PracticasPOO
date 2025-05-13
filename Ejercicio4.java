package trabajo_practico_1;

//Una empresa de camiones necesita un algoritmo para controlar el egreso de sus 30
//camiones desde la planta y la carga que transportan. Para ello, se necesita que por cada
//camión se cargue por teclado su patente, el nombre y apellido del chofer, el tipo de carga
//que lleva (madera, yerba o té) y a qué hora egresó. Además, la empresa necesita saber
//cuántos camiones cargaron té. Al final, debe mostrar todos estos datos por pantalla al
//usuario.



import java.util.Scanner;

class Camion {
    String patente;
    String chofer;
    String tipoCarga;
    String horaEgreso;

    
    public Camion(String patente, String chofer, String tipoCarga, String horaEgreso) {
        this.patente = patente;
        this.chofer = chofer;
        this.tipoCarga = tipoCarga;
        this.horaEgreso = horaEgreso;
    }

    
    public void resolver() {
        System.out.println("Patente: " + patente);
        System.out.println("Chofer: " + chofer);
        System.out.println("Tipo de carga: " + tipoCarga);
        System.out.println("Hora de egreso: " + horaEgreso);
    }
}

public class Ejercicio4 {
    public static void resolver() {
        Scanner scanner = new Scanner(System.in);
        Camion[] camiones = new Camion[30];
        int camionesConTe = 0;

       
        for (int i = 0; i < camiones.length; i++) {
            System.out.println("Ingrese los datos del camion #" + (i + 1));

            System.out.print("Patente: ");
            String patente = scanner.nextLine();

            System.out.print("Nombre y apellido del chofer: ");
            String chofer = scanner.nextLine();

            System.out.print("Tipo de carga (madera, yerba, te): ");
            String tipoCarga = scanner.nextLine();

            System.out.print("Hora de egreso (HH:MM): ");
            String horaEgreso = scanner.nextLine();

            
            camiones[i] = new Camion(patente, chofer, tipoCarga, horaEgreso);

            
            if (tipoCarga.equalsIgnoreCase("te")) {
                camionesConTe++;
            }
        }

        
        System.out.println("Datos de todos los camiones:");
        for (int i = 0; i < camiones.length; i++) {
            camiones[i].resolver();
        }

        
        System.out.println("Cantidad de camiones que transportan te: " + camionesConTe);

        scanner.close();
    }
}