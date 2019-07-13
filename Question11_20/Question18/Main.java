package ReadAgain.Offer.Question11_20.Question18;

public class Main {
    public static void main(String[] args)
    {
        int [] array1 = {8,8,7,9,2,4,7};
        int [] array2 = {8,9,2};
        BinTree tree1 = new BinTree();
        BinTree tree2 = new BinTree();
        tree1.root = tree1.createBinTree(array1);
        tree2.root = tree2.createBinTree(array2);
        tree1.printBinTree(tree1.root);
        System.out.println();
        tree2.printBinTree(tree2.root);
        System.out.println(tree1.isHaveSubTree(tree1.root,tree2.root));


    }
}
