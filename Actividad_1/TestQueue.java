package Actividad_1; 

  

public class TestQueue { 

    public static void main(String[] args) { 

        try { 

            // ===== PRUEBA CON INTEGER ===== 

            System.out.println("=== QUEUE CON INTEGER ==="); 

            QueueArray<Integer> q1 = new QueueArray<>(5); 

  

            q1.enqueue(10); 

            q1.enqueue(20); 

            q1.enqueue(30); 

  

            System.out.println("Cola: " + q1); 

            System.out.println("Elemento al frente: " + q1.front()); 

  

            System.out.println("Dequeue: " + q1.dequeue()); 

            System.out.println("Cola después de dequeue: " + q1); 

  

            q1.enqueue(40); 

            q1.enqueue(50); 

            q1.enqueue(60); 

  

            System.out.println("Cola final: " + q1); 

            System.out.println("¿Está vacía?: " + q1.isEmpty()); 

            System.out.println(); 

  

  

            // ===== PRUEBA CON STRING ===== 

            System.out.println("=== QUEUE CON STRING ==="); 

            QueueArray<String> q2 = new QueueArray<>(4); 

  

            q2.enqueue("Ana"); 

            q2.enqueue("Luis"); 

            q2.enqueue("Carlos"); 

  

            System.out.println("Cola: " + q2); 

            System.out.println("Elemento al frente: " + q2.front()); 

  

            System.out.println("Dequeue: " + q2.dequeue()); 

            System.out.println("Cola después de dequeue: " + q2); 

  

            q2.enqueue("María"); 

  

            System.out.println("Cola final: " + q2); 

            System.out.println("¿Está vacía?: " + q2.isEmpty()); 

  

        } catch (ExceptionIsEmpty e) { 

            System.out.println(e.getMessage()); 

        } 

    } 

} 