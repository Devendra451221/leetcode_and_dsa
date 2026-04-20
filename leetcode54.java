import java.util.Stack;

public class leetcode54 {
    int parenthesis(String s)
    {
       Stack<Character>st=new Stack<>();
       int count=0;
       for(int i=0;i<s.length();i++)
       {
         char ch=s.charAt(i);
         if(ch=='(')
         {
            st.push(ch);
         }
         else
         {
            if(st.isEmpty())
            {
               count++;
            }else{
            st.pop();
            }
         }
       }
      
       if(st.isEmpty())
        return st.size()+count;
       else
        return st.size()+count;
    }
    public static void main(String[] args) {
        String s="()()((";
        String s1="))((";
        leetcode54 obj=new leetcode54();
        System.out.println(obj.parenthesis(s));
    }
}
