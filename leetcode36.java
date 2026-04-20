public class leetcode36 {
    double avgSalary(int a[])
    {
        int max=a[0];
        int min=a[0];
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            if(max<a[i]) 
            {
                max=a[i];
            }
            if(min>a[i]) 
            {
                min=a[i];
            }
            sum+=a[i];
        }
        double avgSalary=((sum-max-min)/(a.length-2));
        return avgSalary;
    }
    public static void main(String[] args) {
        int a[]={1000000,4000000,1250000,1620000};
        leetcode36 obj=new leetcode36();
        System.out.println(obj.avgSalary(a));
    }
}
