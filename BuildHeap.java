public class BuildHeap {
    

    //Build heap
    static void heapify(int arr[],int i,int size){

        int Smallest=i;
        int left=2*i+1;
        int right= 2*i+2;

        if(left < size && arr[left] > arr[Smallest]){
         Smallest=left;
        }

        if(right< size && arr[right] > arr[Smallest]){
         Smallest=right;
        }

        if(Smallest != i){
            int temp=arr[i];
            arr[i]=arr[Smallest];
            arr[Smallest]=temp;

            heapify(arr, Smallest, size);
        }
    }
        public static void main(String args[]){


            int arr[]={1,2,4,5,3}; 
    
           int n=arr.length;

           for(int i=n/2;i>=0;i--){

               heapify(arr,i,n);
           }
    
            for(int j=0;j<arr.length;j++){
                System.out.println(arr[j]);
            }
        }
    }

