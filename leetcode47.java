public class leetcode47 {
    String reveStringwithoneSpace(String s)
    {
        String sarr[]=s.split("\\s+");
        StringBuilder sb=new StringBuilder("");
        for(int i=sarr.length-1;i>=0;i--)
        {
            sb.append(sarr[i]+" ");
        } 
        String ans=sb.toString();
        ans=ans.trim();
        return ans;
    }
    public static void main(String[] args) {
        String s="  The Sky  is     Blue";
        leetcode47 obj=new leetcode47();
        System.out.println(obj.reveStringwithoneSpace(s));
    }
}
