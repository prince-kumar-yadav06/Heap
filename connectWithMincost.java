import java.util.*;
public class ConnentNrope {

    
    static int connectWithMincost(int RopeLen[]){

        PriorityQueue<Integer> PQ=new PriorityQueue();

        // add all length from arr to PQ in sorted form
        for(int i=0;i<RopeLen.length;i++){
            PQ.add(RopeLen[i]);
        }

        int cost=0;

        while(PQ.size()>1){
            int min1st=PQ.poll();
            int min2nd=PQ.poll();

            int sum=min1st + min2nd;
            cost=cost+min1st + min2nd;
            PQ.add(sum);
        }

        return cost;
    }

    public static void main(String args[]){

        // int LengthOfRope[]={4,3,2,6};
        int LengthOfRope[]={1,2,3};

        System.out.println(connectWithMincost(LengthOfRope));
    }
}
