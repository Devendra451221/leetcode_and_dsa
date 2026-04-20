public class leetcode69 {
   void removeParticularNode(Listnode p)
   {
     Listnode t=p.nxt;
     p.dta=t.dta;
     p.nxt=t.nxt;
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

        leetcode69 obj=new leetcode69();
        obj.removeParticularNode(l13);
        while (l1!=null) {
            System.out.print(l1.dta+" ");
            l1=l1.nxt;
        }
    }
}
