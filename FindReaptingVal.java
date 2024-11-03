public class MaxReaptingElement {
    
    static int FindReaptingVal(int arr[],int N,int K){

        for(int i=0;i<N;i++){

            arr[arr[i]%K] += K;
        }

        int max=0;
        int ans=0;
        for(int i=0;i<N;i++){

            if(max < arr[i]){
                max=arr[i];
                ans=i;
            }
        }
       
        return ans;
    }

    public static void main(String args[]){

        int arr[]={2,3,3,5,3,1,2,2,2,8};

        int N=arr.length;
        int k=8;  //no..of element

        System.out.println("Reapting element is :"+FindReaptingVal(arr, N, k));
    }
}
