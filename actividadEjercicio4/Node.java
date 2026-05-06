package actividadEjercicio4;

public class Node<E, K extends Comparable<K>> {
    E data;
    K key;
    Node<E, K> next;

    public Node(E data, K key) {
        this.data = data;
        this.key = key;
        this.next = null;
    }
}