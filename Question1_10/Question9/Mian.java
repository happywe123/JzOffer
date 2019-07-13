package ReadAgain.Offer.Question1_10.Question9;

public class Mian {

    //循环的解法相比与递归代码的代价比较小
    public long fibonacci(int n){
        long result = 0;
        long preOne = 1;
        long preTwo = 0;
        if(n == 0){
            return preTwo;
        }
        if(n == 1){
            return preOne;
        }

        for(int i = 2; i <= n; i++)
        {
            result = preOne + preTwo;
            preTwo = preOne;
            preOne = result;
        }
        return result;
    }

    public static void main(String[] args){
        Mian demo = new Mian();
        System.out.println(demo.fibonacci(5));
    }
}
