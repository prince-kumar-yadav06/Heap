import java.util.*;

public class NextLargest {
    
    static void find(Integer arr[]){

       

        int n=arr.length;
        Stack<Integer> st=new Stack<>();

        Map<Integer,Integer> map=new HashMap<Integer,Integer>();

        st.add(arr[0]);
            
        for(int i=1;i<n;i++){

            int next=-1;
        
            if(arr[i] > st.peek()){
                int top=st.pop();
                next=arr[i];
                st.add(next);
                map.put(top,next);
            }
            else{
                map.put(arr[i-1],next);
                st.add(arr[i]);
            }
        
        }
   
            map.put(arr[n-1],-1);
      

        for(Map.Entry m : map.entrySet()){
            System.out.println(m.getKey() +":"+ m.getValue());
        }
    
    }

    public static void main(String args[]){

        Integer arr[]= { 5,4,3,2,1 };
        
        find(arr);
    }
}
