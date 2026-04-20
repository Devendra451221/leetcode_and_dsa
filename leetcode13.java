public class leetcode13 {
    void sum2(int a[],int t)
    {
        int i,j;
        i=0;
        j=a.length-1;
        while(i<=j)
        {
            int sum=a[i]+a[j];
            if(sum==t){
               System.out.println("["+(i+1)+","+(j+1)+"]");
               break;
            }
            else if(sum<t){
             i++;
            }
            else
            {
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int a[]={-1,0};
        int t=-1;
        leetcode13 obj=new leetcode13();
        obj.sum2(a,t);
    }
}
