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

public class leetcode66 {
    Listnode oddEvenList(Listnode head)
    {
        Listnode odd=head;
        Listnode even=head.nxt;
        Listnode evenStart=even;
        while ((even!=null && even.nxt!=null)) {
            odd.nxt=odd.nxt.nxt;
            even.nxt=even.nxt.nxt;

            odd=odd.nxt;
            even=even.nxt;
        }
        odd.nxt=evenStart;
        return head;

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

        leetcode66 obj=new leetcode66();
        Listnode ans=obj.oddEvenList(l1);
        while (ans!=null) {
            System.out.print(ans.dta+" ");
            ans=ans.nxt;
        }
    }
}
