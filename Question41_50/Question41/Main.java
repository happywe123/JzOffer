package ReadAgain.Offer.Question41_50.Question41;

import java.util.ArrayList;

public class Main {
    public ArrayList<ArrayList<Integer>> FindContinusSequence(int sum)
    {
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();

        if(sum < 3)
            return null;

        int small = 1;
        int big = 2;
        while(small < (sum + 1) / 2)
        {
            int s = 0;
            for(int i = small; i <= big; i++)
                s += i;
            if(s == sum)
            {
                for(int i = small ; i <= big; i++)
                    list.add(i);
                // 因为容器类封装的是对象，所以不能用简单的 add 方法来进行添加
                lists.add(new ArrayList<>(list));
                list.clear();
                small++;
            }
            else if(s > sum)
                small++;
            else
                big++;
        }
        return lists;
    }

    public static void main(String[] args)
    {
        Main demo = new Main();
        ArrayList<ArrayList<Integer>> lists = null;
        lists = demo.FindContinusSequence(15);
        System.out.println(lists);
    }
}
