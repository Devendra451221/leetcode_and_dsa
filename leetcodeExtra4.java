//Next Greater element by the Array

import java.util.Stack;

public class leetcodeExtra4 {
  int[] nxtGrtrElmnt(int a[]){
    Stack<Integer> st=new Stack<>();
    int ans[]=new int[a.length];
    ans[a.length-1]=0;
   
    st.push(a[a.length-1]);
    for(int i=a.length-2;i>=0;i--){
        int nxtdta=a[i];
        while (!st.isEmpty() && st.peek() <= nxtdta) {
            st.pop();
        }
        if(st.isEmpty()){
            ans[i]=0;
        }else //if(st.peek() > nxtdta) ye nhi ho to bhi chlega
        {
            ans[i]=st.peek();
        }
        st.push(nxtdta);
    }
    return ans;
  }
    public static void main(String[] args) {
     int a[]={2,7,4,3,5};
     leetcodeExtra4 obj=new leetcodeExtra4();
     for(int i:obj.nxtGrtrElmnt(a)){
        System.out.print(i+" ");
     }
 }
}
