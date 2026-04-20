public class BubbleSort {
    private static void sort(int a[]){
        if(a.length==1){
            return;
        }
        int n=a.length;
        boolean isSorted;
        for(int i=0;i<n-1;i++){
            isSorted=true;
            for(int j=0;j<(n-i-1);j++){
              if(a[j+1] < a[j]){
                isSorted=false;
                 swap(a,j,j+1);
              }
            }
            if(isSorted){
                return;
            }
        }
    }
    private static void swap(int a[],int i,int j){
      int temp = a[i];
      a[i] = a[j];
      a[j] = temp;
    }
    public static void main(String[] args) {
        int a[]={7,11,9,2,17,4};
        sort(a);
        for(int i:a){
            System.out.print(i+" ");
        }
    }
}
