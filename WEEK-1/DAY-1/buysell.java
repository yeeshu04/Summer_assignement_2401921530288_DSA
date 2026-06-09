package LEETCODE;
class buysell {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int max = 0;
        for(int i=1; i<prices.length; i++){
            if(prices[i]<min){
                min = prices[i];
            }
            else{
                int profit = prices[i] - min;
                   max = Math.max(max, profit);
            }
        }
        return max;
    }
}




// VSCODE


// package LEETCODE;
// public class buysell {

//     public static int maxProfit(int[] prices) {
//         int minPrice = prices[0];
//         int maxProfit = 0;

//         for(int i = 1; i < prices.length;i++) {

//             if(prices[i] < minPrice) {
//                 minPrice = prices[i];
//             } else {
//                 int profit = prices[i] - minPrice;
//                 maxProfit = Math.max(maxProfit, profit);
//             }
//         }

//         return maxProfit;
//     }

//     public static void main(String[] args) {

//         int[] prices = {7, 1, 5, 3, 6, 4};

//         System.out.println(maxProfit(prices));
//     }
// }


// class Solution {
//     public int maxProfit(int[] prices) {
//         int left = 0 , right = 1;
//         int maxP = 0;
//         while(right<prices.length){
//             if(prices[left]<prices[right]){
//                 int profit = prices[right]- prices[left];
//                 maxP = Math.max(maxP , profit);
//             }else{
//                 left = right;
//             }
//             right++;
            
//         }
//         return maxP;
        
//     }
// }