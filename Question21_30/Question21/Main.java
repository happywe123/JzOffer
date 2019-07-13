package ReadAgain.Offer.Question21_30.Question21;

import java.util.Stack;

public class Main {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void pushIntoStack(int data)
    {
        stack1.push(data);
        if(stack2.isEmpty())
        {
            stack2.push(data);
        }
        else
        {
            if(data < stack2.peek())
            {
                stack2.push(data);
            }
            else
            {
                stack2.push(stack2.peek());
            }
        }
    }

    public int popOutStack()
    {
        if(stack1.peek() == stack2.peek())
        {
            stack2.pop();
            return stack1.pop();
        }
        else
        {
            return stack1.pop();
        }
    }

    public int min()
    {
        return stack2.pop();
    }

    public static void main(String [] args)
    {
        Main demo = new Main();
        demo.pushIntoStack(3);
        demo.pushIntoStack(4);
        demo.pushIntoStack(2);
        demo.pushIntoStack(1);
        System.out.println(demo.min());

        demo.popOutStack();
        System.out.println(demo.min());
        demo.popOutStack();
        System.out.println(demo.min());
        demo.popOutStack();
        System.out.println(demo.min());

        demo.pushIntoStack(0);

        System.out.println(demo.min());

    }
}
