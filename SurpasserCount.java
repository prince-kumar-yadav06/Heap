public class SurpasserCount {
    public static int conquer(int arr[],int si,int mid,int ei){

        int cnt=0;
        
        int []merge=new int[ei-si+1];

        int left=si;
        int right=mid+1;
        int k=0;
        while(left<=mid && right<=ei){
            if(arr[left]<=arr[right]){
                merge[k]=arr[left];
                left++;
                k++;
            }
            else{
                merge[k]=arr[right];
                cnt += (mid - left + 1);
                right++;
                k++;
            }
        }
        while(left<=mid){
            merge[k]=arr[left];
            left++;
            k++;
        }
        while(right<=ei){
            merge[k]=arr[right];
            right++;
            k++;
        }
        for(int i=0,j=si;i<merge.length;i++,j++){
            arr[j]=merge[i];
        }
        return cnt;
    }
    public static int merge(int arr[],int si,int ei){

        int cnt=0;
        if(si>=ei){
            return cnt;
        }
        int mid=(si+(ei-si)/2);
       
       cnt+= merge(arr, si, mid);
        cnt+=merge(arr,mid+1,ei);
        cnt+=conquer(arr,si,mid,ei);

        return cnt;
    }
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        System.out.println(merge(arr,0,arr.length-1));
        
        }
    }
