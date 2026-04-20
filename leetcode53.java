import java.util.Stack;

class leetcode53
{
    boolean parenthesisMatch(String s)
    {
      Stack<Character> st=new Stack<>();
      for(int i=0;i<s.length();i++)
      {
        char ch=s.charAt(i);
        if(ch=='('||ch=='{'||ch=='[')
        {
            st.push(ch);
        }else if(ch==')'||ch=='}'||ch==']')
        {
            if(st.isEmpty())
            {
                return false;
            }
            char popped=st.pop();
            if(!match(popped, ch))
            {
                return false;
            }
        }
      }
      if(!st.isEmpty())
      {
        return false;
      }
      return true;
    }
    boolean match(char a,char b)
    {
       if(a=='('&&b==')')
       return true;
       else if(a=='{'&&b=='}')
       return true;
       else if(a=='['&&b==']')
       return true;
       else 
       return false;
    }
    public static void main(String args[])
    {
        String s="[{()}]";
        leetcode53 obj=new leetcode53();
        System.out.println("Is Parenthesis Matched : "+obj.parenthesisMatch(s));
    }
}