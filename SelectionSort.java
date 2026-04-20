import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class SelectionSort {
    private static void sort(int a[]){
      if(a.length==1){
        return;
      }
      int n=a.length;
      for(int i=0;i<n-1;i++){

         int indexOfMin=i;
        
         for(int j=i+1;j<n;j++){
            if(a[j] < a[indexOfMin]){
                indexOfMin = j;
            }
         }
         swap(a, i, indexOfMin);
      }
    }
    private static void swap(int a[],int i,int j){
      int temp = a[i];
      a[i] = a[j];
      a[j] = temp;
    }
    public static void main(String[] args) {
        int a[]={7,2,91,77,3,0,0};
        sort(a);
        for(int i:a){
            System.out.print(i+" ");
        }
    }
}
