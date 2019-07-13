package ReadAgain.Offer.Question11_20.Question19;

import java.util.ArrayList;
import java.util.Stack;

public class BinTree {
    public TreeNode root = null;

    // 创建二叉树
    public TreeNode createBinTree(int [] arr)
    {
        if(arr.length == 0 || arr == null)
            return null;
        ArrayList<TreeNode> arrayList = new ArrayList<>();
        for(int i  = 0; i < arr.length; i++)
        {
            arrayList.add(new TreeNode(arr[i]));
        }
        for(int i = 0; i < arrayList.size() / 2;i++)
        {
            arrayList.get(i).left = arrayList.get(2 * i + 1);
            if(2 * i + 2 < arrayList.size())
                arrayList.get(i).right = arrayList.get(2 * i  + 2);
        }
        return arrayList.get(0);
    }

    // 前序遍历
    public void printBinTree(TreeNode root)
    {
        if(root  != null)
        {
            System.out.print(root.data + " ");
            printBinTree(root.left);
            printBinTree(root.right);
        }
    }

    // 操作二叉树，将其转换为二叉树的镜像
    public void Mirror(TreeNode root)
    {
        if(root == null)
            return;

        Stack<TreeNode> stack = new Stack<>();
        while(root != null || !stack.isEmpty())
        {
            while(root != null)
            {
                TreeNode temp = root.left;
                root.left = root.right;
                root.right = temp;
                stack.push(root);
                root = root.left;
            }
            if(!stack.isEmpty())
            {
                root = stack.pop();
                root = root.right;
            }
        }
    }


}
