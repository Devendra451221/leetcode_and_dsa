import java.util.Stack;

public class leetcode46 {
     String removeDuplicateLetters(String s)
     {
        int LastIndex[]=new int[26];
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            int index=(int)(ch-97);

            LastIndex[index]=i;
        }

        boolean present[]=new boolean[26];

        Stack<Character> st=new Stack<>();

        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            int index=(int )(ch-97);

            if(present[index]==false)
            {
                while (st.size()>0 && st.peek()>ch && LastIndex[(int)st.peek()-97]>LastIndex[index]) {
                    
                    present[(int )st.peek()-97]=false;
                    st.pop();
                }
                st.push(ch);
                present[index]=true;
            }
        }
        StringBuilder ans=new StringBuilder("");
        while (!st.isEmpty()) {
            ans.append(st.pop());
        }
        return ans.reverse().toString();
     }    
     public static void main(String[] args) {
        String s="cbacdcbc";
        leetcode46 obj=new leetcode46();
        System.out.println(obj.removeDuplicateLetters(s));
     }
}
