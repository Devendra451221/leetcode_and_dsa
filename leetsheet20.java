public class leetsheet20 {
    Listnode reverseLinkedList(Listnode l){
        if(l==null || l.nxt==null){
            return l;
        }

        Listnode curr=l;
        Listnode temp=null;
        Listnode prev=null;

        while (curr!=null){
            temp=curr.nxt;
            curr.nxt=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
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

        leetsheet20 obj=new leetsheet20();
        Listnode ans=obj.reverseLinkedList(l1);
        while (ans!=null) {
            System.out.print(ans.dta+" ");
            ans=ans.nxt;
        }
    }
}
