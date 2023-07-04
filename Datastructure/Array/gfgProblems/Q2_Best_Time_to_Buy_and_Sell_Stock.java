package Array.gfgProblems;

/* 
Best Time to Buy and Sell Stock

Type I: At most one transaction is allowed

Given an array prices[] of length N, representing the prices of the stocks on different days, the task is to find the maximum profit possible for buying and selling the stocks on different days using transactions where at most one transaction is allowed.

Note: Stock must be bought before being sold.

Examples:

Input: prices[] = {7, 1, 5, 3, 6, 4]
Output: 5 */
public class Q2_Best_Time_to_Buy_and_Sell_Stock {
    public static void main(String[] args) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println(max_profit(prices));
        System.out.println(limitless_stock(prices));
    }

    // Type II: Infinite transactions are allowed
    private static int limitless_stock(int[] prices) {
        int n = prices.length;
        if (n < 2)
            return 0;
        int sellingDate = 0;
        int buyingDate = 0;
        int totalProfit = 0;
        for (int i = 1; i < n; i++) {
            if (prices[i] >= prices[i - 1])
                sellingDate++;
            else {
                totalProfit += (prices[sellingDate]
                        - prices[buyingDate]);
                sellingDate = buyingDate = i;
            }
        }
        totalProfit += (prices[sellingDate] - prices[buyingDate]);
        return totalProfit;
    }

    // Type I: At most one transaction is allowed
    private static int max_profit(int[] prices) {
        int max_profit1 = 0;
        int buy = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (buy > prices[i]) {
                buy = prices[i];
                System.out.println(buy + " " + prices[i]);
            } else if (prices[i] - buy > max_profit1) {
                max_profit1 = prices[i] - buy;
                System.out.println(buy + " " + prices[i]);
            }
        }
        return max_profit1;
    }

    // Type III: At most two transactions are allowed
}
// Time Complexity: O(N). Where N is the size of prices array.
// Auxiliary Space: O(1). We do not use any extra space.