package actividadEjercicio4;

public class PriorityQueueHybrid<E, K extends Comparable<K>> {

    private OrderedList<E, K>[] levels;
    private int size;

    @SuppressWarnings("unchecked")
    public PriorityQueueHybrid(int n) {
        size = n;
        levels = new OrderedList[n];
        for (int i = 0; i < n; i++) {
            levels[i] = new OrderedList<>();
        }
    }

    // enqueue(x, priority, secondaryKey)
    public void enqueue(E data, int priority, K key) {
        if (priority < 0 || priority >= size) {
            System.out.println("Prioridad inválida");
            return;
        }
        levels[priority].insert(data, key);
    }

    // dequeue desde prioridad más alta
    public E dequeue() {
        for (int i = size - 1; i >= 0; i--) {
            if (!levels[i].isEmpty()) {
                return levels[i].removeFirst();
            }
        }
        return null;
    }
}