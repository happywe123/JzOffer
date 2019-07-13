package ReadAgain.Offer.Question11_20.Question15;

public class Main {
    public static void main(String [] args)
    {
        NodeList demoList = new NodeList();
        demoList.insertIntoTail(1);
        demoList.insertIntoTail(3);
        demoList.insertIntoTail(7);
        demoList.insertIntoTail(4);


        demoList.printArray(demoList.head);
        System.out.println(demoList.showKNode(demoList.head, 2).data);

    }
}
