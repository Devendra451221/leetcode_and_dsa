import java.util.Arrays;

class leetcode32 {
  static void MaxNumberString(int a[])
  {
    String s1[]=new String[a.length];
    for(int i=0;i<a.length;i++)
    {
        s1[i]=a[i]+"";
    }
    Arrays.sort(s1,(s2,s3)->(s2+s3).compareTo(s3+s2));
    StringBuilder sb=new StringBuilder("");
    for(int i=s1.length-1;i>=0;i--)
    {
        sb.append(s1[i]);
    }
     System.out.println(sb);
  }    
  public static void main(String[] args) {
    int a[]={2,13,3,4};
    MaxNumberString(a);
  }
}
