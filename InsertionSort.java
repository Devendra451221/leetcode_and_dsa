public class InsertionSort {
    private static void sort(int a[]){
        if(a.length==1){
            return;
        }
        int n=a.length;
        for(int i=1;i<n;i++){
            int j=i-1;
            int key=a[i];
            while (j>=0 && (key < a[j])) {
                a[j+1] = a[j];
                j--;
            }
            a[j+1]=key;
        }
    }
    public static void main(String[] args) {
        int a[]={7,2,91,77,3,0};
        sort(a);
        for(int i:a){
            System.out.print(i+" ");
        }
    }
}
