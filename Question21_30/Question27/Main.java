package ReadAgain.Offer.Question21_30.Question27;

public class Main {
    public static void main(String[] args)
    {
        BinTree demoTree = new BinTree();
        int [] arr = {10,6,14,4,8,12,16};
        demoTree.root = demoTree.createBinTree(arr);
        demoTree.printArr(demoTree.root);
        System.out.println();

        TreeNode node = demoTree.Convert(demoTree.root);
        while(node != null)
        {
            System.out.print(node.data + " ");
            node = node.right;
        }
    }
}
