import java.util.*;

public class KthNaturalNumberUsingSet {
    
    public static void main(String args[]){

        int arr[]={1,2,3,4};
        int k=2;
        int N=arr.length;

        Set<Integer> st=new HashSet();

        for(int num : arr){
            st.add(num);
        }

        int num=1;  //starting natural number is 1

        while(k>0){

            if(st.contains(num)){
                num++;
            }

            else{
                num++;
                k -=1;
            }
        }
        System.out.print(num-1);
    }
}
