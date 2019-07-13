package ReadAgain.Offer.Question11_20.Question19;

public class Main {

    public static void main(String [] args)
    {
        BinTree demoTree = new BinTree();
        int [] arrays = {3,8,7,9,2,4,7};
        demoTree.root = demoTree.createBinTree(arrays);
        demoTree.printBinTree(demoTree.root);
        System.out.println();
        demoTree.Mirror(demoTree.root);
        demoTree.printBinTree(demoTree.root);
    }

}
