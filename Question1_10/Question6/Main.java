package ReadAgain.Offer.Question1_10.Question6;

public class Main {


    public static void main(String[] args)
    {
//        int [] arr = {2,5,6,7,8,15,25,28};
//        BinTree demoTree = new BinTree();
//        demoTree.root = demoTree.createBinTree(arr);
//
//        demoTree.preOrder(demoTree.root);
//        System.out.println();
//        demoTree.midOrder(demoTree.root);
//        System.out.println();
//        demoTree.afterOrder(demoTree.root);
//        System.out.println();
        int [] pre = {1,2,4,7,3,5,6,8};
        int [] in = {4,7,2,1,5,3,8,6};
        BinTree demoTree = new BinTree();
        //demoTree.root = demoTree.reConstructBinaryTree(pre,in);
        demoTree.root = demoTree.createBinTree(pre);
        demoTree.preOrder(demoTree.root);
        System.out.println();
        demoTree.midOrder(demoTree.root);
        System.out.println();
        demoTree.afterOrder(demoTree.root);

    }
}
