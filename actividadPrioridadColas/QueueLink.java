package actividadPrioridadColas;

import actividad1.ExceptionIsEmpty;

class QueueLink<E> {
    private Node<E> first; // inicio de la cola
    private Node<E> last;  // final de la cola

    public QueueLink() {
        first = last = null; // cola vacía
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void enqueue(E data) {
        Node<E> newNode = new Node<>(data); // crear nuevo nodo

        if (isEmpty()) {
            // si está vacía, ambos apuntan al mismo nodo
            first = last = newNode;
        } else {
            // se agrega al final (FIFO)
            last.next = newNode;
            last = newNode;
        }
    }

    public E dequeue() throws ExceptionIsEmpty {
        if (isEmpty()) {
            throw new ExceptionIsEmpty("Cola vacía");
        }

        E data = first.data;     // obtener dato del frente
        first = first.next;      // avanzar al siguiente nodo

        if (first == null) {
            last = null; // si queda vacía, limpiar last
        }

        return data;
    }
}