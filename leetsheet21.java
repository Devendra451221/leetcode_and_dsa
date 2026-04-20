public class leetsheet21 {
    int noOfwaysToClimbStairs(int stairs){
        if(stairs==1){
            return 1;
        }
        int dp[]=new int[stairs+1];
        dp[1]=1;
        dp[2]=2;

        for(int i=3;i<=stairs;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[stairs];
    }
    public static void main(String[] args) {
        int stairs = 8;
        leetsheet21 obj=new leetsheet21();
        System.out.println("Number of ways to climb n stairs : "+obj.noOfwaysToClimbStairs(stairs));
    }
}
