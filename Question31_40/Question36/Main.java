package ReadAgain.Offer.Question31_40.Question36;

public class Main {
    int count = 0;

    public int InversePairs(int [] arr)
    {
        if(arr == null)
            return 0;
        mergeSort(arr,0,arr.length - 1);
        return count;
    }

    public void mergeSort(int [] data, int start, int end)
    {
        int mid = (start + end) / 2;
        if(start < end)
        {
            mergeSort(data,start, mid);
            mergeSort(data,mid + 1, end);
            merge(data,start,mid,end);
        }
    }

    public void merge(int [] data, int start, int mid, int end)
    {
        int i = start;
        int j = mid + 1;
        int index = 0;
        int [] temp = new int[end - start + 1];

        while(i <= mid && j <= end)
        {
            if(data[i] < data[j])
                temp[index++] = data[i++];
            else
            {
                temp[index++] = data[j++];
                count += mid + 1 - i;    // 注意这里 count 值的计算
            }
        }

        while(i <= mid)
            temp[index++] = data[i++];

        while(j <= end)
            temp[index++] = data[j++];

        for(int item: temp)
        {
            data[start++] = item;
        }
    }

    public static void main(String [] args)
    {
        int [] arr = {7,5,6,4,2};
        Main demo = new Main();
        System.out.println( demo.InversePairs(arr));
    }

}
