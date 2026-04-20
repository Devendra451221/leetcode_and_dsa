// Rearrange elements by sign !!!
public class leetcodeExtra2 {
    
    int[] posAndneg(int a[]){
        int arr[]=new int[a.length];
        int pos=0;
        int neg=1;
        for(int i=0;i<a.length;i++){
            if(a[i]>0){
                arr[pos]=a[i];
                pos+=2;
            }else{
                arr[neg]=a[i];
                neg+=2;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int a[]={3,1,-2,-5,2,-4};
        leetcodeExtra2 obj=new leetcodeExtra2();
        for(int i:obj.posAndneg(a)){
            System.out.print(i+" ");
        }
    }
    
}
