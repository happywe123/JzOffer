package ReadAgain.Offer.Question31_40.Question39;

import java.util.ArrayList;

public class BinTree {
    public TreeNode root = null;

    // 创建二叉树
    public TreeNode createBinTree(int [] arr)
    {
        if(arr.length == 0 || arr == null)
            return null;

        ArrayList<TreeNode> lists = new ArrayList<>();
        for(int i = 0; i < arr.length; i++)
            lists.add(new TreeNode(arr[i]));

        for(int i = 0; i < lists.size() / 2; i++)
        {
            lists.get(i).left = lists.get( 2 * i + 1);
            if( 2 * i + 2 < lists.size() )
            {
                lists.get(i).right = lists.get( 2 * i + 2 );
            }
        }
        return lists.get(0);
    }

    // 利用递归遍历求出二叉树的深度
    public int depthOfBinTree(TreeNode root)
    {
        if(root == null)
            return 0;

        int left = depthOfBinTree(root.left);
        int right = depthOfBinTree(root.right);
        return left > right ? left + 1 : right + 1;
    }
}
