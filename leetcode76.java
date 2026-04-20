import java.util.PriorityQueue;

public class leetcode76 {
    Listnode mergeKSortedList(Listnode[] list){
        if(list==null){
            return null;
        }else if(list.length==1){
            return list[0];
        }

        PriorityQueue<Listnode> pq=new PriorityQueue<>((a,b)->(a.dta-b.dta));

        for(int i=0;i<list.length;i++){
          
            Listnode ithnode=list[i];
            while (ithnode!=null) {
                pq.add(ithnode);
                ithnode=ithnode.nxt;
            }
        }

        Listnode d=new Listnode(-1);
        Listnode ans=d;
        while (!pq.isEmpty()) {
            d.nxt=pq.poll();
            d=d.nxt;
        }
        return ans.nxt;
    }
    public static void main(String []args){
         Listnode l1 = new Listnode(1);
        Listnode l11 = new Listnode(4);
        Listnode l12 = new Listnode(5);
        
         Listnode l2 = new Listnode(1);
        Listnode l21 = new Listnode(3);
        Listnode l22 = new Listnode(4);

         Listnode l3 = new Listnode(2);
        Listnode l31 = new Listnode(6);
    
        l1.nxt = l11;
        l11.nxt = l12;
        l12.nxt = null;

        l2.nxt = l21;
        l21.nxt = l22;
        l22.nxt = null;

        l3.nxt = l31;
        l31.nxt = null;

        Listnode[] list={l1,l2,l3};
 
        leetcode76 obj=new leetcode76();
        
        Listnode ans=obj.mergeKSortedList(list);
        while (ans!=null) {
            System.out.print(ans.dta+" ");
            ans=ans.nxt;
        }

    }
}
