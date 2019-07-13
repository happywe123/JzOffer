package ReadAgain.Offer.Question11_20.Question14;

public class Main {

    // 依次比较元素，逐个交换
    public void reOrderArray(int [] array)
    {
        if(array == null)
        {
            return;
        }

        for(int i = 1; i < array.length; i++)
        {
            int temp =  array[i];
            int j = i - 1;
            if(array[i] % 2 != 0)
            {
                while(j >= 0)
                {
                    if(array[j] % 2 !=0)
                    {
                        break;
                    }

                    else {
                        array[j + 1] = array[j];
                        j--;
                    }
                }
            }
            array[j+ 1] = temp;
        }
    }

    public static void main(String[] args)
    {
        Main demo = new Main();
        int[] arr = {5,7,8,1,4};
        demo.reOrderArray(arr);
        for(int it: arr)
        {
            System.out.print(it + "");
        }
    }
}
