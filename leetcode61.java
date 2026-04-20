import java.util.Stack;
import java.util.LinkedList;
import java.util.List;

public class leetcode61 {
    boolean isPalindroneList(List<Integer>l)
    {
       Stack<Integer> st=new Stack<>();
       for (Integer i : l) {
         st.push(i);
       }
       for(int i=0;i<l.size();i++)
       {
          if(l.get(i)==st.peek())
          {
            st.pop();
          }else{
            return false;
          }
       }
       if(st.isEmpty())
       {
        return true;
       }
       return false;
    }
    public static void main(String[] args) {
        List<Integer>l=new LinkedList<Integer>();
        l.add(1);
        l.add(1);
        l.add(2);
        leetcode61 obj =new leetcode61();
        System.out.println(obj.isPalindroneList(l));
    }
}
