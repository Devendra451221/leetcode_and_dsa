class leetcode10
{
   static int seriesSum(int a[])
    {
        
        int n=a.length;
        return ((n+1)*n)/2;
    }
    int missing(int a[])
    {
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            sum+=a[i];
        }
        int sum1=seriesSum(a);
        if(sum1==sum)
        {
            System.out.println("NULL");
        }
        else
        {
            return sum1-sum;
        }
        return -1;
    }
    public static void main(String[] args) {
        int a[]={0,2,4,5,1};
        leetcode10 obj=new leetcode10();
        System.out.println("SeriesSum = "+seriesSum(a));
        System.out.println("Missing : "+obj.missing(a));
    }
}