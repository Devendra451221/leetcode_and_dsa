public class leetcode6 {
    void targetindices(int a[],int target)
    {
        boolean isthere = false;
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if((a[i]+a[j])==target)
                { 
                    isthere=true;
                    System.out.print(" ["+i+","+j+"]");
                }
            }

        }
        if (!isthere) {
            System.out.println("Not found such numbers : ");
        }
    }
    public static void main(String[] args) {
        int a[]={2,4,1,6};
        int target=10;
        leetcode6 obj=new leetcode6();
        obj.targetindices(a, target);
    }
}
