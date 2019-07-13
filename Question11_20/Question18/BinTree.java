package ReadAgain.Offer.Question11_20.Question18;

import java.util.ArrayList;

public class BinTree {
    public TreeNode root = null;

    // 创建二叉树
    public TreeNode createBinTree(int [] arr)
    {
        if(arr == null || arr.length == 0)
        {
            return null;
        }

        ArrayList<TreeNode> arrayList = new ArrayList<>();
        for(int i = 0; i < arr.length; i++)
        {
            arrayList.add(new TreeNode(arr[i]));
        }
        for(int i = 0;  i < arrayList.size() / 2; i++)
        {
            arrayList.get(i).left = arrayList.get( 2 * i + 1);
            if(2 * i + 2 < arrayList.size())
            {
                arrayList.get(i).right = arrayList.get( 2 * i + 2);
            }
        }
        return arrayList.get(0);
    }

    // 前序遍历二叉树
    public void printBinTree(TreeNode root)
    {
        if(root != null)
        {
            System.out.print(root.data + " ");
            printBinTree(root.left);
            printBinTree(root.right);
        }
    }

   // 判断二叉树是否有子结构
    public boolean isHaveSubTree(TreeNode root1, TreeNode root2)
    {
        boolean result = false;
        if(root1 != null && root2 != null)
        {
            if(root1.data == root2.data)
            {
                result = doesHaveTree(root1,root2);
            }

            if(!result)
            {
                return isHaveSubTree(root1.left,root2) || isHaveSubTree(root1.right,root2);
            }
        }
        return result;
    }

    public boolean doesHaveTree(TreeNode node1, TreeNode node2)
    {
        if(node2 == null)
            return true;
        if(node1 == null)
            return false;
        if(node1.data != node2.data)
            return false;
        return doesHaveTree(node1.left, node2.left) && doesHaveTree(node1.right,node2.right);
    }

}
