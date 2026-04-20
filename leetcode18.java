public class leetcode18 {
    boolean triplet(int a[])
    {
      int i=Integer.MAX_VALUE;
      int j=Integer.MAX_VALUE;
      int k=Integer.MAX_VALUE;
      for(int y=0;y<a.length;y++)
      {
        int x=a[y];
        if(i>=x)
        {
            i=x;
        }
        else if(j>=x)
        {
            j=x;
        } 
        else 
        {
          k=x;
          System.out.println(i+" "+j+" "+k);
          return true;   
        }
      }
      return false;
    }
    public static void main(String[] args) {
        int a[]={20,100,10,12,5,13};
        
        //System.out.println(b);
        leetcode18 obj=new leetcode18();
        System.out.println("Trio : "+obj.triplet(a));
    }
}
