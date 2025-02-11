import java.util.*;

public class smallestpositiveNumber{
     static int arr[]={1,2,-3,-5,4,5};
    //  static int arr[]={5,3,2,1,5};

    static void sort(int[] arr){

         Arrays.sort(arr);
    }
    static int findmis(int arr[],int n){

        for(int i=1;i<n;i++){
            int flag=0;

            for(int j=0;j<n;j++){
                if(arr[j]==i){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                return i;
            }
        }
        return  -1;
    }
    public static void main(String args[]){
        int n=5;
//sort the array
        sort(arr);
//find ans
        int ans=findmis(arr, n);
//print ans
        System.out.println(ans);
    }
}
