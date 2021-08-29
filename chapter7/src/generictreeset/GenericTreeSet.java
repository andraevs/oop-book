package generictreeset;

public class GenericTreeSet<T extends Comparable> {
        /*
        Must make sure that everywhere Node is replaced by Node<T>, otherwise we lose type-safety
         */
        private Node<T> root = null;
        public void add(T val) {
            root=insertRec(root, val);
        }

        private Node<T> insertRec(Node<T> root, T val) {
            if (root == null) {
                Node<T> newNode= new Node<>(val);
                return newNode;
            }
            // Only possible because T extends comparable
            if (val.compareTo(root.val) < 0)
                root.left = insertRec(root.left, val);
            else if (val.compareTo(root.val) > 0)
                root.right = insertRec(root.right, val);
            return root;
        }
        public void inOrder(){
          inOrderRec(root);
        }
        private void inOrderRec(Node<T> curr) {
            if (curr.left != null)
              inOrderRec(curr.left);
            System.out.print(curr.val+" ");
            if (curr.right != null)
              inOrderRec(curr.right);
        }
        /*
        If Node was a non-static nested class it would have received T type from the GenericTreeSet instance.
        Since it is static, it also needs to be generic and the explicitly set
         */
        private static class Node<U>{
            U val;
            Node<U> left, right;
            public Node(U val) {
                this.val = val;
            }
        }
    }

