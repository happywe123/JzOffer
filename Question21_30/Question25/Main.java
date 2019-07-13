package ReadAgain.Offer.Question21_30.Question25;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        int [] arr = {10,5,12,4,7};
        BinTree demoTree = new BinTree();
        demoTree.root = demoTree.createBinTree(arr);

        demoTree.preOrder(demoTree.root);
        ArrayList<ArrayList<Integer>> relist = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        demoTree.findPath(relist,list,demoTree.root,22);
        System.out.println(relist);
    }
}
