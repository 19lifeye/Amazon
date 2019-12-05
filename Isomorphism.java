
// Creating a node for tree
class Node{
    int data;               
    Node left, right;

    Node(int data)
    {
        this.data = data;
        left = right;
    }
}

class BinaryTree
{
    Node root1, root2;

    boolean IsIsomorphism(Node n1, Node n2)
    {
        if(n1 == null && n2 == null)
        {
            return true;
        }
        if(n1 == null || n2 == null)
        {
            return false;
        }
        if(n1.data != n2.data)
        {
            return false;
        }

        return ((IsIsomorphism(n1.left, n2.right) && IsIsomorphism(n1.right, n2.left)) || (IsIsomorphism(n1.left, n2.left) && IsIsomorphism(n1.right, n2.right)));
    }

}

class Isomorphism
{
    public static void main(String[] args) {
        
        BinaryTree tree = new BinaryTree();

        // Creating a new Tree 1
        tree.root1 = new Node(1);
        tree.root1.left  = new Node(2);
        tree.root1.right = new Node(3);
        tree.root1.left.left = new Node(4);
        tree.root1.left.right = new Node(5);
        tree.root1.right.left = new Node(6);
        tree.root1.left.right.left = new Node(7);
        tree.root1.left.right.right = new Node(8);

        // Creating a new Tree 2 
        tree.root2 = new Node(1);
        tree.root2.left  = new Node(3);
        tree.root2.right = new Node(2);
        tree.root2.right.left = new Node(4);
        tree.root2.right.right = new Node(5);
        tree.root2.left.right = new Node(6);
        tree.root2.right.right.left = new Node(8);
        tree.root2.right.right.right = new Node(7);

        // Checking tree 1 and tree 2

        if(tree.IsIsomorphism(tree.root1, tree.root2) ==  true)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }


    }
}