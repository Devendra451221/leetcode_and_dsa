public class leetcode16 {
       int arr(int a[])
       {
        int max,smax;
        max=smax=-1;
        int maxid=-1;
        for(int i=0;i<a.length;i++)
        {
           if(a[i]>max)
            { 
                smax=max;
                max=a[i];
                maxid=i;
            }
            else if(smax<a[i])
            {
                smax=a[i];
            }
        }
        return maxid;           
   
       }    
       public static void main(String[] args) {
        int a[]={3,8,4,0};
        leetcode16 obj=new leetcode16();
       System.out.println(" "+obj.arr(a));
       }

}
