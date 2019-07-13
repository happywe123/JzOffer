package ReadAgain.Offer.Question1_10.Quesiton5;

import java.util.ArrayList;
import java.util.Stack;

public class NodeList {

    public Node head = null;

    // 插入节点
    public void insertIntoTail(int data){
        Node newNode = new Node(data);
        if(head == null)
        {
            head = newNode;
        }
        else
        {
            Node p = head;
            while(p.next != null)
            {
                p = p.next;
            }
            p.next = newNode;
        }
    }

    // 打印出链表
    public void printList(Node head)
    {
        Node p = head;
        while(p != null)
        {
            System.out.print(p.data + "->");
            p = p.next;
        }
    }


    // 输入一个链表，从尾到头打印链表每个节点的值
    public ArrayList<Integer> FromTailToHead(Node node)
    {
        if(node == null)
            return null;

        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        while(node != null)
        {
            stack.push(node.data);
            node = node.next;
        }

        while(!stack.isEmpty())
        {
            list.add(stack.pop());
        }
        return list;
    }




}
