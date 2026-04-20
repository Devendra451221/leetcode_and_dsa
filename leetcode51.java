public class leetcode51 {
    int maxrepetativechar(String s)
    {
        int count=1;
        int max=1;
        for(int i=1;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch!=s.charAt(i-1))
            {
                count=1;
                     
            }else{
                count++;
    
            }
           max=Math.max(max, count);
        }
        return max;
    }
    public static void main(String[] args) {
         String s="aabbb";
        leetcode51 obj=new leetcode51();
          System.out.println(obj.maxrepetativechar(s));
    }
}
