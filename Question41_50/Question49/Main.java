package ReadAgain.Offer.Question41_50.Question49;

public class Main {

    public int strToInt(String str)
    {
        if(str.length() == 0 || str == null)
            return 0;

        int number = 0;
        int mark = 0;
        char [] chars = str.toCharArray();

        if(chars[0] == '-')
            mark = 1;

        for(int i = mark; i < chars.length; i++)
        {
            if(chars[i] == '+')
                continue;
            if(chars[i] < 48 || chars[i] > 57)
                return 0;

            number = number * 10 + chars[i] - 48;
        }
        return mark == 1 ? -number : number;
    }

    public static void main(String [] args)
    {
        Main demo = new Main();
        System.out.println(demo.strToInt("123"));
    }
}
