import java.util.*;
public class LinkedList {
    public static class Node {
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public  void addPirst(int data) {
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = tail;
        tail = newNode;
    }
    public void add(int idx, int data) {
        if(idx == 0) {
            addPirst(data);
            return ;
        }
        Node newNode = new Node(data);
        Node temp = head;
        int i=0;
        while(i<idx-1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        }
    public void print() {
        if(head == null) {
            System.out.println("this linkedlist is empty");
            return;
        }
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + "--> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static int removefirst() {
        if(size == 0) {
            System.out.print("ll is empty");
            return Integer.MIN_VALUE;
        } else if(size == 1) {
            int val = head.data;
            head = tail = null;
            return val;
        }
        int val = head.data;
        head = head.next;
        return val;
    }
    public static Node findMid(Node head) {
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static boolean checkPalindrome() {
        if(head == null || head.next == null) {
            return true;
        }
        Node midNode = findMid(head);
        Node prev = null;
        Node curr = midNode;
        Node next;
        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;
        while(right != null) {
            if(left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }
    public static boolean isCycle() {
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                return true;
            }
        }
        return false;
    }
    private Node getMid(Node head) {
        Node slow = head;
        Node fast = head;
          while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    private Node merge(Node head1,Node head2) {
        Node mergell = new Node(-1);
        Node temp = mergell;
        while(head1 != null && head2 != null) {
            if(head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while(head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while(head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergell.next;
    }
    public Node mergeSort(Node head) {
        if(head == null || head.next == null) {
            return head;
        }
        Node mid = getMid(head);
        Node righthead = mid.next;
        mid.next = null;
        Node newleft = mergeSort(head);
        Node newright = mergeSort(righthead);
        return merge(newleft,newright);
    }
    public void zigzag() {
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;
        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node left = head;
        Node right = prev;
        Node nextL, nextR;
         while(left != null && right != null) {
            //For zigzag connection of nodes
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            //To update the nodes
            left = nextL;
            right = nextR;
         }
    }
    public static void main(String args[]) {
        LinkedList ll = new LinkedList  ();
       ll.addPirst(1);
       ll.addPirst(2);
       ll.addPirst(3);
       ll.addPirst(4);
       ll.addPirst(5);
       ll.print();
       //ll.head = ll.mergeSort(ll.head);
       ll.zigzag();
       ll.print();
   /* public static void main(String args[]) {
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next =  head;
        System.out.print(isCycle()); 
        */
    }
}

