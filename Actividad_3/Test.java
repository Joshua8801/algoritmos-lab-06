package Actividad_3; 

  

import Actividad_1.ExceptionIsEmpty; 

  

public class Test { 

    public static void main(String[] args) { 

        try { 

            PriorityQueue<String, Integer> pq = new PriorityQueueLinkSort<>(); 

  

            // insertar elementos 

            pq.enqueue("A", 1); 

            pq.enqueue("B", 3); 

            pq.enqueue("C", 2); 

            pq.enqueue("D", 3); 

            pq.enqueue("E", 5); 

  

            // mostrar cola 

            System.out.println("Cola de prioridad: " + pq); 

  

            // probar front 

            System.out.println("Frente (mayor prioridad): " + pq.front()); 

  

            // probar back 

            System.out.println("Final (menor prioridad): " + pq.back()); 

  

            // probar dequeue 

            System.out.println("Dequeue: " + pq.dequeue()); 

            System.out.println("Cola después de dequeue: " + pq); 

  

        } catch (ExceptionIsEmpty e) { 

            System.out.println(e.getMessage()); 

        } 

    } 

} 