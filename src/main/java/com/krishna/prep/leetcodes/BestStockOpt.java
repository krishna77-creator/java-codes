package com.krishna.prep.leetcodes;

public class BestStockOpt {
    public static int maxProfit(int[] price){
        int minPrice = price[0];
        int best = 0;
        for (int i = 0; i<price.length;i++){
            int profit = price[i] - minPrice;
            if(minPrice >= price[i]){
                minPrice = price[i];
            }
            if(profit>best){
                best = profit;
            }
        }
        return best;
    }

    public static void main(String[] args) {
        int[] prices = {7, 6, 4, 3, 1};
        System.out.println(maxProfit(prices));
    }
}
