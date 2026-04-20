import java.util.Stack;

public class leetcode37 {
   private Stack<Integer>s;
   private Stack<Integer>min;
   leetcode37()
   {
     s=new Stack<>();
     min=new Stack<>();
   }
   public void push(int n)
   {
     if(s.size()==0)
     {
       min.push(n);
     }
     else if(min.peek()>=n) 
     {
        min.push(n);
     }
     s.push(n);
   }
   public int pop()
   {
       int x1=s.pop();
       int x2=min.peek();
       if(x1==x2)
       {
          min.pop();
       }
       return x1;
   }
   public int getmin()
   {
      return min.peek();
   }
   public static void main(String[] args) {
    int a[]={4,3,2,1};
         leetcode37 obj=new leetcode37();
      for(int i=0;i<a.length;i++)
      {
          obj.push(a[i]);
      }
      System.out.println(obj.getmin());
      System.out.println(obj.pop());
      System.out.println(obj.getmin());
      System.out.println(obj.pop());
      System.out.println(obj.getmin());
      System.out.println(obj.pop());
      System.out.println(obj.getmin());
      System.out.println(obj.pop());
     
     
      
   }
}
