package ReadAgain.Offer.Question21_30.Question25;

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
            if( 2 * i + 2 < lists.size())
                lists.get(i).right = lists.get( 2 * i + 2);
        }
        return lists.get(0);
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

    // 打印出二叉树对于某一个数值的路径
    public ArrayList<ArrayList<Integer>> findPath(ArrayList<ArrayList<Integer>> resultList,ArrayList<Integer> list,TreeNode root, int target)
    {
        if(root == null)
            return resultList;

        list.add(root.data);
        target = target - root.data;
        if(root.left == null && root.right == null && target == 0 )
        {
            resultList.add(new ArrayList<>(list));
        }
        else
        {
            findPath(resultList,list,root.left,target);
            findPath(resultList,list,root.right,target);
        }

        list.remove(list.size() - 1);
        return resultList;
    }



}
