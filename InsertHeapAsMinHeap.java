import java.util.*;

public class InsertHeapAsMinHeap {
    

    static ArrayList<Integer> hp=new ArrayList<>();
    static void Insert(int data){

        
    //  add at last
    hp.add(data);

    int size=hp.size()-1; // find arraylsit size
    int parent =(size-1)/2;  // find parent size

    while(hp.get(size) < hp.get(parent) && size != parent){

        // swap
        int temp=hp.get(size);
        hp.set(size,hp.get(parent));
        hp.set(parent,temp);
        size=parent;
        parent=(size-1)/2;
    }
    }


    public static void main(String args[]){

        Insert(10);
        Insert(7);
        Insert(11);
        Insert(5);
        Insert(4);

        for(int i=0;i<hp.size();i++){
            System.out.println(hp.get(i));
        }
    }
}
