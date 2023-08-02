import java.util.*;
public class Stacks {
/*public static void pushAtBottem(Stack<Integer> s, int data) {
    if(s.isEmpty()) {
        s.push(data);
        return ;
    }
    int top = s.pop();
    pushAtBottem(s,data);
    s.push(top);
}
public static String reverseString(String str) {
    Stack<Character>s = new Stack <> ();
    int idx =0;
    while(idx<str.length()) {
        s.push(str.charAt(idx));
        idx++;
    }
    StringBuilder result = new StringBuilder("");
    while(!s.isEmpty()) {
        char curr = s.pop();
        result.append(curr);
    }
    return result.toString();
}
public static void reverseStack(Stack<Integer>s) {
    if(s.isEmpty()) {
        return;
    }
    int top = s.pop();
    reverseStack(s);
    pushAtBottem(s,top);
}
public static void printStack(Stack<Integer>s) {
    while(!s.isEmpty()) {
        System.out.println(s.pop());
    }
}
public static void stockSpan(int stock[], int span[]) {
    Stack<Integer>s = new Stack <> ();
    span[0] = 1;
    s.push(0);
    for(int i=1; i<stock.length; i++) {
        int currPrice = stock[i];
        while(!s.isEmpty() && currPrice > stock[s.peek()]);
        s.pop();
        if(s.isEmpty()) {
            span[i] = i+1;
        } else {
            int prevHigh = s.peek();
            span[i] = i-prevHigh;
        }
        s.push(i);
    }
}
public static boolean isValid(String str) {
    Stack<Character>s= new Stack <>();
    for(int i=0; i<str.length(); i++) {
        char ch = str.charAt(i);
        if(ch == "(" || ch = "[" || ch = "{") {
            s.push(i);
        } else {
            if(s.isEmpty()) {
                return false;
            }
        } 
        if((s.peek() == "(" && ch == ")") ||
            (s.peek() == "[" && ch == "]")||
            (s.peek() == "{" && ch == "}")) {
                s.pop();
            } 
        else {
            return false;
        }
    }
}
for(int i=0; i<str.length(); i++) {
    char ch = s.charAt(i);
    if(ch == ")") {
        int count = 0;
        while(s.peek() != "(") {
            s.pop();
            count++;
        }
        if(count <1) {
            return true;
        } else {
            s.pop();
        } else {
            s.push(ch);
        }
    }
}*/
public static boolean isPalindrome(String str[]) {
    Stack<Character>s = new Stack <> ();
    int mid = str.length()/2;
    for(int i=0; i<=mid; i++){
        char ch = str.charAt(i);
        s.push(ch);
    }
    for(int j=mid; j<str.length(); j++){
        
        char ch = str.charAt(j);
        if(!s.isEmpty() && s.peek() == str.charAt(j) ) {
            return true;
        } 
    }
    return false;
    }

public static void main(String args[]) {
    Stack<Character>s = new Stack <> ();
    String str = "naman";
    isPalindrome(str);
   /* Stack<Integer>s= new Stack <> ();
    s.push(1);
    s.push(2);iop78
    s.push(3);
   // printStack(s);
    reverseStack(s);
    printStack(s);
    // pushAtBottem(s,4);
    // while(!s.isEmpty()) {
    //     System.out.println(s.pop());
    // }
   // String str = "abc";
   // String result = reverseString(str);
   // System.out.print(result);*/
  /* int stock[] = {100,80,60,70,60,85,100};
   int span[] = new int[stock.length];
   stockSpan(stock,span);
   for(int i=0; i<span.length; i++) {
    System.out.println(span[i] + " ");
   }*/
   /*int arr[] = {6,8,0,1,3};
   Stack<Integer>s = new Stack<>();
   int nxtGreater[]= new int [arr.length];
   for(int i=arr.length-1; i>=0; i--) {
    while(!s.isEmpty() && arr[s.peek()] <= arr[i]) {
        s.pop();
    }
    if(s.isEmpty()) {
        nxtGreater[i] = -1;
        
    } else {
        nxtGreater[i] = arr[s.peek()];
    }
    s.push(i);
   }
   for(int i=0; i<nxtGreater.length; i++) {
    System.out.print(nxtGreater[i] + " ");
   }
   System.out.println();
   */

}
}