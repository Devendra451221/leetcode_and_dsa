public class leetcode74 {
    Listnode removeMiddleoFLL(Listnode l)
    {
        if( l==null || l.nxt==null)
        {
            return null;
        }
        Listnode slow=l;
        Listnode fast=l.nxt;
        Listnode prevofslow=null;

        while (fast!=null && fast.nxt!=null) {
            fast=fast.nxt.nxt;
            prevofslow=slow;
            slow=slow.nxt;
        }

        prevofslow.nxt=prevofslow.nxt.nxt;
        return l;
    }
    public static void main(String[] args) {
        Listnode l1  = new Listnode(9);
        Listnode l11 = new Listnode(6);
        Listnode l12 = new Listnode(7);
        Listnode l13 = new Listnode(3);
        Listnode l14 = new Listnode(1);
      
        l1.nxt = l11;
        l11.nxt = l12;
        l12.nxt = l13;
        l13.nxt = l14;
        l14.nxt=null;

        leetcode74 obj=new leetcode74();
        Listnode ans=obj.removeMiddleoFLL(l1);
        while (ans!=null) {
            System.out.print(ans.dta+" ");
            ans=ans.nxt;
        }
    }
}
