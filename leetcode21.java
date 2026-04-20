public class leetcode21 {
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
        return -1;
    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int n=2;
        leetcode21 obj=new leetcode21();
        System.out.println(obj.binarySearch(a, n));
    }
}
