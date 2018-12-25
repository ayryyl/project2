import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Node tree = new Node();

        tree.add(50);
        tree.add(30);
        tree.add(20);
        tree.add(40);
        tree.add(70);
        tree.add(60);
        tree.add(80);
        tree.add(10);
        tree.add(-50);
        tree.add(-1);
        // print inorder traversal of the BST
        tree.Print();

        Scanner input = new Scanner(System.in);
        double n = input.nextDouble();
        System.out.println(tree.Se(n));
    }
}