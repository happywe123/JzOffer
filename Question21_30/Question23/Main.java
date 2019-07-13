package ReadAgain.Offer.Question21_30.Question23;

import java.util.ArrayList;

public class Main {
    public static void main(String [] args)
    {
        BinTree demoTree = new BinTree();
        int [] arr = {7,8,6,5,4,3,2};
        ArrayList<Integer> list;
        demoTree.root = demoTree.createBinTree(arr);
        list = demoTree.UptoDownBinTree(demoTree.root);
        System.out.println(list);

        list = demoTree.deepthBinTree(demoTree.root);
        System.out.println(list);
    }
}
