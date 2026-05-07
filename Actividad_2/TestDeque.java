package Actividad_2;

public class TestDeque {
    public static void main(String[] args) {
        try {
            DequeLink<Integer> dequeInt = new DequeLink<>();

            System.out.println("=== DEQUE CON INTEGER ===");

            dequeInt.addFirst(20);
            dequeInt.addFirst(10);
            dequeInt.addLast(30);
            dequeInt.addLast(40);

            System.out.println("Deque: " + dequeInt);

            System.out.println("Primero: " + dequeInt.getFirst());
            System.out.println("Último: " + dequeInt.getLast());

            System.out.println("Eliminar primero: " + dequeInt.removeFirst());
            System.out.println("Deque después de eliminar primero: " + dequeInt);

            System.out.println("Eliminar último: " + dequeInt.removeLast());
            System.out.println("Deque después de eliminar último: " + dequeInt);

            System.out.println();

            DequeLink<String> dequeStr = new DequeLink<>();

            System.out.println("=== DEQUE CON STRING ===");

            dequeStr.addFirst("Luis");
            dequeStr.addFirst("Ana");
            dequeStr.addLast("Carlos");
            dequeStr.addLast("María");

            System.out.println("Deque: " + dequeStr);

            System.out.println("Primero: " + dequeStr.getFirst());
            System.out.println("Último: " + dequeStr.getLast());

            System.out.println("Eliminar primero: " + dequeStr.removeFirst());
            System.out.println("Deque después de eliminar primero: " + dequeStr);

            System.out.println("Eliminar último: " + dequeStr.removeLast());
            System.out.println("Deque después de eliminar último: " + dequeStr);

        } catch (ExceptionIsEmpty e) {
            System.out.println(e.getMessage());
        }
    }
}