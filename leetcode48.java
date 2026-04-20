public class leetcode48 {
    int stringCompression(char s[])
    {
        int count =1;
        StringBuilder sb=new StringBuilder("");
        sb.append("a");
        
        for(int i=1;i<s.length;i++)
        {
            if(s[i-1]!=s[i])
            {
               if(count>1)
               {
                 sb.append(count+"");
               }
               sb.append(s[i]);
               count=1;
            }
            else
            {
                count++;
            }
        }
        if(count>1)
        {
            sb.append(count+"");
        }
        for(int i=0;i<sb.length();i++)
        {
            s[i]=sb.charAt(i);
        }
        return sb.length();
    }
    public static void main(String[] args) {
        char ch[]={'a','b','c'};
        leetcode48 obj=new leetcode48();
      System.out.println(obj.stringCompression(ch));
    }

}
