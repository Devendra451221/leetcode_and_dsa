public class leetcode9 {
    void mergesort(int a[],int b[],int c[])
    {
     
        short i,j,k;
        i=j=k=0;
       while(i<a.length&&j<b.length)
       {
          if(a[i]<=b[j]) {
            c[k]=a[i];
            i++;
            k++;
         }
        else
        {
            c[k]=b[j];
            j++;
            k++;
        }
       }
       while (i<a.length) {
        c[k]=a[i];
        i++;
        k++;
       }
       while (j<b.length) {
        c[k]=b[j];
        j++;
        k++;
       }

    }
    double median(int a[],int b[])
    {
        int c[]=new int[a.length+b.length];
        double md;
        mergesort(a,b,c);
       int length=c.length;
       if(length%2==0)
       {
          double sum=c[((length-1)/2)];
         sum+=c[(((length-1)/2)+1)];
          md=(sum/2);
       }
       else
       {
       md = c[length / 2];
       }
       return md;
    }
    public static void main(String[] args) {
        int a[]={1,3};
        int b[]={2};
        leetcode9 obj=new leetcode9();
        System.out.println(" MEdian of arrays : "+obj.median(a,b));
    }
}
