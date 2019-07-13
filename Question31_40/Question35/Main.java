package ReadAgain.Offer.Question31_40.Question35;

import java.util.LinkedHashMap;

public class Main {
    public int firstNotRepeatingChar(String str){
        if(str.length() == 0 || str == null)
            return -1;
        char [] chars = str.toCharArray();
        LinkedHashMap<Character,Integer> hashMap = new LinkedHashMap<>();

        for(char item: chars)
        {
            if(hashMap.containsKey(item))
                hashMap.put(item,hashMap.get(item) + 1);
            else
                hashMap.put(item,1);
        }

        for(int i = 0; i < str.length(); i++)
        {
            if(hashMap.get(str.charAt(i)) == 1)
                return i;
        }
        return -1;
    }

    public static void main(String[] args)
    {
        Main demo = new Main();
        String str = "abaccdeff";
        System.out.println(str.charAt(demo.firstNotRepeatingChar(str)));

    }
}
