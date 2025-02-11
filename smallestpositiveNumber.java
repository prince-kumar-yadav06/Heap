import java.util.*;

// Method 1 T.c=O(nlogn)

public class smallestpositiveNumber{

    static int findmis(int arr[]){

      Arrays.sort(arr);

        int res=1;
        for(int i=0;i<arr.length;i++){

          if(arr[i]==res){
            res++;
          }
          else if(arr[i]>res){
            break;
          }
        }
        return  res;
    }
    
    public static void main(String args[]){

     
          int arr[]={1,2,-3,-5,4,5};
            // int arr[]={5,3,2,1,5};

        int ans=findmis(arr);  //T.C=O(n)  and space complexity=O(n)
        System.out.println(ans);
    }
}

// Method 2 T.C=O(n)


import java.util.*;

public class smallestpositiveNumber{

    static int findmis(int arr[]){


      int n=arr.length;

      // step 1 create visited array

      boolean vis[]=new boolean[n];

      for(int i=0;i<n;i++){

        if(arr[i]>0 && arr[i]<=n){
          vis[arr[i]-1]=true;
        }

      }

      for(int j=1;j<arr.length;j++){
        if(!vis[j-1]){
          return j;

        }
      }
      return n+1;
      
    }
    public static void main(String args[]){

     
          // int arr[]={1,2,-3,-5,4,5};
            int arr[]={5,3,2,1,5};

        int ans=findmis(arr);  //T.C=O(n)  and space complexity=O(n)
        System.out.println(ans);
    }
}
