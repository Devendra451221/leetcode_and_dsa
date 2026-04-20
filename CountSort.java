public class CountSort {
  public static void sort(int a[]){
    if(a.length==1){
        return;
    }
    int count[]=new int[max(a)+1];
    for(int i=0;i<a.length;i++){
        count[a[i]] += 1;
    }
    int j=0;
    for(int i=0;i<count.length;i++){
        while (count[i] > 0) {
            a[j++] = i;
            count[i]-=1;
        }
    }
  }
  private static int max(int a[]){
    int max=a[0];
    for(int i=1;i<a.length;i++){
        if(max < a[i]){
            max=a[i];
        }
    }
    return max;
  }
  public static void main(String[] args) {
    int a[]={3,1,9,7,1,2,4};
    sort(a);
    for(int i:a){
        System.out.print(i+" ");
    }  
}
}
