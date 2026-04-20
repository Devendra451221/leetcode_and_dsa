import java.util.HashMap;

public class leetsheet12 {
    // brute force
    // int subArraySumEqualsK(int a[],int k){
    //   int count=0;
    //   for(int i=0;i<a.length;i++){
    //     int sum=0;
    //     for(int j=i;j<a.length;j++){
    //         sum+=a[j];
    //         if(sum==k){
    //             count++;
    //         }
    //     }
    //   }
    //   return count;
    // }

    int subArraySumEqualsK(int a[],int k){
        int count=0;
        int prfxsum=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(0, 1);

        for(int i=0;i<a.length;i++){
            prfxsum+=a[i];
            
            int kminusprfxsum=prfxsum-k;
            if (hm.containsKey(kminusprfxsum)){
                count+=hm.get(kminusprfxsum);
            }
            if(!hm.containsKey(prfxsum)){
                hm.put(prfxsum, 1);
            }else{
                hm.replace(prfxsum, hm.get(prfxsum)+1);
            }

        }
        return count;
    }
    public static void main(String[] args) {
        int a[]={1,2,3,-3,1,1,1,4,2,-3};
        int b[]={2,3,-5,5,-5,1,4};
        leetsheet12 obj=new leetsheet12();
        System.out.println(obj.subArraySumEqualsK(b, 5));
    }
}
