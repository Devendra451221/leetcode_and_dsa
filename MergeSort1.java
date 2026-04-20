public class MergeSort1 {
    private static void mergeSort(int a[],int l,int h){
        if(l<h){
            int mid = l+((h-l)/2);
            mergeSort(a, l, mid);
            mergeSort(a, mid+1, h);
            sort(a, l, mid, h);
        }
        return;
    }
    private static void sort(int a[],int l,int mid,int h){
        int i=l,k=l;
        int j=mid+1;
        int temp[]=new int[h+1];
        while (i<=mid && j<=h) {
            if(a[i] < a[j]){
               temp[k++]=a[i++];
            }else{
                temp[k++]=a[j++];
            }
        }
        while (i<=mid) {
            temp[k++]=a[i++];
        }
        while (j<=h) {
            temp[k++]=a[j++];
        }

        // copry arr temp back into a
        System.arraycopy(temp, l, a, l, (h-l)+1);
    }
    public static void main(String[] args) {
        int a[]={6,4,2,1,9,8,3,5};
        mergeSort(a, 0, a.length-1);
        for(int i:a){
            System.out.print(i+" ");
        }
    }
}
