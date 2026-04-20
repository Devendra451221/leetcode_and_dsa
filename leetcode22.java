public class leetcode22 {
  
     int firstOcurr(int a[],int num)
     {
        int result=-1;
        int low=0;
        int high=a.length-1;
        while (low<=high){
            int mid=(low+high)/2;
              if(a[mid]==num)
              {
                result=mid;
                high=mid-1;
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
        return result;  
     }
     int lastOccur(int a[],int num)
     {
        int result=-1;
        int low=0;
        int high=a.length-1;
        while (low<=high){
            int mid=(low+high)/2;
              if(a[mid]==num)
              {
                result=mid;
                low=mid+1;
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
        return result;  
     }
    int[] range(int a[], int n) {
    int ans[] = {-1, -1};
    if (a.length == 0) {
        return ans;
    }
    ans[0] = firstOcurr(a, n);  // store first occurrence
    ans[1] = lastOccur(a, n);   // store last occurrence
    return ans;
}

    public static void main(String[] args) {
        int a[]={1,2,2,2,3,4,6};
        int n=3;
        leetcode22 obj=new leetcode22();
       // System.out.println(obj.firstOcurr(a, n));
        //System.out.println(obj.lastOccur(a, n));
       int ans[]=obj.range(a, n);
       for(int i=0;i<ans.length;i++)
       {
        System.out.print(ans[i]);
       }
    }
}
