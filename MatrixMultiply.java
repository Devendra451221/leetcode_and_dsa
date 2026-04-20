class MatrixMultiply
{
    public static void main(String[] args) {
     int a[][]={{2,4},{2,6}};
     int b[][]={{1,2,3,4},{5,6,7,8}};
     int i1=a.length,j1=a[0].length,i2=b.length,j2=b[0].length;
     if(j1!=i2)
     {
       System.out.println("Not Possible");
     }else{
      int c[][]=new int[i1][j2];
      int i=0,j=0,k=0;
      for(i=0;i<i1;i++)
      {
        for(j=0;j<j2;j++)
        {
          for(k=0;k<i2;k++)
          {
            c[i][j]+=a[i][k]*b[k][j];
          }
        }
      }
      for(int m[]:c)
      {
        for(int n:m) 
        {
          System.out.print(n+" ");
        }
        System.out.println();
      }
     }
    }

}