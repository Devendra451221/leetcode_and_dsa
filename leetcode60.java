// to rotate image we have to do two things : 
// 1. transpose 
// 2. reverse each row
public class leetcode60 {
    int [][]rotateImageMatrix(int a[][])
    {
        int n=a.length;
        for(int i=0;i<n;i++)
        { 
            for(int j=i;j<n;j++)
            {
                int k=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=k;
            }
        }
        for(int i=0;i<n;i++)
        {
           // int []tempMatrix=a[i];
            reverse(a[i]);
        }
        return a;

    }
    static void reverse(int a[])
    {
        int l=0;
        int h=a.length-1;
        while (l<=h) {
            int t=a[l];
            a[l]=a[h];
            a[h]=t;
            l++;
            h--;
        }
    }
    public static void main(String[] args) {
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        leetcode60 obj=new leetcode60();
        for (int[] i : obj.rotateImageMatrix(a)) {
            for(int j:i)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
