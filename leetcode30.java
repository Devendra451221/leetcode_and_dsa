class leetcode30 {
   int TrappingRainWater(int a[])
   {
     int n=a.length;
     int left[]=new int[n];
     left[0]=a[0];
     for(int i=1;i<n;i++)
     {
        left[i]=Math.max(left[i-1], a[i]);
     }
     int right[]=new int[n];
     right[n-1]=a[n-1];
      for(int i=n-2;i>=0;i--)
      {
        right[i]=Math.max(right[i+1], a[i]);
      }    
      
      int water=0;
      for(int i=0;i<n;i++)
      {
        water+=(Math.min(left[i],right[i])-a[i]);
      }
      return water;
    }    
    public static void main(String[] args) {
        int a[]={4,2,0,3,2,5};
        leetcode30 obj=new leetcode30();
        System.out.println(obj.TrappingRainWater(a));
    }
}
