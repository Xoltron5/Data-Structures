public class MainBST {
    public static void main(String[] args) {
        
        BinarySearchTree tree = new BinarySearchTree();

        tree.add(5);
        tree.add(1);
        tree.add(9);
        tree.add(2);
        tree.add(7);
        tree.add(3);
        tree.add(6);
        tree.add(4);
        tree.add(8);

        tree.remove(5);
        tree.remove(8);
        tree.remove(7);

        tree.display();

        System.out.println("Size: " + tree.size());

        System.out.println("Is tree empty: " + tree.isEmpty());
    
        System.out.println(tree.contains(5));

        System.out.println("Tree: " + tree.isBalanced());

        tree.invert();

        tree.display();
    }
}
