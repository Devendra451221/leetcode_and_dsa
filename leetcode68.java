
public class leetcode68 {
    Listnode removeNthFromEnd(Listnode l,int n)
    {
       if(l==null)
       {
         return null;
       }
       Listnode slow=l;
       Listnode fast=l;
       while (n>0) {
        fast=fast.nxt;
        n--;
       }
       if(fast==null)
       {
         return l.nxt;
       }
       while (fast.nxt!=null) {
         slow=slow.nxt;
         fast=fast.nxt;
       }
       slow.nxt=slow.nxt.nxt;
       return l;
    }
    public static void main(String[] args) {
          Listnode l1 = new Listnode(1);
        Listnode l11 = new Listnode(2);
        Listnode l12 = new Listnode(3);
        Listnode l13 = new Listnode(4);
        Listnode l14 = new Listnode(5);
      
        l1.nxt = l11;
        l11.nxt = l12;
        l12.nxt = l13;
        l13.nxt = l14;
        l14.nxt=null;

        leetcode68 obj=new leetcode68();
        Listnode ans=obj.removeNthFromEnd(l1, 5);
        while(ans!=null)
        {
            System.out.print(ans.dta+" ");
            ans=ans.nxt;
        }
    }
}
