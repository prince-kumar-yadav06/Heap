import java.util.PriorityQueue;
import java.util.*;

public class CarNearByOrigin {


      static class Point implements  Comparable<Point>{
        int x;
        int y;
        int dist;
        int idx;

    public    Point(int x,int y,int d,int i){
            this.x=x;
            this.y=y;
            this.dist=d;
            this.idx=i;

        }
        @Override
        public int compareTo(Point p2){    //comapre the distance
            return this.dist-p2.dist;
        }
    }

    public static void main(String args[]){

        int k=2;

        int pnts[][]={{3,3},{5,1},{-2,4}};

        PriorityQueue<Point> pq=new PriorityQueue<>();

        for(int i=0;i<pnts.length;i++){
            int distsqr=pnts[i][0]*pnts[i][0] + pnts[i][1] * pnts[i][1];

            pq.add(new Point(pnts[i][0],pnts[i][1],distsqr,i));
        }

        for(int j=0;j<k;j++){
            System.out.println("C"+pq.remove().idx);
        }


    }
}
