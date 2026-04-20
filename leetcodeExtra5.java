
public class leetcodeExtra5 {
    // Partition List 
    Listnode partitionList(Listnode l,int target){
        if(l==null){
            return null;
        }
        Listnode d1 = new Listnode(-1);
        Listnode ans1 = d1;
        Listnode d2 = new Listnode(-1);
        Listnode ans2 = d2;

        while (l!=null) {
            if(l.dta <target){
                d1.nxt=l;
                d1=d1.nxt;
            }else{
                d2.nxt=l;
                d2=d2.nxt;
            }
            l=l.nxt;
        }
  
        d2.nxt=null;    // Important !
       
      

        d1.nxt=ans2.nxt;

        return ans1.nxt;
    }
    public static void main(String[] args) {
        Listnode l1 = new Listnode(1);
        Listnode l2 = new Listnode(4);
        Listnode l3 = new Listnode(3);
        Listnode l4 = new Listnode(2);
        Listnode l5 = new Listnode(5);
        Listnode l6 = new Listnode(2);

        l1.nxt = l2;
        l2.nxt = l3;
        l3.nxt = l4;
        l4.nxt = l5;
        l5.nxt = l6;
        l6.nxt = null; // optional, constructor already sets this

        leetcodeExtra5 obj=new leetcodeExtra5();
        Listnode l = obj.partitionList(l1, 3);
        while (l!=null) {
            System.out.print(l.dta+" ");
            l=l.nxt;
        }
    }
}
