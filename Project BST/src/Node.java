public class Node {

    public Node() {
    }

    double value;
    Node left = null;
    Node right = null;
    Node root;
    
    public Node(double number) {
        value = number;
        root = null;
    }



    // metod add
    void add(double value) {

        root = Save(root, value);
    }

    // metod save
    Node Save(Node root, double value) {

            if (root == null) {
                root = new Node(value);
                return root;
            }


        if (value < root.value)
            root.left = Save(root.left, value);
        else if (value > root.value)
            root.right = Save(root.right, value);


        return root;
    }
//metod print
   public void Print() {
        analize(root);
    }

    void analize(Node root) {
        if (root != null) {
            analize(root.left);
            System.out.println(root.value);
            analize(root.right);
        }

    }
    //++
    // search
    boolean Se(double value) {
        return Search(root, value);
    }
 
    public boolean Search(Node root, double value) {
        if (root == null)
            return false;
         if (root.value == value)
                return true;

         if (value < root.value)
                   return Search(root.left , value);
         else
                   return Search(root.right, value);
    }
}





