package actividadPrioridadColas;

class Node<E> {
    E data;          // valor almacenado
    Node<E> next;    // referencia al siguiente nodo

    public Node(E data) {
        this.data = data;
        this.next = null; // inicialmente no apunta a otro nodo
    }
}