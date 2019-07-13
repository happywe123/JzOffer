package ReadAgain.Offer.Question1_10.Question6;

import java.util.ArrayList;
import java.util.Arrays;

public class BinTree {

    public TreeNode root = null;

    // 建立二叉树，利用链表为辅助空间
    public TreeNode createBinTree(int [] arr){
        ArrayList<TreeNode> list = new ArrayList<>();
        // 根据 数组元素 建立对象
        for(int i = 0; i < arr.length; i++)
        {
            list.add(new TreeNode(arr[i]));
        }

        // 建立二叉树
        for(int i = 0; i < list.size() / 2; i++)
        {
            list.get(i).left = list.get( 2 * i + 1);
            if(2 * i + 2 < list.size())
            {
                list.get(i).right = list.get( 2 * i + 2);
            }
        }
        return list.get(0);
    }

    // 前序遍历
    public void preOrder(TreeNode root)
    {
        if(root != null)
        {
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    // 中序遍历
    public void midOrder(TreeNode root)
    {
        if(root != null)
        {
            midOrder(root.left);
            System.out.print(root.data + " ");
            midOrder(root.right);
        }
    }

    // 后序遍历
    public void afterOrder(TreeNode root)
    {
        if(root != null)
        {
            afterOrder(root.left);
            afterOrder(root.right);
            System.out.print(root.data + " ");
        }
    }

    //  根据前序遍历和中序遍历，重建二叉树
    public TreeNode reConstructBinaryTree(int [] pre, int [] in)
    {
        if(pre == null || in == null)
            return null;
        if(pre.length == 0 || in.length == 0)
            return null;
        if(pre.length != in.length)
            return null;

        TreeNode root = new TreeNode(pre[0]);
        for(int i = 0; i < in.length; i++)
        {
            if(pre[0] == in[i])
            {
                // Arrays.copyOfRange 方法只包括下标，不包括上标
                root.left = reConstructBinaryTree(Arrays.copyOfRange(pre,1,i+ 1),Arrays.copyOfRange(in,0,i ));
                root.right = reConstructBinaryTree(Arrays.copyOfRange(pre,i + 1,pre.length),Arrays.copyOfRange(in,i + 1,in.length));
            }
        }
        return root;
    }

}
