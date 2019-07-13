package ReadAgain.Offer.Question1_10.Quesiton4;

public class Main {

    public String Replace(String string){
        if(string == null)
            return string;

        StringBuilder stringBuilder = new StringBuilder();
        int i = 0;
        while(i < string.length())
        {
            if(String.valueOf(string.charAt(i)).equals(" "))
            {
                stringBuilder.append("%20");
            }
            else
                stringBuilder.append(string.charAt(i));
            i++;
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args)
    {
        Main demo = new Main();
        System.out.println(demo.Replace("we are happy!"));
    }
}
