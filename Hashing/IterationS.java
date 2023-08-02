import java.util.*;

public class IterationS {

    public static void main(String args[]) {
        HashSet<String> cities = new HashSet<>();
        cities.add("Rajgarh");
        cities.add("Vidisha");
        cities.add("Bhopal");
        cities.add("Rani_Kamlapati");
        cities.add("Allahabad");

        System.out.println(cities);

        Iterator it = cities.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

        for(String city : cities) {
            System.out.println(city);
        }
    }
}