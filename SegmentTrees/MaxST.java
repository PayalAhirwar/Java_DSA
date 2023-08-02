import java.util.*;

public class MaxST{
    static int tree[];

    public static void init(int n) {
        tree = new int[4*n];
    }

    public static int buildST(int arr[], int i, int start, int end) { //O(n)
        if(start == end) {
            tree[i] = arr[start];
            return arr[start];
        }

        int mid = (start + end)/2;
        buildST(arr, 2*i+1, start, mid); //left subtree - 2*i+1
        buildST(arr, 2*i+2, mid+1, end);  //right subtree - 2*i+2
        tree[i] = Math.max(tree[2*i+1] , tree[2*i+2]);
        return tree[i];
    }

    public static int getMaxUtil(int i,int si, int sj, int qi, int qj) { //O(log n)
        if(qj< si || qi > sj) { //non overlapping
            return Integer.MIN_VALUE;
        } else if(si >= qi && sj <= qj) { //complete overrlap
            return tree[i];
        } else { //partial overlap
            int mid = (si + sj)/2;
            int left = getMaxUtil(2*i+1, si, mid, qi, qj);
            int right = getMaxUtil(2*i+2, mid+1, sj, qi, qj);
            return Math.max(left, right);
        }
    }

    public static int getMax(int arr[], int qi, int qj) {
        int n = arr.length;
        return getMaxUtil(0, 0, n-1, qi, qj);
    }
    
    public static void updateUtil(int i, int si, int sj, int idx, int newVal) { //O(log n)
        if(idx > sj || idx < si) {
            return;
        }
        if(si == sj) {
            tree[i] = newVal;
        }

        tree[i] = Math.max(tree[i], newVal);
        if(si != sj) { //non leaf
            int mid = (si + sj)/2;
            updateUtil(2*i+1, si, mid, idx, newVal); //left
            updateUtil(2*i+2, mid+1, sj, idx, newVal); //right        
    }
    }

    public static void update(int arr[], int idx, int newVal) {
        int n = arr.length;
        arr[idx] = newVal;

        updateUtil(0, 0, n-1, idx, newVal); //segment tree updation
    }

    public static void main(String args[]) {
        int arr[] = {6, 8, -1, 2, 17, 1, 3, 2, 4};
        int n = arr.length;
        init(n);
        buildST(arr,0,0,n-1);
       
        // for(inr i=0; i<tree.length; i++) {
        //     System.out.print(tree[i] + " ");
        // }

        int max = getMax(arr,2,5);
        System.out.println(max); //17
        update(arr,2,20);
        max = getMax(arr,2,5);
        System.out.println(max);//20
    }
}