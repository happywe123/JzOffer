package ReadAgain.Offer.Question21_30.Question22;

import java.util.Stack;

public class Mian {

    public boolean isProperOrder(int [] pushA,int [] popA)
    {
        if(pushA == null || popA == null)
        {
            return false;
        }

        Stack<Integer> stack = new Stack();
        int index = 0;

        for(int i = 0; i < pushA.length; i++)
        {
            stack.push(pushA[i]);
            while( !stack.isEmpty() && stack.peek() == popA[index])
            {
                stack.pop();
                index++;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args)
    {
        Mian demo = new Mian();
        int [] pushA = {1,2,3,4,5};
        int [] popA = {4,5,3,2,1};
        System.out.println(demo.isProperOrder(pushA,popA));
    }
}
