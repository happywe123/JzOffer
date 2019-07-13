package ReadAgain.Offer.Question31_40.Question40;

public class Main {
    public void findNumberOnce(int [] arr, int  key1, int  key2)
    {
        if(arr == null)
            return;
        int number = arr[0];
        for(int i = 1; i < arr.length; i++)
        {
            number ^= arr[i];
        }

        int index = 0;
        while((number & 1) == 0)
        {
            number = number >> 1;
            index++;
        }

        for(int i = 0; i < arr.length; i++)
        {
            boolean isBit  = (((arr[i] >> index) & 1 ) == 0);
            if(isBit)
                key1 ^= arr[i];
            else
                key2 ^= arr[i];
        }
        System.out.println(key1);
        System.out.println(key2);
    }

    public static void main(String [] args)
    {
        Main demo = new Main();
        int [] arr = {2,4,3,6,3,2,5,5};
        int  key1 = 0;
        int  key2 = 0;
        demo.findNumberOnce(arr,key1,key2);


    }

}
