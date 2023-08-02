import java.util.*;
public class BinaryTrees {
    static class Node {
        int data;
        Node left;
        Node right;
    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
    }
    //time complexity = O(n)
    static class BinaryTree {
         static int idx = -1;
        public static Node buildTrees(int nodes[]) {
            idx++;
        if(nodes[idx] == -1) {
            return null;
        }
        Node newNode = new Node(nodes[idx]);
        newNode.left = buildTrees(nodes);
        newNode.right = buildTrees(nodes);
        return newNode;
        }
         public static void preorder(Node root) {
        
        if(root == null) {
            System.out.print("-1" + " ");
            return ;
        }
    
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    
    }
         public static void inorder(Node root) {
        if(root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    
    //time complexity = O(n)
    
    public static void postorder(Node root) {
        if(root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }
    public static void levelOrder(Node root) {
        if(root == null) {
            return;
        }
        Queue<Node> q = new LinkedList <>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()) {
        Node currNode = q.remove();
        if(currNode == null) {
            System.out.println();
            if(q.isEmpty()) {
                break;
            } else {
                q.add(null);
            }
        } else {
            System.out.print(currNode.data + " ");
            if(currNode.left != null) {
            q.add(currNode.left);
            }
            if(currNode.right != null) {
            q.add(currNode.right);
            }
        }
        }
    }
    }

    static class Info {
        Node node;
        int hd;

        public Info(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }

        public static void topView(Node root) {
            //Level Order
            Queue<Info> q = new LinkedList<>();
            Hashmap<Integer, Node> map = new HashMap <> ();

            int min = 0, max = 0;
            q.add(new Info(root,0));
            q.add(null);

            while(!q.isEmpty()) {
                Info curr = q.remove();
                if(curr == null) {
                    if(q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                if(!map.containsKey(curr.hd)) {
                    map.put(curr.hd, curr.node);
                }

                if(curr.node.left != null) {
                    q.add(new Info(curr.node.left, curr.hd - 1));
                    min = Math.min(min, curr.hd-1);
                }

                if(curr.node.right != null) {
                    q.add(new Info(curr.node.right, curr.hd + 1));
                    min = Math.max(min, curr.hd+1);
                }
                }

            }

            for(int i=min; i<=max; i++) {
                System.out.print(map.get(i).data + " ");
            }
            System.out.println();
        }

    }

    public static boolean getPath(Node root, int n, ArrayList<Node> path) {
        path.add(root);

        if(root.data == n) {
            return true;
        }

        boolean foundLeft = getPath(root.left, n, path)
        boolean foundRight = getPath(root.right, n, path)

        if(foundLeft || foundRight) {
            return true;
        }

        path.remove(path.size()-1);
        return false;
    }

    public static Node lca(Node root, int n1, int n2) {
            ArrayList<Integer> path1 = new ArrayList <> ();
            ArrayList<Integer> path2 = new ArrayList <> ();

            getPath(root, n1, path1);
            getPath(root, n2, path2);

            //Last common ancestor
            int i=0; 
            for(; i<path1.size() && path2.size(); i++) {
                if(path1.get(i) != path2.get(i)) {
                    break;
                }
            }
            Node lca = path1.get(i-1);
        }

        public static Node lca2(Node root, int n1, int n2) {
            
            if(root == null || root.data == n1 || root.data == n2) {
                return root;
            }

            Node leftLca = lca2(root.left, n1, n2);
            Node rightLca = lca2(root.right, n1, n2);

            if(rightLca == null) {
                return leftLca;
            }
            if(leftLca == null) {
                return rightLca;
            }

            return root;
        }

        public static int KAncestor(Node root, int n, int k) {

            if(root.data == n) {
                return 0;
            }

            int leftDist = KAncestor(root.left, n1, n2);
            int rightDist = KAncestor(root.right, n1, n2);

            if(leftDist == -1 && rightDist == -1) {
                return -1;
            }
            int max = Math.max(leftDist, rightDist);
            if(max+1 == k) {
                System.out.println(root.data);
            }
            return max+1;

        }

        public static void transform(Node root) {
             
            if(root == null) {
                return 0;
            } 
            int leftChild = transform(root.data);
            int rightChild = transform(root.data);

            int data = root.data;

            int newLeft = root.left == null ? 0: root.left.data;
            int newRight = root.right == null ? 0: root.right.data;

            root.data = newLeft + leftChild + newRight + rightChild;
            return data;
        }

        public static void preorder(Node root) {
            if(root == null) {
                return ;
            }
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }

    public static void main(String args[]) {
       /* int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTrees(nodes);
       // System.out.println(root.data);
       tree.levelOrder(root);*/
       Node root = new Node(1);
       root.left = new Node(2);
       root.right = new Node(3);
       root.right.left = new Node(4);
       root.left.right = new Node(5);
       root.right.left = new Node(6);
       root.right.right = new Node(7);
    }
}