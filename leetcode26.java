public class leetcode26 {
    int binarySearch(int a[],int num)
    {
        int low=0;
        int high=a.length-1;
        while (low<=high){
            int mid=(low+high)/2;
              if(a[mid]==num)
              {
                return mid;
              }
              else if(a[mid]<num)
              {
                low=mid+1;
              }
              else 
              {
                high=mid-1;
              }
        }
        return low;
    }
    public static void main(String[] args) {
        int a[]={1,2,4,5};
        int n=3;
        leetcode26 obj=new leetcode26();
        System.out.println(obj.binarySearch(a, n));
    }
}
