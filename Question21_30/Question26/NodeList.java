package ReadAgain.Offer.Question21_30.Question26;

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
            Node temp = head;
            while(temp.next != null)
            {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.random = temp;
        }
    }

    // 复制复杂链表
    public Node cloneConplicx(Node head)
    {
        if(head == null)
            return null;

        Node phead = new Node(head.data);
        Node current = phead;

        while(head.next != null)
        {
            current.next = new Node(head.next.data);
            if(head.random != null)
                current.random = new Node(head.random.data);
            current = current.next;
            head = head.next;
        }
        return phead;
    }

    // show list
    public void showList(Node head)
    {
        if(head != null)
        {
            Node temp = head;
            while(temp != null)
            {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.println();
            System.out.println("倒序的结果：");

            Node tp = head;
            while(tp.next != null)
                tp = tp.next;

            while(tp != null)
            {
                System.out.print(tp.data + "->");
                tp = tp.random;
            }
            System.out.println();
            System.out.println("输出完毕！");
        }

    }
}
