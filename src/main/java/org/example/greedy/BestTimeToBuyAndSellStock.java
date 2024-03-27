package org.example.greedy;

/*
You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 */

public class BestTimeToBuyAndSellStock {

    public int solution(int[] prices) {

        if(prices == null || prices.length == 0)
            return 0;

        int minPrice = prices[0];
        int maxProfit = 0;
        int length = prices.length;

        for(int i = 1; i < length; i++){

            minPrice = Math.min(minPrice, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - minPrice);

        }

        return maxProfit;
    }
}
