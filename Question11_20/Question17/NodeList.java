package ReadAgain.Offer.Question11_20.Question17;

public class NodeList {
    public Node head  = null;


    // 尾插法
    public void insertIntoTail(int data)
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


    // 顺序打印出链表
    public void printNodeList(Node head)
    {
        if(head != null)
        {
            Node currentNode = head;
            while(currentNode != null)
            {
                System.out.print(currentNode.data + " ");
                currentNode = currentNode.next;
            }
        }
    }

    // 合并两个链表
    public Node MergeNodeList(Node phead, Node qhead)
    {
        if(phead == null )
            return qhead;
        if(qhead == null)
            return phead;

        Node newHead = null;
        if(phead.data < qhead.data)
        {
            newHead = phead;
            newHead.next = MergeNodeList(phead.next,qhead);
        }
        else
        {
            newHead = qhead;
            newHead.next = MergeNodeList(phead,qhead.next);
        }
        return newHead;
    }
}
