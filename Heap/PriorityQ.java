import java.util.PriorityQueue;
public class PriorityQ{

    static class Student implements Comparable<Student>{
        String name;
        int rank;
        
        //Here Student class implements the interface comparable which compare its objects here student

        public Student(String name, int rank) {
        this.name = name;
        this.rank = rank;
        }

        @Override
        public int compareTo(Student s2) {
            return this.rank - s2.rank;
        }
    }


    
    public static void main(String args[]) {
       // PriorityQueue<Integer> pq = new PriorityQueue<>();
        // To print reverse order---->
       // PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
       PriorityQueue<Student> pq = new PriorityQueue<>();

        pq.add(new Student("A",4 )); // O(log n)
        pq.add(new Student("B",5));
        pq.add(new Student("C",2));
        pq.add(new Student("D",12));

        while(!pq.isEmpty()) {
            System.out.println(pq.peek().name + "->" + pq.peek().rank); // O(1)
            pq.remove(); // O(log n)
        }
    }
}