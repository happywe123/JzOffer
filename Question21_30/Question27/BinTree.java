package ReadAgain.Offer.Question21_30.Question27;

import java.util.ArrayList;

public class BinTree {
    public TreeNode root = null;

    // 创建二叉树
    public TreeNode createBinTree(int [] arr)
    {
        if(arr.length == 0 || arr == null)
            return null;
        ArrayList<TreeNode> lists = new ArrayList<>();
        int length = arr.length;
        for(int i = 0; i < length; i++)
            lists.add(new TreeNode(arr[i]));

        for(int i = 0; i < lists.size() / 2; i++)
        {
            lists.get(i).left = lists.get(2 * i + 1);
            if(2 * i + 2 < lists.size())
                lists.get(i).right = lists.get(2 * i + 2);
        }
        return lists.get(0);
    }

    // 前序打印出二叉树
    public void printArr(TreeNode root)
    {
        if(root != null)
        {
            System.out.print(root.data + " ");
            printArr(root.left);
            printArr(root.right);
        }
    }

    //1、将左子树构成双链表，并返回该链表的头节点(左子树最左边的节点)
    //2、定位到左链表的最后一个节点(左子树最右边的节点)
    //3、如果左子树链表不为空，则将当前root追加到左子树链表后
    //4、将右子树构造成双向链表，并返回链表头结点(右子树最左边的节点)
    //5、如果右子树链表不为空，将右子树链表追加到当前root后
    //6，根据左子树链表是否为空返回的整体双向链表的头节点

    //Convert函数把一个二叉搜索树变成一个有序的双向链表，返回双向链表的头结点，参数root为二叉搜索树的根节点
    public TreeNode Convert(TreeNode root){
        if(root == null){//假如根节点为空，返回空
            return null;
        }
        if(root.left == null && root.right==null){//假如只有一个根节点，则返回根节点
            return root;
        }
        //1、将左子树构造成双链表，并返回该链表头结点left
        TreeNode left = Convert(root.left);

        //2、定位到左子树链表的最后一个节点（左子树最右边的节点）
        TreeNode p = left;//创建一个临时节点P,用来遍历找到左链表的最后一个节点(左子树最右边的节点)，p初始化指向做左子树的根节点，
        while(p != null && p.right != null){
            p = p.right;//最终p为左子树最右边的节点
        }
        //3、如果左子树链表不为空，将当前root追加到左子树链表后
        if(left != null){//左子树链表不为空
            p.right = root;//左子树链表的最后一个节点p（左子树最右边节点）的右指针指向当前root节点
            root.left = p;//当前root节点的左指针指向左子树链表的最后一个节点p（左子树最右边节点）
        }
        //4、将右子树构造成双链表，并返回该链表的头结点right
        TreeNode right = Convert(root.right);

        //5、如果右子树链表不为空，将右子树链表追加到当前root后
        if(right != null){//右子树链表不为空
            right.left = root;//右子树链表的头结点right的左指针指向当前root
            root.right = right;//当前root的右指针指向右子树链表的头结点right
        }
        return left != null ? left : root;//根据左子树链表是否为空返回整个双向链表的头指针。
    }
}
