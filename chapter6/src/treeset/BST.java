package treeset;

public class BST {
        Node root = null;
        public void add(int val) {
            root=insertRec(root, val);
        }

        public Node insertRec(Node root, int val) {
            if (root == null) {
                Node newNode= new Node(val);
                return newNode;
            }

            if (val < root.val)
                root.left = insertRec(root.left, val);
            else if (val > root.val)
                root.right = insertRec(root.right, val);
            return root;
        }

        public void inOrder(Node root) {
            if (root.left != null)
                inOrder(root.left);
            System.out.println(root.val);
            if (root.right != null)
                inOrder(root.right);
        }

        private static class Node{
            int val;
            Node left, right;
            public Node(int val) {
                this.val = val;
            }
        }
    }

