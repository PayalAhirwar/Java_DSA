public class OOPS {
//     public static void main(String args[]) {
//         Student s1 = new Student();
//         s1.name = "Payal";
//         s1.roll = 18;
//         s1.password = "abcd";

//         s1.marks[0] = 100;
//         s1.marks[1] = 98;
//         s1.marks[2] = 97;
//         Student s2 = new Student(s1);
//         s2.password = "xyz";

//         for(int i=0; i<3; i++) {
//             System.out.println(s2.marks[i]);
//         }
//     }
// }
//     class Student {
//         String name;
//         int roll;
//         String password;
//         int marks[];
//         //copy constructor

//         Student(Student s1) {
//             marks = new int[3];
//             this.name = s1.name;
//             this.roll = s1.roll;
//             this.marks = s1.marks;
//         }
//         Student() {
//             marks = new int[3];
//             System.out.println("Constructor is called..");
//         }
//         Student(String name) {
//             marks= new int[3];
//             this.name = name;
//         }
//         Student(int roll) {
//             marks = new int[3];
//             this.roll = roll;
//         }
//public static void main(String args[]) {

//     Student s1 = new Student("Payal");
//     System.out.print(s1.name);
// }
// class Student {
//     String name; 
//     int roll;
//      Student(String name){
//          this.name = "Payal";
//     }
// // Mustang myhorse = new Mustang();
// // //animal->horse->mustang
// // }
// // }
// // abstract class Animal {
// //     String color;
// //     Animal() {
// //         System.out.println("Animal constructor is called..");
// //     }
// //     void eat() {
// //         System.out.println("Animal eats");
// //     }
// //     //abstract void walk();
// // }

// // class Horse extends Animal {
// //     Horse() {
// //         System.out.println("Horse constructor is called..");
// //     }
// // }
// //     class Mustang extends Horse {
// //         Mustang() {
// //             System.out.println("Mustang constructor is called..");
// //         }
// //     }
public static void main(String args[]) {
    Bear bibs = new Bear();
    bibs.eat();
    bibs.walk();
}
}
    interface Herbivores {
       void eat();
    }
    interface Carnivores {
      void walk();
    }
    class Bear implements Herbivores,Carnivores {
        public void eat() {
            System.out.println("meat and grass");
        }
        public void walk() {
            System.out.println("can walk");
        }
    }


