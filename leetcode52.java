public class leetcode52 {
    boolean isPalindrone(String s)
    {
        if(s.length()==1)
        {
            return true;
        }
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch>=97&&ch<=122)
            {
                sb.append(ch);
            }else if(ch>=65&&ch<=90)
            {
                sb.append((char)(ch+32));
            }else if(ch>='0' && ch<='9')
            {
                sb.append(ch);
            }
        }
        StringBuilder sb1=new StringBuilder("");
        sb1.append(sb);
        sb.reverse();

        if(sb1.toString().equals(sb.toString()))
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
    String s="A man, a plan, a canal : Panama";
    String s1="race a car";
    String s2="MARKRAM";
    leetcode52 obj=new leetcode52();
    System.out.println(obj.isPalindrone(s));
}    
}
