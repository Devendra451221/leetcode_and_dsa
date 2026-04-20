public class leetcode72 {
   Listnode removefromLL(Listnode l,int dta)
   {
    Listnode d=new Listnode(-1,l);
    Listnode p=d;
    while(p.nxt!=null)
    {
        if(p.nxt.dta==dta)
        {
            p.nxt=p.nxt.nxt;
        }
        else
        {
            p=p.nxt;
        }
    }

   return d.nxt;
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

        leetcode72 obj=new leetcode72();
       Listnode ans=obj.removefromLL(l1, 1);
        while (ans!=null) {
            System.out.print(ans.dta+" ");
            ans=ans.nxt;
        }
    }
}
