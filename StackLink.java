package actividadPilaLista;
 
public class StackLink<E> implements Stack<E> {
 
    private Node<E> top;
 
    public StackLink() {
        top = null;
    }
 
    @Override
    public void push(E x) {
        Node<E> nuevo = new Node<>(x);
        nuevo.setNext(top);
        top = nuevo;
    }
 
    @Override
    public E pop() {
        if (isEmpty()) {
            System.out.println("Pila vacía");
            return null;
        }
 
        E dato = top.getData();
        top = top.getNext();
        return dato;
    }
 
    @Override
    public E top() {
        if (isEmpty()) {
            System.out.println("Pila vacía");
            return null;
        }
 
        return top.getData();
    }
 
    @Override
    public boolean isEmpty() {
        return top == null;
    }
 
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node<E> aux = top;
 
        while (aux != null) {
            sb.append(aux.getData()).append(" -> ");
            aux = aux.getNext();
        }
 
        sb.append("null");
        return sb.toString();
    }
}
