package ReadAgain.Offer.Question11_20.Question16;

public class Mian {
    public static void main(String[] args)
    {
        NodeList demoList = new NodeList();
        demoList.insertIntoTail(5);
        demoList.insertIntoTail(6);
        demoList.insertIntoTail(7);
        demoList.insertIntoTail(8);

        demoList.printArr(demoList.head);
        System.out.println();

        demoList.printArr(demoList.reverseNodeList(demoList.head));
    }
}
