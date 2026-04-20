public class leetcode45 {
    int lastwordlength(String s)
    {
        int count=0;
        for(int i=s.length()-1;i>=0;i--)
        {
            char ch=s.charAt(i);
           /*  if(ch!=32)
            {
              count++;
            }
            else if(count!=0&&ch==32)
            {
                break;
            }
                */
                if(ch!=32)
                {
                    count++;
                }
                else if(count!=0)
                {
                    break;
                }
        }
        return count;
    }
    public static void main(String[] args) {
        String s="Ram Ram";
        leetcode45 obj=new leetcode45();
        System.out.println(obj.lastwordlength(s));
    }
}
