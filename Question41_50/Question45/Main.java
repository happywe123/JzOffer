package ReadAgain.Offer.Question41_50.Question45;

import java.util.LinkedList;

public class Main {

    public int lastRemaining_number(int n, int m)
    {
        LinkedList<Integer> list = new LinkedList<>();
        int bt = 0;

        for(int i = 0; i < n; i++)
        {
            list.add(i);
        }

        while(list.size() > 1)
        {
            bt = (bt + m - 1) % list.size();
            list.remove(bt);
        }
        return list.size() == 1 ? list.get(0) : -1;
    }

    public static void main(String[] args)
    {
        Main demo = new Main();
        System.out.println(demo.lastRemaining_number(5,3));
    }
}
