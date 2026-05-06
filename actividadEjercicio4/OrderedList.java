package actividadEjercicio4;

public class OrderedList<E, K extends Comparable<K>> {

    private Node<E, K> head;

    public OrderedList() {
        head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    // Inserta ordenado (menor key primero)
    public void insert(E data, K key) {
        Node<E, K> newNode = new Node<>(data, key);

        if (head == null || key.compareTo(head.key) < 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node<E, K> current = head;
        while (current.next != null &&
               key.compareTo(current.next.key) >= 0) {
            current = current.next;
        }

        newNode.next = current.next;
        current.next = newNode;
    }

    public E removeFirst() {
        if (isEmpty()) return null;

        E value = head.data;
        head = head.next;
        return value;
    }
}