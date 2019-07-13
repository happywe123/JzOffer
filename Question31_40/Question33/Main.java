package ReadAgain.Offer.Question31_40.Question33;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public String printMinNumber(int [] numbers)
    {
        if(numbers.length == 0 || numbers == null)
            return null;

        int len = numbers.length;
        String [] str = new String[len];
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < len; i++)
        {
            str[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String s1 = o1 + o2;
                String s2 = o2 + o1;
                return s1.compareTo(s2);
            }
        });

        for(int i = 0; i < len; i++)
        {
            sb.append(str[i]);
        }
        return String.valueOf(sb);
    }

    public static void main(String[] args)
    {
        int [] numbers = {3,32,321};
        Main demo = new Main();
        System.out.println(demo.printMinNumber(numbers));
    }
}
