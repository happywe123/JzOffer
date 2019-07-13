package ReadAgain.Offer.Question41_50.Question47;

public class Main {

    public int add(int num1, int num2)
    {
        while(num2 != 0)
        {
            int temp = num1 ^ num2;
            num2 = (num1 & num2) << 1;
            num1 = temp;
        }
        return num1;
    }

    public static void main(String[] args)
    {
        Main demo = new Main();
        System.out.println(demo.add(5,17));
    }
}
