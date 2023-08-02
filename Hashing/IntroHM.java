import java.util.*;

public class IntroHM{
    
    public static void main(String args[]) {
        //Create - O(1)
        HashMap<String, Integer> hm = new HashMap<>();
    
        hm.put("India", 145);
        hm.put("China",130);
        hm.put("US",50);

        System.out.println(hm);

        //Get - O(1)
        int population = hm.get("India");
        System.out.println(population);

        System.out.println(hm.get("Indonesia")); // Returns null

        System.out.println(hm.containsKey("India")); //true
        System.out.println(hm.containsKey("Indonesia")); //false

        //Remove - O(1)
        System.out.println(hm.remove("Indonesia")); // Returns null as there is no key named "indonesia"
        System.out.println(hm.remove("China")); //Return value of key and removes it from the map

        //Size
        System.out.println(hm.size());

        //Is Empty
        System.out.println(hm.isEmpty());

    }
}