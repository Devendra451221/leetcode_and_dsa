public class QuickSort {
    private static void quickSort(int a[],int l,int h){
     if(l<h){
       int partitionIndex = partition(a,l,h);
       quickSort(a, l, partitionIndex-1);
       quickSort(a, partitionIndex+1, h);   
     }
     return;
    }
    private static int partition(int a[],int l,int h){
      int pivot = a[l];
      int i=l+1;
      int j=h;
      
      do{
        while (i<=h && (pivot >= a[i])) {
            i++;
        }
        while (pivot < a[j]) {
            j--;
        }
        if(i<j){
            swap(a, i, j);
        }
      }while(i<j);

      swap(a, l, j);
      return j;
    }
    private static void swap(int a[],int i,int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public static void main(String[] args) {
        int b[]={35,50,15,25,80,20,90,45};
        int a[]={10,20,30,40,50,60,70};

        quickSort(a, 0, a.length-1);
        for(int i:a){
            System.out.print(i+" ");
        }
    }
}
