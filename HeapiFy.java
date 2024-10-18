public class HeapiFy {
    

    //sorting heap in Descending order (Min heap)
    static void heapify(int arr[],int i,int size){

        int Large=i;
        int left=2*i+1;
        int right= 2*i+2;

        if(left < size && arr[left] < arr[Large]){
         Large=left;
        }

        if(right< size && arr[right] < arr[Large]){
         Large=right;
        }

        if(Large != i){
            int temp=arr[i];
            arr[i]=arr[Large];
            arr[Large]=temp;

            heapify(arr, Large, size);
        }
    }
    static void HeapSort(int arr[]){

        int n=arr.length;

        for(int i=n/2;i>=0;i--){
            heapify(arr, i, n);
        }

         for(int i=n-1;i>0;i--){
             int temp=arr[0];
             arr[0]=arr[i];
             arr[i]=temp;
             heapify(arr, 0, i);
         }
    }

    public static void main(String args[]){


        int arr[]={1,2,4,5,3}; 

       
        HeapSort(arr);

        for(int j=0;j<arr.length;j++){
            System.out.println(arr[j]);
        }
    }
}
