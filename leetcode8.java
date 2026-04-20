public class leetcode8 {
    int result(int a[])
    {
        int max,smax;
        max=-1;
        smax=-1;
        for(int i=0;i<a.length;i++)
        {
           if(max<a[i])
           {
            smax=max;
            max=a[i];
           }
           else if(smax<a[i])
           {
             smax=a[i];
           }
        }
        return (max-1)*(smax-1);
    }
    public static void main(String[] args) {
        int a[]={2,7,6,0,8};
        leetcode8 obj=new leetcode8();
        System.out.println(" result : "+obj.result(a));
    }
    
}
