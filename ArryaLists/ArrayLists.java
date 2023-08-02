import java.util.ArrayList;
import java.util.*;
public class ArrayLists {
   // public static void main(String args[]){
    //ArrayList <Integer> List = new ArrayList<>() ;
    //ArrayList <String> List2 = new ArrayList<>();
   // ArrayList <Boolean> List3 = new ArrayList<>();
    //add element

    //get element
    //int element = List.get(2);
   // System.out.println(element);
    //delete element
    //List.remove(2);
   // System.out.println(List);
    //set
    //List.set(2,10);
   // System.out.println(List);
    //contains
   // System.out.println(List.contains(1));
     //System.out.println(List.contains(7));
    //System.out.println(List.size());
    //print arrayList
    //for(int i=0; i<List.size(); i++) {
    //    System.out.print(List.get(i) + " ");
    //}
    //System.out.println();
    
    //reverse ArrayList
    //for(int i=List.size()-1; i>=0; i--) {
     //   System.out.print(+List.get(i) + " " );
    //}
    //System.out.println();
   // int max = Integer.MIN_VALUE;
    //for(int i=0; i<List.size(); i++) {
      //  if(max<List.get(i)) {
     //       max = List.get(i);
      //  }
//    // }
//     //System.out.println("Max element is :" + max);
//     int idx1 = 1, idx2 = 3;
 
    // swap(List,idx1,idx2);
    // System.out.println(List);
//     Collections.sort(List); // ascending
//     System.out.println(List);
//     Collections.sort(List,Collections.reverseOrder());//descending
//     System.out.println(List);
// public static void swap(ArrayList<Integer>List, int idx1, int idx2) {
//     int temp = List.get(idx1);
//     List.set(idx1, List.get(idx2));
//     List.set(idx2, temp);
// }
public static void main(String args[]) {
    ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
    ArrayList<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    mainlist.add(list);

    ArrayList<Integer> list2 = new ArrayList<>();
    list2.add(3);
    list2.add(4);
    mainlist.add(list2);
    for(int i=0; i<mainlist.size(); i++) {
        ArrayList<Integer> currlist = mainlist.get(i);
        for(int j=0; j<mainlist.size(); j++) {
            System.out.print(currlist.get(j) + " ");
        }
        System.out.println();
    }
    System.out.println(mainlist);
}
    }
