public class KclosetElement {
    
    static int closetIdx=0;
    static void FindKClosetElement(int arr[],int k,int X){   //T.C= O(N)

        //step 1
        for(int i=1;i<arr.length;i++){

            if(arr[i-1] < X && arr[i+1] > X){
                 closetIdx=i-1;
                 break;
            }
        }

        int end=k+closetIdx;  //K last index

        for(int j=closetIdx;j<=end;j++){

            if(arr[j] == X){
                continue;
            }
            System.out.println(arr[j]);
        }
    }


    static int BinarySrch(int arr[],int X){

        int start=0;
        int end=arr.length-1;

        while(start <= end){

            int mid=(start + end)/2;

            if(arr[mid] == X){
                return mid-1;
            }

            else if(arr[mid] > X){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
        
      
    }
    // optimal using Binary search
    static void FindCloset(int arr[],int K,int X){  //T.C= O(logN.K)

        int startIdx=0;

        if(arr[0] == X){

            startIdx=0;
        }

        else{

            // find Closet start index  BY bianry search
            startIdx=BinarySrch(arr,X);
        }
        int endIdx=K+startIdx;

        for(int j=startIdx;j<=endIdx;j++){
            if(j< arr.length){
            if(arr[j] == X){
                continue;
            }
            System.out.println(arr[j]);
        }
    }

    }
    public static void main(String args[]){

        int arr[]={2,4,6,7,34,64,65,87,234};
        int k=4;
        int x=234;

        // FindKClosetElement(arr,k,x);  //T.C=O(N)

        FindCloset(arr,k,x);  //T.C= O(logN.K)

    }
}
