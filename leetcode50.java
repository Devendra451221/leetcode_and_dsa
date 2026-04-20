public class leetcode50 {
    boolean makeEqual(String s[])
    {
        int frequency[]=new int[26];
        for(int i=0;i<s.length;i++)
        {
            String word=s[i];
            for(int j=0;j<word.length();j++)
            {
                char ch=word.charAt(j);
                int index=(int )(ch-97);
                frequency[index]=frequency[index]+1;
            }
        }
        for(int i=0;i<26;i++)
        {
            if((frequency[i]%s.length)!=0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s[]={"aabb","bbaa","cccc","abcd"};
        String s1[]={"abc","aabc","bc"};
        leetcode50 obj =new leetcode50();
        System.out.println(obj.makeEqual(s));
        System.out.println(obj.makeEqual(s1));

        
    }
}
