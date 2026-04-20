public class leetsheet19 {
    Listnode middleNodeOfLL(Listnode l){
        if(l==null || l.nxt==null){
            return l;
        }

        Listnode s=l;
        Listnode f=l;

        while (f!=null && f.nxt!=null) {
            s=s.nxt;
            f=f.nxt.nxt;
        }
        return s;
    }
    public static void main(String[] args) {
    Listnode l1=new Listnode(4);
    Listnode l11=new Listnode(3);
    Listnode l12=new Listnode(1);
    Listnode l13=new Listnode(9);
    //Listnode l14=new Listnode(45);

    l1.nxt=l11;
    l11.nxt=l12;
    l12.nxt=l13;
    //l13.nxt=l14;


        leetsheet19 obj = new leetsheet19();
 
        Listnode ans = obj.middleNodeOfLL(l1);
        while (ans!=null) {
            System.out.print(ans.dta+" ");
            ans=ans.nxt;
        }
    }
}
