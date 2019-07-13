package ReadAgain.Offer.Question1_10.Question7;

import java.util.Stack;

public class Main {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    // 入栈
    public void push(int node){
        stack1.push(node);
    }


    // 出栈

    public int pop(){
        if(stack1.isEmpty() && stack2.isEmpty())
        {
            System.out.println("队列中没有元素！");
        }

        if(stack2.isEmpty() )
        {
            while(!stack1.isEmpty())
            {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }



    public static void main(String [] args)
    {
        Main demo = new Main();
        demo.push(5);
        demo.push(6);
        demo.push(7);
        System.out.println(demo.pop());
    }
}
