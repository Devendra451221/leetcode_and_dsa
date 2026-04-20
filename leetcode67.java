class Listnode {
    int dta;
    Listnode nxt;

    Listnode(int dta) {
        this.dta = dta;
    }

    Listnode(int dta, Listnode nxt) {
        this.dta = dta;
        this.nxt = nxt;
    }

    Listnode() {
        super();
    }
}
public class leetcode67 {
   public static int sizeofLL(Listnode head)
   {
      Listnode p=head;
      int count=0;
      while (p!=null) {
        count++;
        p=p.nxt;
      }
      return count;
   }
   Listnode getIntersectNode(Listnode l1,Listnode l2)
   {
       if(l1==null||l2==null)
       {
         return null;
       } 
       Listnode p1=l1;
       Listnode p2=l2;
       int diff= sizeofLL(p1)-sizeofLL(p2);
       if(diff>0)
       {
         while (diff>0) {
            p1=p1.nxt;
            diff--;
         }
       }else{
        while (diff<0) {
            p2=p2.nxt;
            diff++;
        }
       }
       while (p1!=p2) {
         p1=p1.nxt;
         p2=p2.nxt;
       }
       return p1;
   }
    public static void main(String[] args) {
        Listnode l11 = new Listnode(1);
        Listnode l12 = new Listnode(2);
        Listnode l13 = new Listnode(3);
        
        Listnode lc1 = new Listnode(4);
        Listnode lc2 = new Listnode(5);

        Listnode l21 = new Listnode(11);
        Listnode l22= new Listnode(12);
        
        l11.nxt=l12;
        l12.nxt=l13;
        l13.nxt=lc1;
        
        lc1.nxt=lc2;
        lc2.nxt=null;  

        l21.nxt=l22;
        l22.nxt=lc1;

        leetcode67 obj=new leetcode67();
        System.out.println("List intersecting at node with dta : "+obj.getIntersectNode(l11, l21).dta);
      
   }
}
