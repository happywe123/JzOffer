package ReadAgain.Offer.Question11_20.Question17;

public class Main {
    public static void main(String [] args)
    {
        NodeList phead = new NodeList();
        NodeList qhead = new NodeList();

        phead.insertIntoTail(5);
        phead.insertIntoTail(7);
        phead.insertIntoTail(9);
        phead.insertIntoTail(11);
        phead.printNodeList(phead.head);
        System.out.println();

        qhead.insertIntoTail(3);
        qhead.insertIntoTail(4);
        qhead.insertIntoTail(8);
        qhead.insertIntoTail(9);
        qhead.insertIntoTail(13);
        qhead.printNodeList(qhead.head);
        System.out.println();

        NodeList newList = new NodeList();
        newList.head = newList.MergeNodeList(phead.head,qhead.head);
        newList.printNodeList(newList.head);

    }
}
