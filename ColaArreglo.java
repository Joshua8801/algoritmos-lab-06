package ejercicio2;
 
public class ColaArreglo {
 
    private int[] cola;
    private int front;
    private int rear;
    private int size;
    private int capacidad;
 
    public ColaArreglo(int capacidad) {
        this.capacidad = capacidad;
        cola = new int[capacidad];
        front = 0;
        rear = -1;
        size = 0;
    }
 
    public void enqueue(int x) {
        if (isFull()) {
            System.out.println("Cola llena");
            return;
        }
 
        rear = (rear + 1) % capacidad;
        cola[rear] = x;
        size++;
    }
 
    public Integer dequeue() {
        if (isEmpty()) {
            System.out.println("Cola vacía");
            return null;
        }
 
        int dato = cola[front];
        front = (front + 1) % capacidad;
        size--;
 
        return dato;
    }
 
    public Integer front() {
        if (isEmpty()) {
            System.out.println("Cola vacía");
            return null;
        }
 
        return cola[front];
    }
 
    public boolean isEmpty() {
        return size == 0;
    }
 
    public boolean isFull() {
        return size == capacidad;
    }
}
