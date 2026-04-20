class leetcode33 {
 int leftbigindices(int a[])
 {
    int i=-1;
    int l=0;
    int h=a.length-1;
    while (l<=h) {
        int mid=(l+h)/2;
        if(a[mid]<0)
        {
            i=mid;
            l=mid+1;
        }
        else 
        {
           h=mid-1;    
        }
        
        
    }
    return i;
 }    
 int rightminimumindices(int a[])
 {
    int i=-1;
    int l=0;
    int h=a.length-1;
    while (l<=h) {
        int mid=(l+h)/2;
        if(a[mid]>0)
        {
            i=mid;
            h=mid-1;
        }
        else
        {
            l=mid+1;
        }
    }
    return i;
 }
 int indexfinal(int a[])
 {
    int left=leftbigindices(a)+1;
    int right=(a.length)-rightminimumindices(a);
    return Math.max(left, right);
 }
 public static void main(String[] args) {
    int a[]={-4,-3,-1,0,0,0,1,3,7,8};
    leetcode33 obj=new leetcode33();
    System.out.println(obj.indexfinal(a));
 }
}
