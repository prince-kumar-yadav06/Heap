import java.util.*;
import java.util.Map;

public class KFrequentElement {
    
    static void FindKFreuentElemenr(int arr[],int k){

        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();

        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        List<Map.Entry<Integer, Integer> > list
        = new ArrayList<Map.Entry<Integer, Integer> >(
            map.entrySet());

    // Sort the list
    Collections.sort(
        list,
        new Comparator<Map.Entry<Integer, Integer> >() {
            public int compare(
                Map.Entry<Integer, Integer> o1,
                Map.Entry<Integer, Integer> o2)
            {
                if (o1.getValue() == o2.getValue())
                    return o2.getKey() - o1.getKey();
                else
                    return o2.getValue()
                        - o1.getValue();
            }
        });
      

        for(int i=0;i<k;i++){
            System.out.println(list.get(i).getKey());
        }
    }
    public static void main(String args[]){

        int arr[]={1,1,1,2,2,3};
        int k=2;

        FindKFreuentElemenr(arr, k);
    }
}
