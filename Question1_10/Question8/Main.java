package ReadAgain.Offer.Question1_10.Question8;

public class Main {

    // 寻找旋转数组中最小的数
    public int FindNumber(int [] arr)
    {
        if(arr.length == 0 || arr == null)
            return -1;

        int left = 0;
        int right = arr.length - 1;
        int mid = 0;

        while(arr[left] >= arr[right])
        {
            if(right - left <= 1)
            {
                mid = right;
                break;
            }

            mid = (left + right) / 2;
            if(arr[left] == arr[mid] && arr[right] == arr[mid])
            {
                if(arr[left + 1] != arr[right - 1])
                {
                    mid = arr[left + 1] < arr[right - 1] ? left + 1 : right - 1;
                    break;
                }

                else
                {
                    left++;
                    right--;
                }
            }
            else
            {
                if(arr[left] <= arr[mid])
                    left = mid;
                else
                    right = mid;
            }
        }
        return arr[mid];
    }


    public static void main(String[] args)
    {
        Main demo = new Main();
        int[] arr = {1,0,1,1,1};
        int re = demo.FindNumber(arr);
        if(re != -1)
        {
            System.out.println(re);
        }
        else
            System.out.println("没有找到该数！");
    }

}
