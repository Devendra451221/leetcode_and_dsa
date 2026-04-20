public class leetcode24 {
    int minRotatedArr(int a[])
    {
      
       if(a.length==1)
          {
            return a[0];
          }
          else if(a[0]<a[a.length-1])
          {
            return a[0];
          }
        int low=0;
       int high=a.length-1;
       while(low<=high)
       {
          int mid=(low+high)/2;
        if(mid!=0&&a[mid-1]>a[mid])
        {
          return a[mid];
        }
        else if(mid!=a.length-1&&a[mid+1]<a[mid])
        {
          return a[mid+1];
        }
         else if(a[low]<=a[mid])
         {
            low=mid+1;
          }
          else
          {
            high=mid-1;
          }

       }
       return -1;
    }
    public static void main(String[] args) {
      int a[]={60,70,10,20,30,40};
      leetcode24 obj=new leetcode24();
      System.out.println(obj.minRotatedArr(a));
    }
    
}
