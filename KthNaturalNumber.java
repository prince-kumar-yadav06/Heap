import java.util.*;

public class KthNaturalNumber {
    
    // static int max=500;
    // static int FindKthNatural(int arr[],int N,int k){

    //     //step 1 : 
    //     int b[]=new int[max];

    //     //step 2: initialize b array with 1 at index given arr[i]
    //     for(int i=0;i<N;i++){
    //         b[arr[i]]=1;
    //     }

    //     for(int j=1;j<max;j++){

    //         if(b[j]!=1){
    //             k--;
    //         }

    //         if(k == 0){
    //             return j;
    //         }

    //     }
    //     return -1;
    // }


    // efficient solution
    static int FindKthNatural(int arr[],int N,int K){

        //step 1: sort the array
        Arrays.sort(arr);

        // step 2:
        if(K<=arr[0]){
            return K;
        }
        if(K >= arr[N-1]){
            return N+K;
        }


        //step 3 reducing K
         K =K-(arr[0]-1);

        //  step 4
        for(int i=1;i<N;i++){

            //count element b/w ith ant i -1 th element
            int c=arr[i] - arr[i-1]-1;

            if(K <= c){
                return arr[i-1] + K;
            }
            else{
                K=K-c;
            }
        }
        return arr[N-1]+K;

    }
    public static void main(String args[]){

        int arr[]={1,3};
        int N=arr.length;
        int k=2;

        System.out.println("Kth smallest Natural Number :"+FindKthNatural(arr, N, k));
    }
}
