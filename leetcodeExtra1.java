// Move all zeroes to end !!! (without another array)
public class leetcodeExtra1 {
        int[] sol(int a[]){
        int i=0;
        int insrt=0;
        while (i<a.length) {
            if(a[i]!=0){
                a[insrt]=a[i];
                i++;
                insrt++;
            }else{
                i++;
            }
        }
        while (insrt<a.length) {
            a[insrt]=0;
            insrt++;
        }
        return a;
    }
    public static void main(String[] args) {
        int a[]={0,1,5,0,12,0,9};
        leetcodeExtra1 obj=new leetcodeExtra1();
        for(int i:obj.sol(a)){
            System.out.print(i+" ");
        }
    }

}
