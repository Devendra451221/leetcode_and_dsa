class Listnode
{
  int dta;
  Listnode nxt;
  Listnode(int dta,Listnode nxt)
  {
    this.dta=dta;
    this.nxt=nxt;
  }
  Listnode(int dta)
  {
    this.dta=dta;
  }
  Listnode()
  {
    super();
  }
}
public class leetcode62 {
    public static void main(String[] args) {
         
         Listnode p2=new Listnode();
          Listnode p3=new Listnode();
           Listnode p4=new Listnode();
            Listnode p5=new Listnode();
             Listnode p6=new Listnode();
        Listnode p=new Listnode();
        Listnode head=new Listnode();
        Listnode p1=new Listnode();
        
       head.dta=1;          
       head.nxt=p;
       
       p.dta=3;
       p.nxt=p1;

        p1.dta=5;
       p1.nxt=p2;

        p2.dta=7;
       p2.nxt=null;

       p3.dta=2;
       p3.nxt=p4;
       
       p4.dta=2;
       p4.nxt=p5;

       p5.dta=4;
       p5.nxt=p6;

        p6.dta=8;
       p6.nxt=null;

       leetcode62 obj=new leetcode62();
       Listnode ans=obj.mergeListnode(head, p3);
       while (ans!=null) {
         System.out.print(ans.dta+" ");
         ans=ans.nxt;
       }
    }
    Listnode mergeListnode(Listnode l1,Listnode l2)
    {
        Listnode p1=l1;
        Listnode p2=l2;
        Listnode d=new Listnode(-1);
        Listnode head=d;
        while (p1!=null && p2!=null) {
            if(p1.dta<p2.dta)
            {
                d.nxt=p1;
                p1=p1.nxt;
                d=d.nxt;
            }
            else 
            {
                d.nxt=p2;
                p2=p2.nxt;
                d=d.nxt;
            }
        }
        if (p1!=null) {
            d.nxt=p1;
       
        }
        if (p2!=null) {
            d.nxt=p2;
        }
        return head.nxt;
    }
}
