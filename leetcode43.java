public class leetcode43 {
    int pivotIndex(int a[])
    {
        int sum=0;
        for(int i:a)
        {
            sum+=i;
        }
        int r=sum;
        int l=0;
        for(int i=0;i<a.length;i++)
        { 
             r-=a[i];
            if(r==l)
            {
                return a[i];
            }
          
            l+=a[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        int a[]={2,4,2,6,1,7};
        leetcode43 obj=new leetcode43();
        System.out.println(obj.pivotIndex(a));
    }
}
