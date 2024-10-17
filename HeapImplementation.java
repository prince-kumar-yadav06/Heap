import java.util.*;

public class HeapImplementation{

    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue();

        pq.add(3);
        pq.add(4);
        pq.add(1);
        pq.add(7);

        while(!pq.isEmpty()){
            System.out.println(pq.poll());
        }
    }
}
