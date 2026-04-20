import java.util.PriorityQueue;

public class leetcode35 {
      int kthLargestelmnt(int a[],int k)
      {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        int n=a.length;
        for(int i=0;i<n;i++)
        {
            if(pq.size()<k) 
            {
                pq.add(a[i]);
            }
            else 
            {
                if(pq.peek()<a[i])
                {
                    pq.remove();
                    pq.add(a[i]);
                }
            }
        }
        return pq.peek();
      }   
      public static void main(String[] args) {
        int a[]={3,2,1,5,6},k=2;
        leetcode35 obj=new leetcode35();
        System.out.println(obj.kthLargestelmnt(a, k));
      }
    }

