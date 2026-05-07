package actividadPilaLista;

public class TestStack {
    public static void main(String[] args) {
 
        StackLink<Integer> pila = new StackLink<>();
 
        pila.push(10);
        pila.push(20);
        pila.push(30);
 
        System.out.println(pila);
 
        System.out.println("Top: " + pila.top());
        System.out.println("Pop: " + pila.pop());
        System.out.println(pila);
    }
}
