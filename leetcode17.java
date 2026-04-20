public class leetcode17 {
    int maxwater(int a[])
    { 
       int s=0;
       int e=a.length-1;
       int max=0;
       while(s<e)
       {
         int min=Math.min(a[s],a[e]);
         int width=e-s;
         int area=width*min;
         if(area>max)
         {
            max=area;
         }  
           if(a[s]<a[e]) 
           {
             s++;
           }
           else
           {
             e--;
           }
       } 
       return max;
    }
    
    int water(int a[])
    {
        int max=0;
        for(int i=0;i<a.length;i++)
        {
           for(int j=i+1;j<a.length;j++)
           {
             int min=Math.min(a[i], a[j]);
             int width=j-i;
             int maxcapacity=width*min;
             if(maxcapacity>max)
             {
                max=maxcapacity;
             }
           }
        }
        return max;
    }
    public static void main(String[] args) {
        int a[]={2,4,2,3,4};
        leetcode17 obj=new leetcode17();
        System.out.println("max = "+obj.water(a));
    }
}
