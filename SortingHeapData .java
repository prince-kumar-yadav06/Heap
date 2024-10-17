import java.util.*;

public class SortingHeapData {
    static class student implements Comparable<student>{

        String name;
        int rank;

        public student(String name,int rank){
            this.name=name;
            this.rank=rank;
        }
        @Override
        public int compareTo(student S2){

            return this.rank-S2.rank;
        }
    }
    public static void main(String args[]){

        PriorityQueue<student> pq=new PriorityQueue();

        pq.add(new student("A", 1));
        pq.add(new student("B", 6));
        pq.add(new student("C", 5));
        pq.add(new student("D",3));

        while(!pq.isEmpty()){
            student data=pq.poll();
            System.out.println(data.name +","+ data.rank);
        }
    }
}
