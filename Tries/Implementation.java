import java.util.*;

public class Implementation{
    static class Node{
        Node children[] = new Node[26];
        boolean eow = false;

        Node() {
            for(int i=0; i<26; i++) {
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();

    public static void insert(String word) { //O(L) --> L is the length of largest word
        Node curr = root;
        for(int level=0; level<word.length(); level++) {
        int idx = word.charAt(level) - 'a';
        if(curr.children[idx] == null) {
            curr.children[idx] = new Node();
        }
        // for the next level the child node becomes the current node
        curr = curr.children[idx];
    }
    curr.eow = true;
    }

    public static boolean search(String key) { //O(L) --> L is the length of largest word
        Node curr = root;
        for(int level=0; level<key.length(); level++) {
        int idx = key.charAt(level) - 'a';
        if(curr.children[idx] == null) {
            return false;
        }

        curr = curr.children[idx];
    }

    return curr.eow == true;
    }

    public static boolean WordBreak(String key) {

        if(key.length() == 0) {
           return true;
        }
        for(int i=1; i<=key.length(); i++) {
            //substring(beg idx, last idx)

            if(search(key.substring(0,i)) &&
            WordBreak(key.substring(i))) {
                return true;
            } 
        }
        return false;
    }

    public static boolean startWith(String prefix) { //O(L) --> L is the length of largest word
        Node curr = root;
        for(int i=0; i<prefix.length(); i++) {
        int idx = prefix.charAt(i) - 'a';
        if(curr.children[idx] == null) {
            return false;
        }

        curr = curr.children[idx];
    }

    return true;
    }

    public static int countNodes(Node root) {
        if(root == null) {
            return 0;
        }

        int count = 0;
        for(int i=0; i<26; i++) {
            if(root.children[i] != null) {
                count += countNodes(root.children[i]);
            }
        }
        return count+1;
    }
    
    public static String ans = "";
    public static void longestWord(Node root, StringBuilder temp) {
        if(root == null) {
            return;
        }
         
        //as alphate comming earlier will get added in the ans string first and so the length of ans string will become equal or greater than the length temporary string so automatically alphabetical order will get followed
        for(int i=0; i<26; i++) { //a,b,c,d _ _ _ _ z.
            if(root.children[i] != null && root.children[i].eow == true) {
                char ch = (char)(i+ 'a');
                temp.append(ch);
                if(temp.length() > ans.length()) {
                    ans = temp.toString();
                }
                longestWord(root.children[i], temp);
                temp.deleteCharAt(temp.length()-1); //backtrack
            }
        }
    }

    public static void main(String args[]) {
        String words[] = {"a", "banana", "app", "appl", "ap", "apply", "apple"};

        for(int i=0; i<words.length; i++) {
            insert(words[i]);
        }
        longestWord(root, new StringBuilder(""));
        System.out.println(ans);

        /*
        String str = "ababa"; // ans = 10

        //suffix -> insert in trie
        for(int i=0; i<str.length(); i++) {
            String suffix = str.substring(i);
            insert(suffix);
        }
           
        System.out.println(countNodes(root));
        String words[] = {"apple", "app", "mango", "man", "woman"};
        String prefix1 = "app"; //true
        String prefix2 = "moon"; //false

        for(int i=0; i<words.length; i++) {
            insert(words[i]);
        }

        System.out.println(startWith(prefix1));
        System.out.println(startWith(prefix2));

        String arr[] = {"i", "like", "sam", "samsung", "mobile", "ice"};
        for(int i=0; i<arr.length; i++) {
            insert(arr[i]);
        }

        String key = "ilikesamv";
        System.out.println(WordBreak(key));

        String words[] = {"the", "a", "there", "their", "any", "thee"};
        
        for(int i=0; i<words.length; i++) {
            insert(words[i]);
        }

        System.out.println(search("anybodycandance"));
        System.out.println(search("there"));
        */
    }
}