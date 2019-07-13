package ReadAgain.Offer.Question31_40.Question31;

public class Main {
    public int FindGreatestSumOfSubArray(int [] array)
    {
        if(array.length == 0 || array == null)
            return -1;
        int cur = array[0];
        int Greatest = array[0];

        for(int i = 1; i <  array.length; i++)
        {
            if(cur < 0)
                cur = array[i];
            else
                cur += array[i];

            if(cur > Greatest)
                Greatest = cur;
        }
        return Greatest;
    }

    public static void main(String [] args)
    {
        Main demo = new Main();
        int [] arr = {1,-2,3,10,-4,7,2,-5};
        System.out.println(demo.FindGreatestSumOfSubArray(arr));
    }
}
