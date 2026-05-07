package Actividad_2; 

  

class DequeLink<E> implements Deque<E> { 

    private Node<E> first; 

    private Node<E> last; 

  

    public DequeLink() { 

        first = null; 

        last = null; 

    } 

  

    @Override 

    public void addFirst(E x) { 

        Node<E> newNode = new Node<>(x); 

  

        if (isEmpty()) { 

            first = last = newNode; 

        } else { 

            newNode.setNext(first); 

            first = newNode; 

        } 

    } 

  

    @Override 

    public void addLast(E x) { 

        Node<E> newNode = new Node<>(x); 

  

        if (isEmpty()) { 

            first = last = newNode; 

        } else { 

            last.setNext(newNode); 

            last = newNode; 

        } 

    } 

  

    @Override 

    public E removeFirst() throws ExceptionIsEmpty { 

        if (isEmpty()) { 

            throw new ExceptionIsEmpty("Deque is empty"); 

        } 

  

        E aux = first.getData(); 

        first = first.getNext(); 

  

        if (first == null) { 

            last = null; 

        } 

  

        return aux; 

    } 

  

    @Override 

    public E removeLast() throws ExceptionIsEmpty { 

        if (isEmpty()) { 

            throw new ExceptionIsEmpty("Deque is empty"); 

        } 

  

        // solo un nodo 

        if (first == last) { 

            E aux = first.getData(); 

            first = last = null; 

            return aux; 

        } 

  

        Node<E> current = first; 

  

        while (current.getNext() != last) { 

            current = current.getNext(); 

        } 

  

        E aux = last.getData(); 

        last = current; 

        last.setNext(null); 

  

        return aux; 

    } 

  

    @Override 

    public E getFirst() throws ExceptionIsEmpty { 

        if (isEmpty()) { 

            throw new ExceptionIsEmpty("Deque is empty"); 

        } 

  

        return first.getData(); 

    } 

  

    @Override 

    public E getLast() throws ExceptionIsEmpty { 

        if (isEmpty()) { 

            throw new ExceptionIsEmpty("Deque is empty"); 

        } 

  

        return last.getData(); 

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

        Node<E> current = first; 

  

        while (current != null) { 

            sb.append(current.getData()); 

            if (current.getNext() != null) { 

                sb.append(", "); 

            } 

            current = current.getNext(); 

        } 

  

        sb.append("]"); 

        return sb.toString(); 

    } 

} 