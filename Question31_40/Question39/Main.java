package ReadAgain.Offer.Question31_40.Question39;

public class Main {
    public static void main(String [] args)
    {
        int arr [] = {1,3,4,5,6,7,8,9,0};
        BinTree demoTree = new BinTree();
        demoTree.root = demoTree.createBinTree(arr);
        System.out.println(demoTree.depthOfBinTree(demoTree.root));
    }
}
