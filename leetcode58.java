public class leetcode58 {
    int [][]spiralMatrix(int n)
    {
        int a[][]=new int[n][n];
        int count=1;
        int lrb=0;
        int urb=n-1;
        int lcb=0;
        int ucb=n-1;
        while (count<=(n*n)) {
            //lower row  fixed
           for(int i=lcb;i<=ucb;i++)
           {
              a[lrb][i]=count;
              count++;
           }
           //upper column fixed
           for(int i=(lrb+1);i<=urb;i++)
           {
             a[i][ucb]=count;
             count++;
           }
           //upper row fixed
           for(int i=(ucb-1);i>=lcb;i--)
           {
             a[urb][i]=count;
             count++;
           }
           //lower column fixed
           for(int i=(urb-1);i>=(lrb+1);i--)
           {
             a[i][lcb]=count;
             count++;
           }
           //Shrink the matrix-->>
           lrb++;
           lcb++;
           urb--;
           ucb--;
        }
        return a;
    }
    public static void main(String[] args) {
        int n=4;
        leetcode58 obj=new leetcode58();
        for (int i[] : obj.spiralMatrix(n)) {
            for(int j:i)
            {
                System.out.print(j+" ");
            }
        }
    }
}
