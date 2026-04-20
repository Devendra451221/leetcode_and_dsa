import java.util.Stack;

public class leetcode73 {
    public static int sizeofLL(Listnode l)
    {
        int count=0;
        while(l!=null)
        {
            count++;
            l=l.nxt;
        }
        return count;
    }
    public  static Listnode reverseLL(Listnode l)
    {
        Listnode curr=l;
        Listnode t=null;
        Listnode pre=null;

        while(curr!=null)
        {
            t=curr.nxt;
            curr.nxt=pre;
            pre=curr;
            curr=t;
        }
        return pre;
    }
    int[] nxtGreater(Listnode l)
    {
        int ans[]=new int[leetcode73.sizeofLL(l)];
        Listnode l1=leetcode73.reverseLL(l);
        Stack<Integer> st=new Stack<>();
        st.push(l1.dta);
        l1=l1.nxt;
        int p=ans.length-2;

        while (p>=0) {
            int dta=l1.dta;
            l1=l1.nxt;

            while(st.size()>0 && st.peek()<=dta)
            {
                st.pop();
            }
            if(st.size()==0)
            {
                 ans[p]=0;
            }
           else if(st.peek()>dta)
            {
               ans[p]=st.peek();
            }
           
          st.push(dta);
            p--;
        }
        return ans;
    } 
    public static void main(String[] args) {
        Listnode l1  = new Listnode(9);
        Listnode l11 = new Listnode(6);
        Listnode l12 = new Listnode(7);
        Listnode l13 = new Listnode(3);
        Listnode l14 = new Listnode(1);
        Listnode l15 = new Listnode(4);
      
        l1.nxt = l11;
        l11.nxt = l12;
        l12.nxt = l13;
        l13.nxt = l14;
        l14.nxt = l15;
        l15.nxt = null;

        leetcode73 obj=new leetcode73();
        for (int ans : obj.nxtGreater(l1)) {
            System.out.print(ans+" ");
        }
    }
}
