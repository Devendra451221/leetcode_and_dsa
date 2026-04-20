public class leetcode27 {
    int singleElement(int a[])
    {
        if(a.length==1)
        {
            return a[0];
        }
        if(a[0]!=a[1])
        {
            return a[0];
        }
        if(a[a.length-1]!=a[a.length-2])
        {
            return a[a.length-1];
        }
        else
        {
            int low=0;
            int high=a.length-1;
            while (low<=high) {
                int mid=(low+high)/2;
                if(a[mid]!=a[mid+1]&&a[mid]!=a[mid-1])
                {
                    return a[mid];
                }
                else if((mid&1)!=0)
                {
                    if(a[mid]==a[mid-1])
                    {
                        low=mid+1;
                    }
                    else
                    {
                        high=mid-1;
                    }
                }
                else
                {
                    if(a[mid]==a[mid+1])
                    {
                      low=mid+1;
                    }
                    else
                    {
                          high=mid-1;
                    }
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int a[]={1,1,2,3,3,4,4};
        leetcode27 obj=new leetcode27();
        System.out.println(obj.singleElement(a));
    }
    
}
