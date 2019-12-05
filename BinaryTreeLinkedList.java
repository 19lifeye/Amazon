//Creating a List node
class ListNode
{
    int data;
    ListNode next;
    ListNode(int d)
    {
        data = d;
        next = null;
    }
}

// Creating a node for Tree
class BinaryTreeNode
{
    int data;
    BinaryTreeNode left, right;
    BinaryTreeNode(int d)
    {
        data = d;
        left = right = null;
    }
}

class BinaryTreeLinkedList{

    ListNode head;

    void push(int new_data)
    {
        ListNode new_node = new ListNode(new_data);
        new_node.next = head;
        head = new_node;
    }

    public static void main(String[] args) {
        
    }
}