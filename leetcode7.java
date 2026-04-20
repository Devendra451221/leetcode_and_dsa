import java.util.ArrayList;
import java.util.List;
class leetcode7
{
  List<Integer> list(int a[],int k)
  {
    int n1;
    int n2;
    int i=a.length-1;
    int c=0;
    List<Integer>l=new ArrayList<>();
    while (i>=0||k>0) {
      n1=0;
      n2=k%10;
       c=0;
      if(i>=0)
      {
        n1=a[i];
      }
      int sum=n1+n2+c;
      c=sum/10;
      int ans=sum%10;
      k=k/10;
      i--;
      l.add(ans);
    }
     if(c>0) {
      l.add(c);
    }
    return l.reversed();
  }
  public static void main(String[] args) {
    int a[]={9,6,1};
    int k=532;
    leetcode7 obj=new leetcode7();
    List<Integer>l1=obj.list(a, k);
    System.out.println(l1);  
  }
}
