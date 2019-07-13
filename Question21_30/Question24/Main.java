package ReadAgain.Offer.Question21_30.Question24;

import java.util.Arrays;

public class Main {
    public boolean isBST(int [] arr)
    {
        if(arr.length == 0 || arr == null)
            return false;

        int length = arr.length;
        int rightStart = 0;

        for(int i = 0 ; i < length - 1; i++)
        {
            if(arr[i] < arr[length - 1])
                rightStart++;
        }

        if(rightStart == 0)
            isBST(Arrays.copyOfRange(arr,0,length - 1));
        else
        {
            for(int i = rightStart; i <  length - 1; i++)
            {
                if(arr[i] < arr[length - 1])
                    return false;
            }
            isBST(Arrays.copyOfRange(arr,0,rightStart));
            isBST(Arrays.copyOfRange(arr,rightStart,length - 1));
        }
        return true;
    }

    public static void main(String[] args)
    {
        int [] arr = {5,7,6,9,11,10,8};
        Main demo = new Main();
        System.out.println(demo.isBST(arr));
    }

}
