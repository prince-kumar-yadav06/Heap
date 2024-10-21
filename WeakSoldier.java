import java.util.*;

public class WeakestSoldier {
    
    // create node that also comapare two value
    static class Row implements Comparable<Row>{

        int soldiers;
        int idx;

       public Row(int scount,int idx){
            this.soldiers=scount;
            this.idx=idx;
        }
        @Override
        public int compareTo(Row r2){
            if(this.soldiers == r2.soldiers){
                return this.idx-r2.idx;
            }
            else{
                return this.soldiers - r2.soldiers;
            }
        }
    }
    public static void main(String args[]){

        int army[][]={{1,0,0,0},
                     {1,1,1,1},
                     {1,0,0,0},
                    {1,0,0,0}};

                    int k=2;
                    PriorityQueue<Row> PQ=new PriorityQueue<>();

                    // count soldier
                    
                    //row
                    for(int i=0;i<army.length;i++){
                        int count=0;

                        //column
                        for(int j=0;j<army[0].length;j++){
                            
                            if(army[i][j] == 1){
                                count++;
                            }
                        }
                        PQ.add(new Row(count,i));
                    }

                    //print upto k
                    for(int i=0;i<k;i++){
                        System.out.println("ROW:"+PQ.remove().idx);
                    }
    }
}
