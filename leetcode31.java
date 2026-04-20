import java.util.ArrayList;
class leetcode31 {
 
    void indicesoftarget(int a[],int t)
    {
      int lessthant=0;
      int ntarget=0; 
      for(int i:a)
      {
        if(i==t)
        {
            ntarget++;
        }
        else if(i<t)
        {
            lessthant++;
        }
      }  
      ArrayList<Integer>list=new ArrayList<>();
      while (ntarget!=0) {
        list.add(lessthant);
        lessthant++;
        ntarget--; 
      }
      System.out.println(list);
    }
    public static void main(String[] args) {
        int a[]={1,2,2,5,3,4,1,3};
         leetcode31 obj=new leetcode31();
         obj.indicesoftarget(a, 2);
    }
}
