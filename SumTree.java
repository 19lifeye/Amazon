// Creating Node and assigning value to that node
class Node
{
    int data;
    Node left, right;

    Node(int data){
        this.data = data;
        left = right = null;
    }
}

class SumTree{

    Node root;

    int sum(Node node)
    {
        if(node == null)
        {
            return 0;
        }
        return sum(node.left) + node.data + sum(node.right);
    }

    int isSumTree(Node node)
    {
        int ls, rs;
        if((node == null) || (node.left == null && node.right == null))
        {
            return 1;
        }

        ls = sum(node.left);    
        rs = sum(node.right);

        if((node.data == ls+rs) && (isSumTree(node.left)!=0) && (isSumTree(node.right)!=0))
        {
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        
        SumTree sumTree = new SumTree();
        sumTree.root = new Node(26);
        sumTree.root.left = new Node(10);
        sumTree.root.right = new Node(3);
        sumTree.root.left.left = new Node(4);
        sumTree.root.left.right = new Node(6);
        sumTree.root.right.left  = new Node(1);
        sumTree.root.right.right = new Node(2);

        if(sumTree.isSumTree(sumTree.root) != 0 )
        {
            System.out.println("Given tree is a sum tree ");
        }
        else
        {
            System.out.println("Given tree is not a sum tree ");
        }
    }
}