import java.util.Stack;

public class leetcode49 {
   String decodeString(String s)
   {
      Stack<Integer> num=new Stack<>();
      Stack<String> mainst=new Stack<>();

      for(int i=0;i<s.length();i++)
      {

        char ch=s.charAt(i);
        if(ch>='0'&&ch<='9')
        {
            int n=0;
            while (i<s.length() && s.charAt(i)>='0' && s.charAt(i)<='9' ) {
                n=n*10+(int)(s.charAt(i)-'0');
                i++;
            }
            i--;
            num.push(n);
        }
        else if(ch!=']')
        {
            mainst.push(ch+"");
         
        }
        else
        {
            String str="";
            while (!mainst.peek().equals("[")) {
                str=mainst.pop()+str;
            }
            mainst.pop();

            int repeatno = num.pop();
            StringBuilder sb=new StringBuilder("");
            while(repeatno>0)
            {
                sb.append(str);
                repeatno--;
            }
            mainst.push(sb.toString());
        }

      }
      String answer = "";
      while (mainst.size()>0) {
        answer = mainst.pop()+answer;
      }
      return answer;
   }   
   public static void main(String[] args) {
    String s="03[a2[c]]";
    String str="02[abc]3[cd]ef";
    leetcode49 obj=new leetcode49();
    System.out.println(obj.decodeString(str));
   }
}
