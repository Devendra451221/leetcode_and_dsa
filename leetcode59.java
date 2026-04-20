class leetcode59
{
    boolean searchMatrix(int a[][],int t)
    {
        int r=0,c=a[0].length-1;
        while (r<a.length && c>=0) {
            if(t==a[r][c])
            {
                return true;
            }else if(t>a[r][c])
            {
                r++;
            }else if(t<a[r][c])
            {
                c--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int a[][]={{2,3,4,5},{7,8,9,11},{16,18,19,24}};
        int t=9;
        leetcode59 obj=new leetcode59();
        System.out.println(obj.searchMatrix(a, t));
    }
}