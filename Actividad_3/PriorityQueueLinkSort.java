package Actividad_3; 

  

import Actividad_1.ExceptionIsEmpty; 

  

class PriorityQueueLinkSort<E, N extends Comparable<N>> implements PriorityQueue<E, N> { 

  

    class EntryNode { 

        E data; 

        N priority; 

  

        EntryNode(E data, N priority) { 

            this.data = data; 

            this.priority = priority; 

        } 

    } 

  

    private Node<EntryNode> first; 

    private Node<EntryNode> last; 

  

    public PriorityQueueLinkSort() { 

        this.first = null; 

        this.last = null; 

    } 

  

    @Override 

    public void enqueue(E x, N pr) { 

        EntryNode entry = new EntryNode(x, pr); 

        Node<EntryNode> newNode = new Node<>(entry); 

  

        // Caso 1: lista vacía 

        if (isEmpty()) { 

            first = last = newNode; 

            return; 

        } 

  

        // Caso 2: insertar al inicio (mayor prioridad) 

        if (pr.compareTo(first.getData().priority) > 0) { 

            newNode.setNext(first); 

            first = newNode; 

            return; 

        } 

  

        // Caso 3: buscar posición correcta 

        Node<EntryNode> current = first; 

  

        while (current.getNext() != null && 

                pr.compareTo(current.getNext().getData().priority) <= 0) { 

            current = current.getNext(); 

        } 

  

        newNode.setNext(current.getNext()); 

        current.setNext(newNode); 

  

        // si se insertó al final 

        if (newNode.getNext() == null) { 

            last = newNode; 

        } 

    } 

  

    @Override 

    public E dequeue() throws ExceptionIsEmpty { 

        if (isEmpty()) 

            throw new ExceptionIsEmpty("Queue is empty"); 

  

        E aux = this.first.getData().data; 

        this.first = this.first.getNext(); 

  

        if (this.first == null) 

            this.last = null; 

  

        return aux; 

    } 

  

    @Override 

    public E front() throws ExceptionIsEmpty { 

        if (isEmpty()) { 

            throw new ExceptionIsEmpty("Queue is empty"); 

        } 

  

        return first.getData().data; 

    } 

  

    @Override 

    public E back() throws ExceptionIsEmpty { 

        if (isEmpty()) { 

            throw new ExceptionIsEmpty("Queue is empty"); 

        } 

  

        return last.getData().data; 

    } 

  

    @Override 

    public boolean isEmpty() { 

        return first == null; 

    } 

  

    @Override 

    public String toString() { 

        if (isEmpty()) { 

            return "[]"; 

        } 

  

        StringBuilder sb = new StringBuilder("["); 

        Node<EntryNode> current = first; 

  

        while (current != null) { 

            sb.append("(") 

                    .append(current.getData().data) 

                    .append(", ") 

                    .append(current.getData().priority) 

                    .append(")"); 

  

            if (current.getNext() != null) { 

                sb.append(" -> "); 

            } 

  

            current = current.getNext(); 

        } 

  

        sb.append("]"); 

        return sb.toString(); 

    } 

} 