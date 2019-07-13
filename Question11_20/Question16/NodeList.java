package ReadAgain.Offer.Question11_20.Question16;

public class NodeList {
    public Node head = null;

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
            currentNode.next =newNode;
        }
    }

    // 顺序打印出链表
    public void printArr(Node head)
    {
        if(head != null)
        {
            Node currentNode = head;
            while(currentNode != null)
            {
                System.out.print(currentNode.data + "->");
                currentNode = currentNode.next;
            }
        }
    }

    // 反转链表
   public Node reverseNodeList(Node head)
   {
       if(head == null)
       {
           return null;
       }

       Node temp = null;
       while(head != null)
       {
           Node p =head.next;
           head.next = temp;
           temp = head;
           head = p;
       }
       return temp;
   }



}
