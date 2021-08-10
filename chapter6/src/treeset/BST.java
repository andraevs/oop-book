package treeset;

public class BST {
        private Node root = null;
        public void add(int val) {
            root=insertRec(root, val);
        }

        private Node insertRec(Node root, int val) {
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

        // In-order traversal of a binary search tree returns the elements in their natural order, in this case
        // ascending for numbers
        public void inOrder(){
          inOrderRec(root);
        }

        // Notice how the public method inOrder uses a helper, private method inOrderRec so that client of inOrder
        // is not aware of the recursive implementation and does not need to supply the root Node which would break
        // the encapsulation in more than one way
        private void inOrderRec(Node curr) {
            if (curr.left != null)
              inOrderRec(curr.left);
            System.out.print(curr.val+" ");
            if (curr.right != null)
              inOrderRec(curr.right);
        }

        private static class Node{
            int val;
            Node left, right;
            public Node(int val) {
                this.val = val;
            }
        }
    }

