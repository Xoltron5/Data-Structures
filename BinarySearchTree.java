public class BinarySearchTree {
    private Node root;
    private int currentSize = 0;

    class Node {
        int data;
        Node left, right;
    
        public Node(int data) {
            this.data = data;
            left = right = null;
        }   
    }

    class BalanceStatus {
        boolean balanced; 
        int height; 

        public BalanceStatus(boolean balanced, int height) {
            this.balanced = balanced;
            this.height = height;
        }
    }

    public void add(int data) {
        if (root == null) {
            root = new Node(data);
            currentSize++;
            return;
        }
        add(data, root);
        currentSize++;
    }

    private void add(int data, Node node) {
        if (data >= node.data) {
            // go to the right
            if (node.right == null) {
                node.right = new Node(data);
                return;
            }
            add(data, node.right);
            return;
        }
        if (node.left == null) {
            node.left = new Node(data);
            return;
        }
        add(data, node.left);
    }

    public boolean contains(int data) {
        return contains(data, root);
    }

    private boolean contains(int data, Node node) {
        if (node == null) return false;

        if (data == node.data) return true;

        if (data > node.data) {
            return contains(data, node.right);
        }

        return contains(data, node.left);
    }

    public void display() {
        display(root);
    }

    private void display(Node root) {
        if (root != null) {
            display(root.left);
            System.out.println(root.data);
            display(root.right);
        }
    }

    public int size() {
        return currentSize;
    }

    public boolean isEmpty() {
        return currentSize == 0;
    }

    public void remove(int data) {
        if (contains(data)) {
            remove(data, root);
        } 
    }

    private Node remove(int data, Node root) {
        if (root == null) return root;
    
        if (data > root.data) {
            root.right = remove(data, root.right);
            return root;
        } 
        if (data < root.data) {
            root.left = remove(data, root.left);
            return root;
        }

        // node found

        // node is leaf
        if (root.left == null && root.right == null) {
            root = null;
            currentSize--;
        }  
        // Find a successor to replace this node.
        else if (root.right != null) {
            root.data = successor(root);
            root.right = remove(root.data, root.right);
        } else { // Find a predecessor to replace this node.
            root.data = predecessor(root);
            root.left = remove(root.data, root.left);
        }
        return root;
    }

    private int successor(Node root) {
        root = root.right;

        while (root.left != null) {
            root = root.left;
        }

        return root.data;
    }

    private int predecessor(Node root) {
        root = root.left;

        while (root.right != null) {
            root = root.right;
        }
        
        return root.data;
    }

    public boolean isBalanced() {
        return isBalanced(root).balanced;
    }
    
    private BalanceStatus isBalanced(Node root) {
        if (root == null) {
            return new BalanceStatus(true, -1);
        }

        BalanceStatus left = isBalanced(root.left);
        BalanceStatus right = isBalanced(root.right);
        
        boolean balance = (left.balanced && right.balanced && Math.abs(left.height - right.height) <= 1);
        
        return new BalanceStatus(balance, (Math.max(left.height, right.height) + 1));
    }

    public void invert() {
        invert(root);
    }

    private void invert(Node root) {
        if (root == null) return;

        // Swap the children
        Node tmp = root.left;
        root.left = root.right;
        root.right = tmp;

        invert(root.left);
        invert(root.right);
    }


} 