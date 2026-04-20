import java.util.HashMap;

public class leetcode55 {
    boolean isAnagram(String s1,String s2)
    {
        HashMap<Character,Integer>hm=new HashMap<>();
        for(int i=0;i<s1.length();i++)
        {
            char ch=s1.charAt(i);
            if(hm.containsKey(ch))
            {
                hm.put(ch,(hm.get(ch)+1));
            }else{
                hm.put(ch, 1);
            }
        }
        for(int i=0;i<s2.length();i++)
        {
            char ch=s2.charAt(i);
            if(hm.containsKey(ch))
            {
              hm.put(ch,(hm.get(ch)-1));
            }else{
                return false;
            }
        }
        for(int i:hm.values())
        {
            if(i>0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
       String s1="anagram";
       String s2="nagaram";
        leetcode55 obj=new leetcode55();
        System.out.println(obj.isAnagram(s1, s2));
    }
}

