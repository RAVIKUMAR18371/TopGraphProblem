package HAshMap;
import java.util.HashMap;
import java.util.Map;

public class Hashmap {
    public static void main(String[] args) {

        HashMap<String,Integer> hm = new HashMap<>();
        // order may be different or same in hashMap
        hm.put("Ravi",90);
        hm.put("Rohit",95);
        hm.put("Rahul",78);
        hm.put("Virat",23);
        hm.put("Sony",34);
        hm.put("vicky",93);
        hm.put("Ronit",54);

        hm.put("Kohli",99);


//        System.out.print(hm);
//        System.out.println();
//        System.out.println(hm.containsValue(94));
//        System.out.println(hm.containsKey("Rohit"));
//        System.out.println(hm.get("Ronit"));

        // here the String are the keys so if they cannot be same
        // but the value can be Same if the String are same then the value get updated
        // n---> no. of nodes of linkedList
        // N--> no. of buckets or index of array
        //(n/N) = Lambda
        // Lambda <= k.
        for(Map.Entry<String,Integer> e : hm.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
            System.out.println(e.getClass());
        }

    }
}