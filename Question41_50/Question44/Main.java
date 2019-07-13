package ReadAgain.Offer.Question41_50.Question44;

import java.util.Arrays;

public class Main {

    public boolean isContinus(int [] numbers)
    {
        if(numbers.length == 0 || numbers == null)
            return false;

        int count = 0;
        int differs = 0;
        Arrays.sort(numbers);

        for(int i = 0 ; i < numbers.length - 1; i++)
        {
            if(numbers[i] == 0)
            {
                count++;
                continue;
            }

            if(numbers[i] != numbers[i + 1])
                differs += numbers[ i + 1] - numbers[i] - 1;
            else
                return false;
        }

        if(count >= differs)
            return true;
        return false;
    }

    public static void main(String []args)
    {
        Main demo = new Main();
        int [] numbers = {1,0,5,2,0};
        System.out.println(demo.isContinus(numbers));
    }
}
