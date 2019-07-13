package ReadAgain.Offer.Question21_30.Question23;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class BinTree {
    public TreeNode root = null;

    // 创建二叉树
    public TreeNode createBinTree(int [] arr)
    {
        if(arr == null || arr.length == 0)
            return null;
        ArrayList<TreeNode> arrayList = new ArrayList<>();
        for(int i = 0; i < arr.length; i++)
        {
            arrayList.add(new TreeNode(arr[i]));
        }
        for(int i = 0; i < arrayList.size() / 2; i++)
        {
            arrayList.get(i).left = arrayList.get( 2 * i + 1);
            if(2 * i + 2 < arrayList.size()){
                arrayList.get(i).right = arrayList.get(2 * i + 2);
            }
        }
        return arrayList.get(0);
    }

    // 从上到下依次打印出二叉树,即广度优先遍历
    public ArrayList UptoDownBinTree(TreeNode root)
    {
        ArrayList<Integer> arrayList = new ArrayList<>();
        if(root == null)
            return null;
        LinkedList<TreeNode> list = new LinkedList<>();
        list.add(root);
        while(!list.isEmpty())
        {
            TreeNode temp  = list.poll();
            arrayList.add(temp.data);
            if(temp.left != null)
            {
                list.add(temp.left);
            }
            if(temp.right != null)
            {
                list.add(temp.right);
            }

        }
        return arrayList;
    }

    // 深度优先遍历
    public ArrayList deepthBinTree(TreeNode root)
    {
        if(root == null)
            return null;
        ArrayList<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while( !stack.isEmpty())
        {
            TreeNode temp = stack.pop();
            list.add(temp.data);
            if(temp.right != null)
            {
                stack.push(temp.right);
            }
            if(temp.left != null)
            {
                stack.push(temp.left);
            }
        }
        return list;
    }
}
