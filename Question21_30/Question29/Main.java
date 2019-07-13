package ReadAgain.Offer.Question21_30.Question29;

public class Main {
    public int MoreThanHalfNUmber_Solution(int [] arr)
    {
        int maxCount = arr[0];   //  用来临时存储出现的数
        int number = arr[0];     // 用来遍历数中的数
        int count = 1;

        for(int i = 1; i< arr.length; i++)
        {
            if(number != arr[i])
            {
                if(count == 0)
                {
                    number = arr[i];
                    count = 1;
                }
                else
                    count--;
            }
            else
                count++;

            if(count == 1)
            {
                maxCount = number;
            }
        }

        int num = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == maxCount)
                num++;
        }
        if(num * 2 > arr.length)
            return maxCount;

        return -1;
    }

    public static void main(String [] args)
    {
        Main demo = new Main();
        int [] arr = {1,3,3,3,2,2,2,2,2};
        System.out.println(demo.MoreThanHalfNUmber_Solution(arr));

    }

}
