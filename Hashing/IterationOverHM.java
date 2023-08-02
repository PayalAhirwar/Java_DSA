import java.util.*;

public class IterationOverHM {
    public static void main(String args[]) {
        HashMap<String, Integer> hm = new HashMap<>();
           hm.put("India",150);
            hm.put("China", 140);
            hm.put("Nepal",5);
            hm.put("Indonesia", 6);

            //Iterate
            Set<String> keys = hm.keySet();
            System.out.println(keys);

            for(String k: keys) {
                System.out.println("key = " + k +",value = " + hm.get(k));
            }
    }
}