public class leetsheet18 {

    boolean isLinkedListCyclePresent(Listnode l){
        if(l==null || l.nxt ==null){
            return false;
        }
        Listnode s = l;
        Listnode f = l.nxt;

        while (f!=null && f.nxt!=null) {
            if(s==f){
                return true;
            }
            s=s.nxt;
            f=f.nxt.nxt;
        }

        return false;
    }
    public static void main(String[] args) {
        Listnode l1 = new Listnode(1);
        Listnode l11 = new Listnode(3);
        Listnode l12 = new Listnode(5);
        Listnode l13 = new Listnode(7);

        l1.nxt = l11;
        l11.nxt = l12;
        l12.nxt = l13;
        l13.nxt = l11;

        leetsheet18 obj=new leetsheet18();
        System.out.println("is Cycle Present : "+obj.isLinkedListCyclePresent(l1));
    }
}
