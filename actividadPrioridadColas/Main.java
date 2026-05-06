package actividadPrioridadColas;

import java.util.Scanner;
import actividad1.ExceptionIsEmpty;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Ingrese número de niveles de prioridad: ");
            int niveles = sc.nextInt();

            PriorityQueueMulti<String> pq = new PriorityQueueMulti<>(niveles);

            System.out.print("¿Cuántos elementos desea ingresar?: ");
            int n = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            for (int i = 0; i < n; i++) {
                System.out.print("Ingrese dato: ");
                String dato = sc.nextLine();

                System.out.print("Ingrese prioridad (0 a " + (niveles - 1) + "): ");
                int prioridad = sc.nextInt();
                sc.nextLine(); // limpiar buffer

                pq.enqueue(dato, prioridad);
            }

            System.out.println("\nOrden de salida:");
            while (!pq.isEmpty()) {
                System.out.println(pq.dequeue());
            }

        } catch (ExceptionIsEmpty e) {
            System.out.println(e.getMessage());
        }
    }
}