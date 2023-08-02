import java.util.*;
public class BST {
    static class Node {
        int data;
        Node left;
        Node right;
        public Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }
     /*  public static Node insert(Node root, int val) {
            if(root == null) {
                root = new Node(val);
                return root;
            }
            if(root.data>val) {
                root.left = insert(root.left, val);
            }
            if(root.data<val) {
                root.right = insert(root.right, val);
            }
            return root;
        };
        public static void inorder(Node root) {
            if(root == null) {
                return;
            }
            inorder(root.left);
            System.out.print(root.data+ " ");
            inorder(root.right);
        }
        public static boolean Search(Node root, int key) {
            if(root == null) {
                return false;
            }
            if(root.data == key) {
                return true;
            }
            if(root.data>key) {
                return Search(root.left, key);
            } else {
                return Search(root.right, key);
            }
        }
        public static Node delete(Node root, int val) {
            if(root.data<val) {
                root.right = delete(root.right,val);

            } else if(root.data>val) {
                root.left = delete(root.left,val);
            } else {
                if(root.left == null && root.right == null) {
                    return null;
                }
                if(root.left == null) {
                    return root.right;
                } else if(root.right == null) {
                    return root.left;
                }
                Node IS = findInorderSuccessor(root.right);
                root.data = IS.data;
                root.right = delete(root.right, IS.data);
            }
            return root;
        }
        public static Node findInorderSuccessor(Node root) {
            while(root.left != null) {
                root = root.left;
            }
            return root;
        }
        public static void printInRange(Node root,int k1, int k2) {
            if(root == null) {
                return;
            }
            if(root.data>=k1 && root.data<=k2) {
            printInRange(root.left,k1,k2);
            System.out.print(root.data+ " ");
            printInRange(root.right,k1,k2);

        } else if(root.data<k1) {
            printInRange(root.left,k1,k2);

        } else {
            printInRange(root.right,k1,k2);
        }
        
        }
        public static void printPath(ArrayList<Integer>path) {
            for(int i=0; i<path.size(); i++) {
                System.out.print(path.get(i)+ " ");
            }
            System.out.println();
        }
        public static void printRoot2Leaf(Node root,ArrayList<Integer>path) {
            if(root == null) {
                return;
            }
            path.add(root.data);
            if(root.left == null || root.right == null) {
                printPath(path);
            }
            printRoot2Leaf(root.left,path);
            printRoot2Leaf(root.right,path);
            path.remove(path.size()-1);
        }
        public static boolean isValidBST(Node root,Node min,Node max) {
            if(root == null) {
                return true;
            }
            if(min!=null && root.data<=min.data) {
                return false;
            }
            else if(max!=null && root.data>=max.data) {
                return false;
            }
            return isValidBST(root.left,min,root) && isValidBST(root.right,root,max);
        }
        public static Node createMirror(Node root) {
            if(root == null) {
                return null;
            }
            Node leftMirror = createMirror(root.left);
            Node rightMirror = createMirror(root.right);

            root.left = rightMirror;
            root.right = leftMirror;
        return root;
        }
        public static void preorder2(Node root) {
            if(root == null) {
                return;
            }
            System.out.print(root.data+ " ");
            preorder2(root.left);
            preorder2(root.right);
        }
        public static Node createBST(int arr[], int st, int end) {
        if(st>end) {
            return null;
        }
        int mid = (st+end)/2;
        Node root = new Node(arr[mid]);
        root.left = createBST(arr,st,mid-1);
        root.right = createBST(arr,mid+1,end);
        return root;
        }
        public static Node createBST2(ArrayList<Integer> inorder, int st, int end) {
        if(st>end) {
            return null;
        }
        int mid = (st+end)/2;
        Node root = new Node(inorder.get(mid));
        root.left = createBST2(inorder,st,mid-1);
        root.right = createBST2(inorder,mid+1,end);
        return root;
        }
        public static void getInorder(Node root,ArrayList<Integer>inorder) {
            if(root == null) {
                return;
            }
            getInorder(root.left,inorder);
            inorder.add(root.data);
            getInorder(root.right,inorder);
        }
        public static Node balanceBST(Node root) {
            ArrayList<Integer> inorder = new ArrayList<>();
            getInorder(root,inorder);
            root = createBST2(inorder,0,inorder.size()-1);
            return root;
        }*/
        static class Info {
                boolean isBST;
                int size; int max; int min;
                public Info(boolean isBST, int size, int min, int max){
                this.isBST = isBST;
                this.size = size; 
                this.min = min;
                 this.max = max;
            }
        }
        public static Info largestBST(Node root) {
             if(root == null) {
            return new Info(true,0,Integer.MIN_VALUE, Integer.MAX_VALUE);
        }
            Info leftInfo = largestBST(root.left);
            Info rightInfo = largestBST(root.right);
            int size = leftInfo.size+rightInfo.size+1;
            int min = Math.min(root.data,Math.min(leftInfo.min,rightInfo.min));
            int max = Math.max(root.data, Math.max(leftInfo.max,rightInfo.max));
        if(root.data<=leftInfo.max || root.data>=rightInfo.min) {
            return new Info(false,size,min,max);
        }
        if(leftInfo.isBST && rightInfo.isBST) {
            return new Info(true,size,min,max);
        }
         return new Info(false,size,min,max);
        }
        public static void main(String args[]) {
            
           // int arr[]={3,5,6,8,10,11,12};
            //Node root = createBST(arr,0,arr.length-1);
           // preorder2(root);
            Node root = new Node(50);
            root.left = new Node(30);
            root.right = new Node(60);
            root.left.left = new Node(5);
            root.right.left = new Node(45);
            root.left.right = new Node(20);
            root.right.right = new Node(70);
            root.right.right.left = new Node(65);
            root.right.right.right = new Node(80);
            Info info = largestBST(root);
            System.out.println("largest BST = " + info);
           // root = balanceBST(root);
           // preorder2(root);
           // preorder2(root);
            //System.out.println();
            //root = createMirror(root);
            //preorder2(root);
            /*int values[] = {5,8,10,3,6,11};
            Node root = null;
            for(int i=0; i<values.length; i++) {
                root = insert(root,values[i]);
            }
            preorder2(root);
            root = createMirror(root);
            preorder2(root);
            /*inorder(root);
            System.out.println();
            if(isValidBST(root,null,null)) {
                System.out.println("Valid");
            } else {
                System.out.println("NotValid");
            }*/
           // printRoot2Leaf(root,new ArrayList<>());
            //printInRange(root,5,12);
            //inorder(root);
           // root = delete(root,1);
            //System.out.println();
            //inorder(root);
            /*if(Search(root,9)) {
                 System.out.print("found");
            } else {
                System.out.print("not found");
            }
            //Search(root,7);*/
        }
}