package ReadAgain.Offer.Question31_40.Question38;

import java.util.Arrays;

public class Main {

    public int GetNumberOfK(int [] arr, int k)
    {
        if(arr.length == 0 || arr == null)
            return 0;
        int result = 0;
        int mid = arr.length / 2;

        if(arr.length == 1)
        {
            if(arr[0] == k)
                return 1;
            else
                return 0;
        }
        if(k < arr[mid])
            result += GetNumberOfK(Arrays.copyOfRange(arr,0,mid),k);
        else if(k > arr[mid])
            result += GetNumberOfK(Arrays.copyOfRange(arr,mid,arr.length),k);
        else
        {
            for(int i = mid; i < arr.length; i++)
            {
                if(arr[i] == k)
                    result++;
                else
                    break;
            }

            for(int i = mid - 1; i >= 0; i--)
            {
                if(arr[i] == k)
                    result++;
                else
                    break;
            }
        }
        return result;
    }

    public static void main(String[] args)
    {
        Main demo = new Main();
        int [] arr = {1,2,2,2,2,3,3,4,4,5};
        System.out.println(demo.GetNumberOfK(arr,4));
    }
}
