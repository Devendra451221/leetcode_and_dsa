public class leetcode19 {
    int AscendingSubarr(int a[])
    {
        int max=a[0];
        int maxcurr=a[0];
        for(int i=1;i<a.length;i++)
        {
           if(a[i]>=a[i-1])
           {
             maxcurr+=a[i];
           }
           else
           {
              max=Math.max(maxcurr, max);
              maxcurr=a[i];
           }
        }
        max=Math.max(max, maxcurr);
        return max;
    }
    public static void main(String[] args) {
        int a[]={2,3,4,4,4,1,6,7};
        leetcode19 obj=new leetcode19();
        System.out.println("Maximun : "+obj.AscendingSubarr(a));
    }
}
