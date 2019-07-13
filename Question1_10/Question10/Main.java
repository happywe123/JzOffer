package ReadAgain.Offer.Question1_10.Question10;

public class Main {

    public int CountNumber(int n)
    {
        int count = 0;
        while(n != 0)
        {
            count++;
            n = n & (n - 1);
        }
        return count;
    }


    public static void main(String [] args)
    {
        Main demo = new Main();
        System.out.println(demo.CountNumber(9));

    }
}
