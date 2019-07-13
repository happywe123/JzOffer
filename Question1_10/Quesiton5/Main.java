package ReadAgain.Offer.Question1_10.Quesiton5;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args)
    {
        Main demo = new Main();
        NodeList nodeList = new NodeList();
        ArrayList<Integer> list = new ArrayList<>();
        nodeList.insertIntoTail(5);
        nodeList.insertIntoTail(6);
        nodeList.insertIntoTail(7);
        nodeList.insertIntoTail(8);
        nodeList.insertIntoTail(9);

        nodeList.printList(nodeList.head);
        System.out.println();

        list = nodeList.FromTailToHead(nodeList.head);
        System.out.println(list);
    }
}
