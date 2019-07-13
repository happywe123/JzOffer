package ReadAgain.Offer.Question11_20.Question20;

import java.util.ArrayList;

public class Main {
    public ArrayList<Integer> printMartix(int [][] arr)
    {
        ArrayList<Integer> list = new ArrayList<>();
        if(arr.length == 0 || arr == null)
            return null;
        int start = 0;
        while(arr[0].length > start * 2 && arr.length > start * 2)
        {
            printOneCircle(arr,list,start);
            start++;
        }
        return list;
    }

    public void printOneCircle(int [][] arr, ArrayList<Integer> list,int start)
    {
        int endX = arr[0].length - 1 - start;  // 表示列号
        int endY = arr.length - 1 - start;     // 表示行号

        // 从左到右
        for(int i = start; i <= endX; i++)
        {
            list.add(arr[start][i]);
        }

        //从上到下
        if(endY > start)
        {
            for(int i = start + 1; i <= endY; i++)
            {
                list.add(arr[i][endX]);
            }
        }

        // 从右向左
        if(endX > start)
        {
            for(int i = endX - 1; i >= start; i--)
            {
                list.add(arr[endY][i]);
            }
        }

        // 从下向上
        if(endY > start)
        {
            for(int i = endY - 1; i > start; i--)
            {
                list.add(arr[i][start]);
            }
        }
    }

    public static void main(String[] args)
    {
        int [][] array = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        Main demo = new Main();
        System.out.println( demo.printMartix(array));
    }
}
