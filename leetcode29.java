 class leetcode29 {
  int maxSubArray(int a[])
  {
    int curr=a[0];
    int max=a[0];
    for(int i=1;i<a.length;i++)
    {
        if((curr+a[i])>a[i])
        {
            curr+=a[i];
        }
        else 
        {
            curr=a[i];
        }
        max=Math.max(curr, max);
    }
    return max;
  }    
  public static void main(String[] args) {
   //int a[]={7,-3,8,6,-10,-1,4,7,2};
    int b[]={-2,1,-3,4,-1,2,1,-5,4};
    int c[]={7,3,-5,-10,20,3,7,-6,10};
    leetcode29 obj=new leetcode29();
    System.out.println(obj.maxSubArray(b));
  }
}
