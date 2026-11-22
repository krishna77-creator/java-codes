package com.krishna.prep.leetcodes;

public class BestStock {
    public static int maxProfit(int[] price){
        int best = 0;
        for (int i = 0; i <price.length; i++){
            for (int j =i+1; j<price.length;j++){
                int profit = price[j] - price[i];
                if (best< profit){
                    best = profit;
                }
            }
        }
        return best;
    }

    public static void main(String[] args) {
        int[] prices = {0, 1, 4, 6, 3};
        System.out.println(maxProfit(prices));
    }
}
