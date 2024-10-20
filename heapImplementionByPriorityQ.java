import java.util.*;

public class heapImplementionByPriorityQ {
    
    public static void main(String args[]){

        //min Heap
        PriorityQueue<Integer> Minheap= new PriorityQueue<>();

        Minheap.add(4);
        Minheap.add(2);
        Minheap.add(7);
        Minheap.add(5);

        //Max Heap
        PriorityQueue<Integer> Maxheap=new PriorityQueue<>(Collections.reverseOrder());

        Maxheap.add(2);
        Maxheap.add(6);
        Maxheap.add(3);
        Maxheap.add(5);


        System.out.println("Min Heap Value");
        System.out.println(Minheap.poll()); // o/p 2
        System.out.println(Minheap.poll());  // o/p 4


        System.out.println("Max Heap value");
        System.out.println(Maxheap.poll());  //o/p 6
        System.out.println(Maxheap.poll());  //o/p 5
    }
}
