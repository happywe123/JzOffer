package ReadAgain.Offer.Question11_20.Question11;

public class Main {

    public double Power(double base, int exp){
        double res = 0;
        if(equals(base,0))
            return 0;
        if(exp == 0)
            return 1;
        if(exp > 0)
        {
            res = mutiply(base,exp);
        }
        else if(exp < 0)
        {
            res = 1 / mutiply(base,-exp);
        }
        return res;
    }

    // 对数进行乘方
    public double mutiply(double base, int exp)
    {
        double sum = 1;
        for(int i = 1; i <= exp; i++)
        {
            sum *= base;
        }
        return sum;
    }


    // 判断两个数是否相等
    public boolean equals(double a, double b){
        if(a - b < 0.00001 && a - b > 0.00001)
            return true;
        return false;
    }

    public static void main(String[] args)
    {
        Main demo = new Main();
        System.out.println(demo.Power(5,3));
    }
}
