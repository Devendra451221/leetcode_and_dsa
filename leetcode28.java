class leetcode28
{
  void swap(int a[],int low,int high)
  {
    a[low]=a[low]^a[high];
    a[high]=a[low]^a[high];
    a[low]=a[low]^a[high];
  }
  void dutchFlagAlgorithm(int a[])
  {
    int l=0;
    int mid=0;
    int h=a.length-1;
    while (mid<=h) {
      if(a[mid]==0)
      {
        swap(a,mid,l);
        l++;
        mid++;  
      }
      else if(a[mid]==1)
      {
        mid++;
      }
      else
      {
        swap(a,mid,h);
        h--;
      }
    }
    System.out.println("Array :");
    for(int i:a)
    {
      System.out.print(i+" ");
    }
  }
  public static void main(String[] args) {
  int a[]={0,1,1,2,1,0};
   leetcode28 d=new leetcode28();
   d.dutchFlagAlgorithm(a);
    
  }
}