package ReadAgain.Offer.Question31_40.Question34;

public class Main {

    public int getUglyNumber_solution(int index)
    {
        if(index <= 0)
            return 0;

        int [] arr = new int[index];
        arr[0] = 1;
        int mutiply2 = 0;
        int mutiply3 = 0;
        int mutiply5 = 0;
        int min = 0;

        for(int i = 1; i < index; i++)
        {
            min = Math.min(arr[mutiply2] * 2, Math.min(arr[mutiply3] * 3,arr[mutiply5] * 5));
            arr[i] = min;
            if(arr[mutiply2] * 2 == min)
                mutiply2++;
            if(arr[mutiply3] * 3 == min)
                mutiply3++;
            if(arr[mutiply5] * 5 == min)
                mutiply5++;
        }
        return arr[index - 1];
    }

    public static void main(String[] args)
    {
        Main  demo =  new Main();
        System.out.println(demo.getUglyNumber_solution(3));
    }
}
