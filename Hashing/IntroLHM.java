import java.util.*;

public class IntroLHM {

    public static void main(String args[]) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("China",140);
        lhm.put("India",150);
        lhm.put("US",50);

        System.out.println(lhm);
    }
}