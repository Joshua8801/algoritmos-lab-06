package actividadPrioridadColas;

import actividad1.ExceptionIsEmpty;

class PriorityQueueMulti<E> {
    private QueueLink<E>[] queues; // arreglo de colas (una por prioridad)
    private int levels;

    @SuppressWarnings("unchecked")
    public PriorityQueueMulti(int levels) {
        this.levels = levels;
        queues = new QueueLink[levels];

        // inicializar cada cola
        for (int i = 0; i < levels; i++) {
            queues[i] = new QueueLink<>();
        }
    }

    public void enqueue(E data, int priority) {
        // validar prioridad
        if (priority < 0 || priority >= levels) return;

        queues[priority].enqueue(data); // insertar en su nivel
    }

    public E dequeue() throws ExceptionIsEmpty {
        // buscar desde mayor prioridad a menor
        for (int i = levels - 1; i >= 0; i--) {
            if (!queues[i].isEmpty()) {
                return queues[i].dequeue(); // FIFO dentro de cada cola
            }
        }
        throw new ExceptionIsEmpty("Colas vacías");
    }

    public boolean isEmpty() {
        // verificar si todas las colas están vacías
        for (int i = 0; i < levels; i++) {
            if (!queues[i].isEmpty()) return false;
        }
        return true;
    }
}