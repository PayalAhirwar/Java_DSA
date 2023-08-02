import java.util.*;

public class HS_LHS_TS {

    public static void main(String args[]) {

        HashSet<String> hs = new HashSet<>();
        hs.add("Rajgarh");
        hs.add("Vidisha");
        hs.add("Bhopal");
        hs.add("Rani_Kamlapati");
        hs.add("Allahabad");

        
        System.out.println(hs); // print 1 2 4 

        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Rajgarh");
        lhs.add("Vidisha");
        lhs.add("Bhopal");
        lhs.add("Rani_Kamlapati");
        lhs.add("Allahabad");

        System.out.println(lhs);

        TreeSet<String> ts = new TreeSet<>();
        ts.add("Rajgarh");
        ts.add("Vidisha");
        ts.add("Bhopal");
        ts.add("Rani_Kamlapati");
        ts.add("Allahabad");

        System.out.println(ts);

       /* HashSet<Integer> set = new HashSet <> ();
        
        set.add(1);
        set.add(2);
        set.add(4);
        set.add(2);
        set.add(1);
        System.out.println(set.size());
        set.clear(); // clear the all elements of set

        set.remove(2); // removes 2 from set
        if(set.contains(2)) {
            System.out.println("Set contains 2");
        }*/
    }
}