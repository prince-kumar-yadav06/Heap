import java.util.*;

public class IteneraryInTicket {
    
    static void FindItenerary(Map<String,String> dataset){

        //step all data from dataset in to reversemap
        //mean key of dataset is value of reversmap

        Map<String,String> reversemap=new HashMap<>();

        for(Map.Entry<String,String> entry : dataset.entrySet()){
            reversemap.put(entry.getValue(),entry.getKey());
        }

        // intially start is null
        String start=null;
        for(Map.Entry<String,String> entry: dataset.entrySet()){

            // dataset ka key agar reverser me nhi hai to wo start point ho jayega
            if(!reversemap.containsKey(entry.getKey())){
                start=entry.getKey();
                break;
            }
        }

        // to store end point
        String to=dataset.get(start);

        while(to != null){

            System.out.println(start +"->"+ to);
            start=to;  //start ko end bana dende
            to=dataset.get(to); // to me next end store kr lenge
        }
    }

    public static void main(String args[]){

        Map<String,String> dataset=new HashMap<>();

        dataset.put("chennai","balglore");
        dataset.put("bombay","delhi");
        dataset.put("goa","chennai");
        dataset.put("delhi","goa");

        FindItenerary(dataset);
    }
}
