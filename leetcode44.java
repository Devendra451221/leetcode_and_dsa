// a boat can carry only two peoples
import java.util.Arrays;
public class leetcode44{
    int boats(int a[],int limit)
    {
        int l=0;
        int h=a.length-1;
        int boats=0;
        Arrays.sort(a);
        while (l<=h) {
            if((a[l]+a[h])>limit)
            {
                h--;
                boats++;
            }
            else if((a[l]+a[h])<=limit)
            {
                l++;
                h--;
                boats++;
            }
        }
        return boats;
    }
    public static void main(String[] args) {
        int a[]={2,3,9,4,10,11,9,6};
        leetcode44 obj=new leetcode44();
        System.out.println(obj.boats(a, 11));
    }
}
    

