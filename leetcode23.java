public class leetcode23{
    int RotatedSortedArr(int a[],int key)
    {
      int low=0;
      int high=a.length-1;
      while(low<=high)
      {
        int mid=(low+high)/2;
        if(a[mid]==key)
        {
            return mid;
        }
        else if(a[low]<=a[mid]) //1st part is sorted
        {
            if(key>=a[low]&&key<a[mid])
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        else //2nd part is sorted
        {
           if(key>a[mid]&&key<=a[high])
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
        int a[]={5,6,7,8,1,2,3};
        int key=2;
        leetcode23 obj=new leetcode23();
        System.out.println(obj.RotatedSortedArr(a, key));
    }
}
