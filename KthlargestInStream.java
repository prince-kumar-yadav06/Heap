import java.util.*;

public class KthlargestInStream {
    
    static List<Integer> findKthLargest(int arr[],int k,int N){

        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->a-b);

        List<Integer> list=new ArrayList();

        for(int i=0;i<N;i++){

            if(pq.size() <k){
                pq.add(arr[i]);
            }

            else{
                if(arr[i] > pq.peek()){
                    pq.remove();
                    pq.add(arr[i]);
                }
        }
        if(pq.size() < k){
            list.add(-1);
        }
        else{
            list.add(pq.peek());
        }

            

    }
    return list;
}

public static void main(String args[]){

    int arr[]={1,2,3,4,5,6};
    int k=4;
    int N=arr.length;

    List<Integer> res=findKthLargest(arr, k, N);

    for(int n: res){
        System.out.println(n);
    }
}
}
