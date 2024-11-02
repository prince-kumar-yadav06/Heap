import java.util.*;

public class KLargestElement{

//     static void FindKElement(int arr[],int k){

//         TreeMap<Integer,Integer> map=new TreeMap<>(Collections.reverseOrder());

//         for(int i=0;i<arr.length;i++){
//             map.put(arr[i],i);
//         }

//         int count=0;
//         for(Map.Entry m:map.entrySet())  
//         {  
//             count++;
//             System.out.println(m.getKey()+":"+m.getValue());      
//             if(count == k){
//                 break;
//             }
//         }  
//     }


  //optimal solution for every input

  static int FindKElement(int arr[],int k){

    int low=Integer.MAX_VALUE;
    int high=Integer.MIN_VALUE;
    int klargest=-1;

    //step 1 find low and high element from arr
    for(int i:arr){
        low=Math.min(low,i);
        high=Math.max(high,i);
    }

    //step 2  while(low<=high) find count of element greater than mid and kth greater

    while(low<=high){   

        int mid=low+(high-low)/2;
        int count =0;

        // count greater than mid
        for(int i:arr){
            if(i >= mid){
                count++;
            }
        }

        //k largest than mid
        if(count>=k){
            klargest=mid;
            low=mid+1;  //count >=k hia to right side of arr search krenge
        }
        else{
            high=mid-1;  // nhi to left side of array
        }
    }

    return klargest;
  }

  static List<Integer> solution(int arr[],int k){
    int Largest=FindKElement(arr,k);
          
    ArrayList<Integer> list=new ArrayList();
     for (int i : arr) {
      if (i >= Largest) {
        list.add(i);
      }
  }
Collections.sort(list, Collections.reverseOrder());
  
  return list;
  }
    public static void  main(String args[]){

        int arr[]= { 1 ,23 ,12, 9 ,30, 2, 50 };
        int k=3;


        System.out.println(solution(arr, k));

       
  }
    }
