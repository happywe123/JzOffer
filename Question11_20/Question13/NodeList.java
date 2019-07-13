package ReadAgain.Offer.Question11_20.Question13;

public class NodeList {

    public Node head = null;

    // 尾插法插入节点
    public void InsertIntoTail(Node head, int data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = newNode;
        }
        else
        {
            Node currentNode = head;
            while(currentNode.next != null)
            {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
    }

    // 打印出链表
    public void printArr(Node head)
    {
        Node currentNode = head;
        while(currentNode != null)
        {
            System.out.print(currentNode.data + "->");
            currentNode = currentNode.next;
        }
        System.out.println();
    }

    // 利用 O(1) 来删除节点
    public void deleteNode(Node head, Node deleteNode)
    {
        if(head == null || deleteNode == null)
            return;

        if(head == deleteNode)
            head = null;
        else
        {
            if(deleteNode.next == null)
            {
                Node currentNode = head;
                while(currentNode.next.next != null)
                {
                    currentNode = currentNode.next;
                }
                currentNode.next = null;
            }
            else
            {
                deleteNode.data = deleteNode.next.data;
                deleteNode.next = deleteNode.next.next;
            }
        }
    }



}
