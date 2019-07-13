package ReadAgain.Offer.Question21_30.Question30;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public ArrayList<Integer> GetLeastNumberSolution(int [] arr, int k)
    {
        if(arr.length == 0 || k <= 0 || k > arr.length)
            return null;
        ArrayList<Integer> list = new ArrayList<>();
        int [] kArray = Arrays.copyOfRange(arr,0,k);
        MaxHeap(kArray);

        for(int i = k; i < arr.length; i++)
        {
            if(arr[i] < kArray[0])
            {
                kArray[0] = arr[i];
                BuildHeap(kArray,0);
            }
        }

        for(int i = kArray.length - 1; i >= 0; i--)
        {
            list.add(kArray[i]);
        }
        return list;
    }

    public void MaxHeap(int [] arr)
    {
        for(int i = arr.length / 2 - 1; i >= 0; i--)
        {
            BuildHeap(arr,i);
        }
    }

    public void BuildHeap(int [] arr, int i)
    {
        int left = 2 * i + 1;
        int right = left + 1;
        int largest = 0;

        if(left < arr.length && arr[left] > arr[i])
            largest = left;
        else if(right < arr.length && arr[right] > arr[i])
            largest = right;
        else
            largest = i;

        if(largest != i)
        {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            BuildHeap(arr,largest);
        }
    }

    public static void main(String[] args)
    {
        Main demo = new Main();
        int [] arr = {11,14,9,7,10,15,16,13};
        ArrayList<Integer> list = new ArrayList<>();
        list = demo.GetLeastNumberSolution(arr,5);
        System.out.println(list);

    }

}
