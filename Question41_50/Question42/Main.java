package ReadAgain.Offer.Question41_50.Question42;

public class Main {
    public String reverseSentence(String str)
    {
        if(str.length() == 0 || str == null)
            return null;
        if(str.trim().length() == 0)
            return null;

        String re = reverse(str);
        String [] rs = re.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < rs.length - 1; i++)
        {
            sb.append(reverse(rs[i]) + " ");
        }
        sb.append(reverse(rs[rs.length - 1]));
        return String.valueOf(sb);
    }

    public String reverse(String str)
    {
        if(str.length() == 0 || str == null)
            return null;

        StringBuilder sb = new StringBuilder();
        for(int i = str.length() - 1; i >= 0; i--)
        {
            sb.append(str.charAt(i));
        }
        return String.valueOf(sb);
    }

    public static void main(String[] args)
    {
        Main demo = new Main();
        String str = "I am a student";
        str = demo.reverseSentence(str);
        System.out.println(str);
    }
}
