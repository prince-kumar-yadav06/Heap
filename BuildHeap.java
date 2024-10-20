public class BuildHeap {
    

    //Build heap
    static void heapify(int arr[],int i,int size){

        //for min heap
        int Smallest=i;
        int left=2*i+1;
        int right= 2*i+2;

        //for max heap
        // int largest=i;
        // int left=2*i;
        // int right=2*i+1;

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

           for(int i=n/2;i>=0;i--){   //hepa creation function

               heapify(arr,i,n);
           }

            //sort the arr for min heap
            for(int i=n-1;i>0;i--){
                int temp=arr[0];
                arr[0]=arr[i];
                arr[i]=temp;

                //call heapify
                heapify(arr,0,i);
            }
    
            for(int j=0;j<arr.length;j++){
                System.out.println(arr[j]);
            }
        }
    }

