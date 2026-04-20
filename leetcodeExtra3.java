
// Remove Duplicate Elements from Array !!!
public class leetcodeExtra3 {
    int[] removeDuplicate(int a[]){
        int i=0;
        int j=1;
        while (j!=a.length) {
          if(a[i]==a[j]){
            j++;
          }else{
            i++;
            a[i]=a[j];
            j++;
          }
        }
        return a;
    }
    public static void main(String[] args) {
        int a[]={1,1,1,1,2,3,3,4,4};
        leetcodeExtra3 obj=new leetcodeExtra3();
        System.out.println(obj.removeDuplicate(a));
        for(int i:obj.removeDuplicate(a))
        {
            System.out.print(i+" ");
        }
    }
}
