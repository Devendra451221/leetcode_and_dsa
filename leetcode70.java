public class leetcode70 {
    public boolean isLLinLoop(Listnode l)
    {
        if(l==null||l.nxt==null) return false;
        Listnode slow=l;
        Listnode fast=l.nxt.nxt;

        while (fast!=null&&fast.nxt!=null){
           
            slow=slow.nxt;
            fast=fast.nxt.nxt;
            if(slow==fast)
            {
                return true;
            }
             
        }
        return false;
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
        l14.nxt=l12;

        leetcode70 obj=new leetcode70();
        System.out.println(obj.isLLinLoop(l1));
     }
}
