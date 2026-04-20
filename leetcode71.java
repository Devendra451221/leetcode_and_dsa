public class leetcode71 {
    public Listnode isInLoopLL(Listnode l)
    {
        if(l==null || l.nxt==null)
        {
            return null;
        }
        Listnode slow=l;
        Listnode fast=l;

        
        while (fast!=null&&fast.nxt!=null) {
            slow=slow.nxt;
            fast=fast.nxt.nxt;
            if(slow==fast)
            {
                break;
            }
        }
        if(slow==fast){
        Listnode loopStart=l;
        while (loopStart!=slow) {
            loopStart=loopStart.nxt;
            slow=slow.nxt;
        }
         return loopStart;
        }else{
            return null;
        }
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
        l14.nxt=l11;

        leetcode71 obj=new leetcode71();
        Listnode ans=obj.isInLoopLL(l1);
        if(ans!=null) System.out.println("The dta where loop starts is : "+ans.dta);
        else System.out.println(ans);
    }
}
