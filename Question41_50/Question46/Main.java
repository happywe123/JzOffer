package ReadAgain.Offer.Question41_50.Question46;

public class Main {

    public int sumSolution(int n)
    {
        int sum = n;
        boolean result = (n > 0 && (sum += sumSolution( n - 1)) > 0);
        return sum;
    }

    public static void main(String [] args)
    {
        Main demo = new Main();
        System.out.println( demo.sumSolution(3));
    }
}
