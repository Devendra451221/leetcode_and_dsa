class Listnode {
    int dta;
    Listnode nxt;
    Listnode(int dta)
    {
        this.dta=dta;
    }
    Listnode(int dta, Listnode nxt)
    {
        this.dta=dta;
        this.nxt=nxt;
    }
    Listnode()
    {
        super();
    }
}

public class leetcode63 {

    // Listnode removeDuplicateListnode(Listnode head)
    // {
  
    //     if(head==null||head.nxt==null)
    //     {
    //         return head;
    //     }

    //     Listnode p=head;
    //     Listnode prep=p;
    //     p=p.nxt;
    //     while (prep.nxt!=null) {

    //         if(p.dta!=prep.dta){
    //         prep=p;
    //         p=p.nxt;
    //         }else{
    //            prep.nxt=p.nxt;
    //            p=p.nxt;
    //         }
    //     }
    //     return head;
    // }
    Listnode rdsl(Listnode l){
    if(l==null){
      return null;
    }
    Listnode d=l;
    Listnode ans = d;
    while (d.nxt!=null) {
      if(d.dta==d.nxt.dta){
        d.nxt=d.nxt.nxt;
      }else{
        d=d.nxt;
      }
    }
    return ans;
  }
    public static void main(String[] args) {
        leetcode63 obj = new leetcode63();
        Listnode l=new Listnode(1);
        Listnode l1=new Listnode(2);
        Listnode l2=new Listnode(2);
        Listnode l3=new Listnode(2);
        Listnode l4=new Listnode(3);
        Listnode l5=new Listnode(3);

        l.nxt=l1;
        l1.nxt=l2;
        l2.nxt=l3;
        l3.nxt=l4;
        l4.nxt=l5;
        l5.nxt=null;
        
        Listnode ans=obj.removeDuplicateListnode(l);
        while (ans!=null) {
            System.out.print(ans.dta+" ");
            ans=ans.nxt;
        }
    }
}
