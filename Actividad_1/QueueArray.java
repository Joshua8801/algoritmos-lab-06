package Actividad_1; 

class QueueArray<E> implements Queue<E> { 

    private E[] array; 

    private int front; 

    private int rear; 

    private int size; 

  

    public QueueArray(int n) { 

        array = (E[]) new Object[n]; 

        front = 0; 

        rear = -1; 

        size = 0; 

    } 

  

    @Override 

    public void enqueue(E x) { 

        if (isFull()) { 

            System.out.println("Queue is full"); 

            return; 

        } 

  

        rear = (rear + 1) % array.length; // circular 

        array[rear] = x; 

        size++; 

    } 

  

    @Override 

    public E dequeue() throws ExceptionIsEmpty { 

        if (isEmpty()) { 

            throw new ExceptionIsEmpty("Queue is empty"); 

        } 

  

        E aux = array[front]; 

        front = (front + 1) % array.length; // circular 

        size--; 

  

        return aux; 

    } 

  

    @Override 

    public E front() throws ExceptionIsEmpty { 

        if (isEmpty()) { 

            throw new ExceptionIsEmpty("Queue is empty"); 

        } 

  

        return array[front]; 

    } 

  

    @Override 

    public boolean isEmpty() { 

        return size == 0; 

    } 

  

    public boolean isFull() { 

        return size == array.length; 

    } 

  

    @Override 

    public String toString() { 

        if (isEmpty()) { 

            return "[]"; 

        } 

  

        StringBuilder sb = new StringBuilder("["); 

        for (int i = 0; i < size; i++) { 

            sb.append(array[(front + i) % array.length]); 

            if (i < size - 1) { 

                sb.append(", "); 

            } 

        } 

        sb.append("]"); 

        return sb.toString(); 

    } 

} 