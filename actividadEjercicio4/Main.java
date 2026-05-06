package actividadEjercicio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese numero de niveles de prioridad: ");
        int niveles = sc.nextInt();
        sc.nextLine(); // limpiar buffer

        PriorityQueueHybrid<String, Integer> pq =
                new PriorityQueueHybrid<>(niveles);

        System.out.print("Cuantos elementos desea ingresar: ");
        int n = sc.nextInt();
        sc.nextLine(); // limpiar buffer

        for (int i = 0; i < n; i++) {
            System.out.println("\nElemento " + (i + 1));

            System.out.print("Dato (String): ");
            String dato = sc.nextLine();

            System.out.print("Prioridad (0 a " + (niveles - 1) + "): ");
            int prioridad = sc.nextInt();

            System.out.print("Valor secundario (entero): ");
            int valor = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            pq.enqueue(dato, prioridad, valor);
        }

        System.out.println("\nSalida (dequeue):");
        while (true) {
            String x = pq.dequeue();
            if (x == null)
                break;
            System.out.println(x);
        }

        sc.close();
    }
}
