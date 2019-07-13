package ReadAgain.Offer.Question21_30.Question26;

public class Main {
    public static void main(String[] args)
    {
        NodeList demoList = new NodeList();
        NodeList demoList2 = new NodeList();

        demoList.insertIntoTail(5);
        demoList.insertIntoTail(6);
        demoList.insertIntoTail(7);
        demoList.insertIntoTail(8);


        demoList.showList(demoList.head);
        System.out.println();

        demoList2.head = demoList.cloneConplicx(demoList.head);
        demoList2.showList(demoList2.head);
    }
}
