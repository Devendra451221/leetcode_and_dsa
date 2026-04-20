public class leetcode100 {
    int bestTimeToBuyAndSellStocks(int price[]){
        int right[]=new int[price.length];
        right[price.length-1] = price[price.length-1];

        for(int i=price.length-2;i>0;i--){
            right[i] = Math.max(price[i], right[i+1]);
        }

        int max_profit = 0;
        for(int i=0;i<price.length;i++){
            int profit = right[i] - price[i]; 
            max_profit = Math.max(max_profit, profit);
        }

        return max_profit;
    }
    
    public static void main(String[] args) {
        
        int price[]={7,1,2,4,9,6,3};
        leetcode100 obj = new leetcode100();
        System.out.println("The maximum profit : "+obj.bestTimeToBuyAndSellStocks(price));
    }
}
