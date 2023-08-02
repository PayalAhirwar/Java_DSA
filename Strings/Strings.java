import java.util.*;

public class Strings {
    

public static float getShortestPath(String path) {
    int x=0, y=0;

    for(int i=0; i<path.length(); i++) {
        char dir = path.charAt(i);
        //south
        if(dir == 'S') {
            y--;
        }
        else if(dir == 'N') {
            y++;
        }
        else if(dir == 'W') {
            x--;
        }
        else if(dir == 'E') {
            x++;
        }
}
int X2 = x*x;
int Y2 = y*y;
return (float)Math.sqrt(X2 + Y2);
}

public static String subString(String str, int si, int ei) {
    String substr = "";
    for(int i=si; i<ei; i++) {
        substr += str.charAt(i);
    }
    return substr;
}
public static String toUpperCase(String str) {
    StringBuilder sb = new StringBuilder("");
    
    char ch = Character.toUpperCase(str.charAt(0));
    sb.append(ch);

    for(int i=1; i<str.length(); i++) {
        if(str.charAt(i) == ' ' && i<str.length()-1 ) {
            sb.append(str.charAt(i));
            i++;
            sb.append(Character.toUpperCase(str.charAt(i)));
        } else {
            sb.append(str.charAt(i));
        }
    }
    return sb.toString();
}
public static String compress(String str) {
    String newStr = "";
    //abc
    for(int i=0; i<str.length(); i++) {
        Integer count = 1;
        while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
            count++;
            i++;
        }
        newStr += str.charAt(i);
        if(count > 1) {
            newStr += count.toString();
        }
    }
    return newStr;
}
public static void main(String args[]) {
    String str = "aabbbbccccc";
    System.out.println(compress(str));
}
}
