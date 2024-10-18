
public class DeletionInHeap {
    
    static void Delete(int arr[],int size){

        //base case

        if(size == 0){
            return;
        }

        // step 1 swap ! 1st element to last element
        arr[0]=arr[size];

        // step 2 remove last element 
        size--;

        // step 3 heapify  check arr is heap or not

        int i=0;
        while(i<size){
            int leftindex=2*i +1;
            int rightindex=2*i+2;

            if(leftindex < size && arr[i] < arr[leftindex]){
                //swa
                int temp1=arr[i];
                arr[i]=arr[leftindex];
                arr[leftindex]=temp1;
                i=leftindex;
            }

            else if(rightindex < size && arr[i] < arr[rightindex]){
                System.out.println(rightindex);
                //swap
                int temp2=arr[i];
                arr[i]=arr[rightindex];
                arr[rightindex]=temp2;
                i=rightindex;
            }


            // agar upar ak koi condition nhi exist krta hai to simply return kr jayenge
            else{
                return;
            }
        }
    }

    public static void main(String args[]){

        int arr[]={55,54,53,50,52};

        int size=arr.length-1;

        Delete(arr,size);
        for(int i=0;i<size;i++){
            System.out.println(arr[i]);
        }
    }
}
