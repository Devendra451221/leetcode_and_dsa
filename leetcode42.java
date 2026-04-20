import java.util.Collections;
import java.util.PriorityQueue;
public class leetcode42 {
    int stoneGame(int a[])
    {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
         for(int i:a)
         {
            pq.add(i);
         }
         while (pq.size()>1) {
            int max=pq.remove();
            int smax=pq.remove();
            int newstone=max-smax;
            if(newstone!=0)
            {
                pq.add(newstone);
            }
         }
         if(pq.isEmpty())
         {
            return 0;
         }
         else 
         {
            return pq.peek();
         }
    }
    public static void main(String[] args) {
        int a[]={8,7,2,4,6};
        leetcode42 obj=new leetcode42();
        System.out.println(obj.stoneGame(a));
    }
    
    
}
