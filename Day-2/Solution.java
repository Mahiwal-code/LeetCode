class Solution {
    public static int maxProfit(int[] arr) {
        int maxPrice = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            minPrice = Math.min(minPrice, arr[i]);
            maxPrice = Math.max(maxPrice, arr[i] - minPrice);
        }
        return maxPrice;
        
    }

    public static void main(String args[]){
        int[] arr={2,4,1};

        System.out.println(maxProfit(arr)); 


    }
}


// class Solution {
//     public static int maxProfit(int[] prices) {
//         int max_profit = 0;
//         int profit = 0;
//         for(int i = 0; i < prices.length -1; i++){
//             for(int j = i+1; j < prices.length; j++){
//                 profit = prices[j] - prices[i];
//                 if(max_profit < profit){
//                     max_profit = profit;
//                 }
//             }
//         }
//         return max_profit;
//     }
// }