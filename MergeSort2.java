public class MergeSort2 {
    // it needs two sorted array's
    private static int[] mergeSort(int a[],int b[]){
        int i=0,j=0,k=0;
        int c[]=new int[(a.length+b.length)];
        
        while (i<a.length && j<b.length) {
            if(a[i] < b[j]){
                c[k++]=a[i++];
            }else{
                c[k++]=b[j++];
            }
        }
        while (i<a.length) {
            c[k++]=a[i++];
        }
        while (j<b.length) {
            c[k++]=b[j++];
        }
 
        return c;
        
    }

    public static void main(String[] args) {
        int a1[]={0,3,5,7};
        int a2[]={1,2,4,6};
        int ans[]=mergeSort(a1, a2);
        for(int i:ans){
            System.out.print(i+" ");
        }
    }
    
}
