import java.util.*;

public class IntroTM {

    public static void main(String args[]) {
        TreeMap<String, Integer> tm = new TreeMap<>();
        tm.put("China",140);
        tm.put("India",150);
        tm.put("US",50);

        System.out.println(tm); // sorts key in alphabetical order
    }
}