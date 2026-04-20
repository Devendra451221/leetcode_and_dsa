public class leetcode57 {
    int[][] transposeMatrix(int a[][])
    {
        int row=a.length;
        int col=a[0].length;
        int[][] newarr=new int[col][row];
       
           for(int i=0;i<row;i++)
           {
            for(int j=0;j<col;j++)
            {
                newarr[j][i]=a[i][j];
            }
           }
           
    //        for(int i=0;i<newa.length;i++){
    //   for(int j=0;j<newa[0].length;j++){
    //     newa[i][j] = a[j][i];
    //   }
    // }

        return newarr;
    } 
    public static void main(String[] args) {
        int a[][]={{1,2,3,4},{5,6,7,8}};
        leetcode57 obj=new leetcode57();
        for(int i[]:a)
        {
            for(int j:i)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println("Transpose : ");
        for(int i[]:obj.transposeMatrix(a))
        {
            for(int j:i)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
