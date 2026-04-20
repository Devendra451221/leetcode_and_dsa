public class leetcode25 {
    int peakElement(int a[])
    {
        int low=0;
        int high=a.length-1;
        if(a[low]>a[low+1])
            return low;
        if(a[high]>a[high-1])
            return high;
        else
        {
            low++;
            high--;
            while(low<=high)
            {
                int mid=(low+high)/2;
                if(a[mid]>a[mid+1]&&a[mid]>a[mid-1])
                {
                    return mid;
                }
                else if(a[mid]<a[mid+1])
                {
                    low=mid+1;
                }
                else 
                {
                    high=mid-1;
                }
            }
        }   
        return -1;     
    }
    public static void main(String[] args) {
        int a[]={1,2,1,4,5,6,0};
        leetcode25 obj=new leetcode25();
        System.out.println(obj.peakElement(a));
    }
}
