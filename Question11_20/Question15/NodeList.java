package ReadAgain.Offer.Question11_20.Question15;

public class NodeList {
    public Node head = null;

    // 尾插法插入节点
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

    // 打印出链表
    public void printArray(Node head)
    {
        if(head != null)
        {
            Node currentNode = head;
            while(currentNode != null)
            {
                System.out.print(currentNode.data + "");
                currentNode = currentNode.next;
            }
        }
    }

    // 输出一个链表的倒数第 k 个节点
    public Node showKNode(Node head, int k)
    {
        if(head == null || k <= 0)
            return null;
        Node preCurrentNode = head;
        Node currentNode = head;
        while(k-- > 1)
        {
            if(preCurrentNode.next != null)
            {
                preCurrentNode = preCurrentNode.next;
            }
            else
                return null;
        }

        while(preCurrentNode.next != null)
        {
            preCurrentNode = preCurrentNode.next;
            currentNode = currentNode.next;
        }
        return currentNode;
    }




}
